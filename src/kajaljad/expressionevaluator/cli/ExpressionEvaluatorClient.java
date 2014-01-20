package kajaljad.expressionevaluator.cli;

import kajaljad.expressionevaluator.lib.ExpressionEvaluator;

public class ExpressionEvaluatorClient {
    public static void main(String[] args) {
        ExpressionEvaluator ee = new ExpressionEvaluator(args[0]);
        String result = ee.calculation();
        System.out.println(result);
    }
}
