package kajaljad.expressionevaluator.lib;

/**
 * Created by kajaljad on 2/7/14.
 */
public class Minus implements Operator {
    @Override
    public Double operate(double left, double right) {
        return left - right;
    }
}
