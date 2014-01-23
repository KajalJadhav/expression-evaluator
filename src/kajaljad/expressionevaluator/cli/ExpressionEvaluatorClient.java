package kajaljad.expressionevaluator.cli;

import kajaljad.expressionevaluator.lib.ExpressionEvaluator;

public class ExpressionEvaluatorClient {
    public static void main(String[] args) {
        ExpressionEvaluator ee = new ExpressionEvaluator();
        double result = ee.calculation(args[0]);
        if (result % 1 == 0) {
            System.out.println((int) result);
            return;
        }
        System.out.println(result);

    }
}
