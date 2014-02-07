package kajaljad.expressionevaluator.cli;

import kajaljad.expressionevaluator.lib.ExpressionEvaluator;

public class ExpressionEvaluatorClient  {
    public static void main(String[] args){
        ExpressionEvaluator ee = new ExpressionEvaluator();
        Double result = ee.calculate(args[0]);
        System.out.println(result);
    }
}
