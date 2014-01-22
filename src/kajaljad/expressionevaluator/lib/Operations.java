package kajaljad.expressionevaluator.lib;

import java.util.HashMap;
import java.util.Map;

interface Evaluate {
    int evaluate(int number1, int number2);
}
public class Operations {
    Map<String,Evaluate> operationMap;

    public Operations() {
        Map<String,Evaluate> map = new HashMap<String, Evaluate>();

        map.put("+", new Evaluate() {
            @Override
            public int evaluate(int number1, int number2) {
                return number1 + number2;
            }
        });
        map.put("-", new Evaluate() {
            @Override
            public int evaluate(int number1, int number2) {
                return number1 - number2;
            }
        });
        map.put("*", new Evaluate() {
            @Override
            public int evaluate(int number1, int number2) {
                return number1 * number2;
            }
        });
        map.put("/", new Evaluate() {
            @Override
            public int evaluate(int number1, int number2) {
                return number1 / number2;
            }
        });
        map.put("^", new Evaluate() {
            @Override
            public int evaluate(int number1, int number2) {
                return (int)Math.pow(number1, number2);
            }
        });
        this.operationMap = map;
    }
    public int performOperations(String operator, int number1, int number2) {
        return operationMap.get(operator).evaluate(number1,number2);
    }

}