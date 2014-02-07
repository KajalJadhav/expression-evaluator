package kajaljad.expressionevaluator.lib;

import java.util.HashMap;
import java.util.Map;

interface Evaluate {
    double evaluate(Double number1, Double number2);
}

public class Operations {
    Map<String, Evaluate> operationMap = new HashMap<String, Evaluate>();

    public Operations() {
        operationMap.put("+", new Evaluate() {
            public double evaluate(Double number1, Double number2) {
                return number1 + number2;
            }
        });
        operationMap.put("-", new Evaluate() {
            public double evaluate(Double number1, Double number2) {
                return number1 - number2;
            }
        });
        operationMap.put("*", new Evaluate() {
            public double evaluate(Double number1, Double number2) {
                return number1 * number2;
            }
        });
        operationMap.put("/", new Evaluate() {
            public double evaluate(Double number1, Double number2) {
                return number1 / number2;
            }
        });
        operationMap.put("^", new Evaluate() {
            public double evaluate(Double number1, Double number2) {
                return Math.pow(number1, number2);
            }
        });
    }

    public Expression performOperations(Expression operand1, String operator, Expression operand2) {

        Double result = operationMap.get(operator).evaluate(operand1.getValue(), operand2.getValue());
        return new Expression(result);
    }

}