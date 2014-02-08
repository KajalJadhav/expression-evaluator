package kajaljad.expressionevaluator.lib;

import java.util.*;

/**
 * Created by kajaljad on 2/7/14.
 */
public class ExpressionParser2 {
    class Token {
    }

    IExpression left, right;
    Operator operator;

    List<BracketExpression> brackets;

    public IExpression parse(String text) {

        return parseInternal(text, new ArrayList<BracketExpression>());
    }

    private IExpression parseInternal(String text, List<BracketExpression> brackets) {
        this.brackets = brackets;
        String processedText = readBrackets(text);

        List<String> parts = Arrays.asList(processedText.split(" "));
        int index = 0;

        while (index < parts.size()) {

            String token = parts.get(index);
            readToken(token);
            if (isReady()) resetRoot(new OperationExpression(left, operator, right));

            index++;
        }
        if (operator != null) throw new RuntimeException("operator " + operator + " left without operands");
        return left;
    }

    private String readBrackets(String text) {
        String content = text;
        int start, end;
        do {
            end = content.indexOf(')');
            start = end > 0 ? content.substring(0, end).lastIndexOf('(', end) : -1;
             if (start >= 0) {
                String subText = content.substring(start + 2, end - 1);
                BracketExpression expr = new BracketExpression(new ExpressionParser2().parseInternal(subText, brackets));
                brackets.add(expr);
                int location = brackets.size() - 1;
                String before, after;
                before =content.substring(0, start);
                after = end < content.length() - 1 ? content.substring(end + 1, content.length()) : "";
                content = before + "B" + location + after;
            }
        } while (start >= 0);
        return content;
    }

    private void resetRoot(IExpression expression) {
        left = expression;
        right = null;
        operator = null;
    }

    private Boolean isReady() {
        return left != null && right != null && operator != null;
    }

    private void readToken(String text) {

        if (text.charAt(0) == 'B') {
            int location = Integer.parseInt(text.split("B")[1]);
            BracketExpression expr = brackets.get(location);
            if (left == null) left = expr;
            else right = expr;
            return;
        }
        try {
            ValueExpression value = new ValueExpression(Double.parseDouble(text));
            if (left == null) left = value;
            else right = value;
        } catch (NumberFormatException e) {
            operator = Operator.parse(text.charAt(0));
        }
    }
}
