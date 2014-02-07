package kajaljad.expressionevaluator.lib;

import java.util.ArrayList;
import java.util.List;

public class ExpressionEvaluator {

    private ExpressionParser expressionParser = new ExpressionParser();

    private Expression calculateExpression(String expression) {
        String[] expressionParts = expression.trim().split(" ");
        List<Double> operands = new ArrayList<Double>();
        List<String> operators = new ArrayList<String>();
        filterOperandsAndOperators(expressionParts, operators, operands);
        return calculate(operators, operands);
    }

    private Expression calculate(List<String> operators, List<Double> operands) {
        Expression number1 = new Expression(operands.get(0));
        for (int i = 0; i < operators.size(); i++) {
            String operator = operators.get(i);
            Expression number2 = new Expression(operands.get(i + 1));
            number1 = new Expression(number1, operator, number2).evaluate();
        }
        return number1;
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

    public Double calculate(String expr) {
        String newExpression = expressionParser.parseInput(expr);
        StringBuilder expression = new StringBuilder(newExpression);
        if (expression.indexOf("(") > -1) {
            calculateBrackets(expression);
            return calculate(expression.toString());
        }
        return Double.parseDouble(calculateExpression(expression.toString()).toString());
    }

    private void calculateBrackets(StringBuilder expression) {
        int startingIndex = -1;
        int endingIndex = -1;
        Expression result;
        for (int i = 0; i < expression.length(); i++) {
            if ('(' == expression.charAt(i))
                startingIndex = i;
            if (')' == expression.charAt(i)) {
                endingIndex = i;
                break;
            }
        }
        String expressionInsideBrackets = expression.substring(startingIndex + 1, endingIndex);
        result = calculateExpression(expressionInsideBrackets);
        expression.replace(startingIndex, endingIndex + 1, result.toString());
    }

}
