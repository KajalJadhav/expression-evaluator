package kajaljad.expressionevaluator.lib;

import java.util.ArrayList;
import java.util.List;

public class ExpressionEvaluator {
    private String expression;

    public ExpressionEvaluator(String expression) {
        this.expression = expression;
    }

    private double calculateExpression(String expression) {
        String[] expressionParts = expression.trim().split(" ");
        List<Double> operands = new ArrayList<Double>();
        List<String> operators = new ArrayList<String>();
        filterOperandsAndOperators(expressionParts,operators,operands);
        return calculate(operators, operands);
    }

    private double calculate(List<String> operators,List<Double> operands) {
        Operations operations = new Operations();
        double number1 = operands.get(0);
        for (int i = 0; i < operators.size(); i++) {
            String operator = operators.get(i);
            double number2 = operands.get(i + 1);
            number1 = operations.performOperations(operator,number1,number2);
        }
        return number1;
    }

    public double calculateExpression() {
        return calculateExpression(this.expression);
    }

    private void filterOperandsAndOperators(String[] expressionParts, List<String> operators, List<Double> operands) {
        for (String expressionPart : expressionParts) {
            try {
                operands.add(Double.parseDouble(expressionPart));
            } catch (Exception e) {
                operators.add(expressionPart);
            }
        }
    }

    private double calculation(String inputExpression) {
        StringBuilder expression = new StringBuilder(inputExpression);
        if(expression.indexOf("(") > -1) {
            calculateBrackets(expression);
            return calculation(expression.toString());
        }
        return calculateExpression(expression.toString());
    }

    public double calculation() {
        String expressionWithoutSpaces = this.parseInput();
        return calculation(expressionWithoutSpaces);
    }

    private void calculateBrackets(StringBuilder expression) {
        int startingIndex = -1;
        int endingIndex = -1;
        double result;
        for (int i = 0; i < expression.length(); i++) {
            if ('(' == expression.charAt(i))
                startingIndex = i;
            if (')' == expression.charAt(i)) {
                endingIndex = i;
                break;
            }
        }
        String expressionInsideBrackets = expression.substring(startingIndex + 1,endingIndex);
        result = calculateExpression(expressionInsideBrackets);
        expression.replace(startingIndex,endingIndex + 1,Double.toString(result));
    }

    public String parseInput() {
        String expression = this.expression;
        expression = expression.replaceAll(" +","");
        return expression.replaceAll("\\+", " + ")
                .replaceAll("\\-", " - ")
                .replaceAll("\\*", " * ")
                .replaceAll("/", " / ")
                .replaceAll("\\^", " ^ ")
                .replaceAll("\\(", "( ")
                .replaceAll("\\)"," )")
                .replaceAll("  - ", " -")
                .replaceFirst("^ - ", "-");
    }
}
