package kajaljad.expressionevaluator.lib;

/**
 * Created by kajaljad on 2/7/14.
 */
public class Divide implements Operator {
    @Override
    public Double operate(double left, double right) {
        return left/right;
    }
}
