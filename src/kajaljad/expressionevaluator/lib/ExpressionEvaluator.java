package kajaljad.expressionevaluator.lib;

import java.util.ArrayList;

public class ExpressionEvaluator {
    public String expression;

    public ExpressionEvaluator(String expression) {
        this.expression = expression;
    }

    public int calculation() {
        String[] resultArray = this.expression.split(" ");
        int result = 0;
        Operations operations = new Operations();
        ArrayList<Integer> operands = new ArrayList<Integer>();
        ArrayList<String> operators = new ArrayList<String>();
        try {
            for (int i = 0; i < resultArray.length; i = i + 2) {
                operands.add(Integer.valueOf(resultArray[i]));
                if (i == resultArray.length - 1)
                    break;
                operators.add(resultArray[i + 1]);
            }
            result = operands.get(0);
            for (int i = 1; i < operands.size(); ++i)
                result = operations.performOperations(operators.get(i - 1), result, operands.get(i));
        } catch (Exception e) {
            System.err.println("Error");
        }
        return result;
    }
}