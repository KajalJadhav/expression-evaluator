package kajaljad.expressionevaluator.cli;

import kajaljad.expressionevaluator.lib.ExpressionEvaluator;

public class ExpressionEvaluatorClient {
    public static void main(String[] args) {
        ExpressionEvaluator ee = new ExpressionEvaluator(args[0]);
        int result;
        try {
            result = ee.calculation();
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Error");
        }
    }
}
