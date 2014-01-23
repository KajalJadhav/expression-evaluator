package kajaljad.expressionevaluator.lib;

import java.util.HashMap;
import java.util.Map;

interface Evaluate {
    double evaluate(double number1, double number2);
}
public class Operations {
    Map<String,Evaluate> operationMap;

    public Operations() {
        Map<String,Evaluate> map = new HashMap<String, Evaluate>();

        map.put("+", new Evaluate() {
            @Override
            public double evaluate(double number1, double number2) {
                return number1 + number2;
            }
        });
        map.put("-", new Evaluate() {
            @Override
            public double evaluate(double number1, double number2) {
                return number1 - number2;
            }
        });
        map.put("*", new Evaluate() {
            @Override
            public double evaluate(double number1, double number2) {
                return number1 * number2;
            }
        });
        map.put("/", new Evaluate() {
            @Override
            public double evaluate(double number1, double number2) {
                return number1 / number2;
            }
        });
        map.put("^", new Evaluate() {
            @Override
            public double evaluate(double number1, double number2) {
                return Math.pow(number1, number2);
            }
        });
        this.operationMap = map;
    }
    public double performOperations(String operator, double number1, Double number2) {
        return operationMap.get(operator).evaluate(number1,number2);
    }

}