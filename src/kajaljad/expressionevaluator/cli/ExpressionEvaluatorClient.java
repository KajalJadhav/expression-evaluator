package kajaljad.expressionevaluator.cli;

import kajaljad.expressionevaluator.lib.Expression;
import kajaljad.expressionevaluator.lib.ExpressionEvaluator;

public class ExpressionEvaluatorClient  {
    public static void main(String[] args){
        ExpressionEvaluator ee = new ExpressionEvaluator();
        Double result = ee.calculation(args[0]);
        System.out.println(result);
    }
}
