package kajaljad.expressionevaluator.cli;

import kajaljad.expressionevaluator.lib.ExpressionEvaluator;

public class ExpressionEvaluatorClient  {
    public static void main(String[] args){
        ExpressionEvaluator ee = new ExpressionEvaluator();
        double result = ee.calculation(args[0]);
        System.out.println(result);
    }
}
