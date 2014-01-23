package kajaljad.expressionevaluator.lib;

import java.util.ArrayList;

public class ExpressionEvaluator {
    public double calculate(String[] resultArray) {
        double result = 0;
        Operations operations = new Operations();
        ArrayList<Double> operands = new ArrayList<Double>();
        ArrayList<String> operators = new ArrayList<String>();
        for (int i = 0; i < resultArray.length; i = i + 2) {
            operands.add(Double.valueOf(resultArray[i]));
            if (i == resultArray.length - 1)
                break;
            operators.add(resultArray[i + 1]);
        }
        result = operands.get(0);
            for (int i = 1; i < operands.size(); ++i)
                result = operations.performOperations(operators.get(i - 1), result, operands.get(i));
            return result;
        }

    public double calculation(String expression) {
        StringBuilder originalString = new StringBuilder(expression);
        int startingIndex = 0;
        int endingIndex = 0;
        double result = 0;
        String[] resultArray;
        for (int i = 0; i < originalString.length(); i++) {
            if ('(' == originalString.charAt(i))
                startingIndex = i;
            if (')' == originalString.charAt(i)){
                endingIndex = i;
                break;
            }
        }
        if (startingIndex != 0) {
            String singleOperation = originalString.substring(startingIndex + 2,endingIndex);
            String tempResultString = singleOperation;
            resultArray = tempResultString.split(" ");
        } else {
            resultArray = originalString.toString().split(" ");
        }
        result = calculate(resultArray);
        if (startingIndex != 0) {
            originalString.replace(startingIndex,endingIndex + 1,Double.toString(result));
            return calculation(originalString.toString());
        }
        return result;
    }
}
