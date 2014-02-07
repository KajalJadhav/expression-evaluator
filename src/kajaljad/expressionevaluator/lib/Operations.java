package kajaljad.expressionevaluator.lib;

import java.util.HashMap;
import java.util.Map;

interface Evaluate {
    double evaluate(double number1, double number2);
}
public class Operations {
    Map<String,Evaluate> operationMap =new HashMap<String, Evaluate>();

    public Operations() {

        operationMap.put("+", new Evaluate() {
            @Override
            public double evaluate(double number1, double number2) {
                return number1 + number2;
            }
        });
        operationMap.put("-", new Evaluate() {
            @Override
            public double evaluate(double number1, double number2) {
                return number1 - number2;
            }
        });
        operationMap.put("*", new Evaluate() {
            @Override
            public double evaluate(double number1, double number2) {
                return number1 * number2;
            }
        });
        operationMap.put("/", new Evaluate() {
            @Override
            public double evaluate(double number1, double number2) {
                return number1 / number2;
            }
        });
        operationMap.put("^", new Evaluate() {
            @Override
            public double evaluate(double number1, double number2) {
                return Math.pow(number1, number2);
            }
        });
    }
    public double performOperations(String operator, double number1, double number2) {
        return operationMap.get(operator).evaluate(number1,number2);
    }

}