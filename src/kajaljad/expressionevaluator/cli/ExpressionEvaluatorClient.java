package kajaljad.expressionevaluator.cli;

import kajaljad.expressionevaluator.lib.ExpressionEvaluator;
import kajaljad.expressionevaluator.lib.IExpression;

public class ExpressionEvaluatorClient {
    public static void main(String[] args) {
        ExpressionEvaluator ee = new ExpressionEvaluator();
        IExpression expression = ee.createExpression(args[0]);
        System.out.println(expression.evaluate());
    }
}
