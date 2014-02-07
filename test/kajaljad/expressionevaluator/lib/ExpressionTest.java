package kajaljad.expressionevaluator.lib;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExpressionTest {
    @Test
    public void forEvaluatingSimpleExpression() {
        Expression expression = new Expression(new Expression(2d), "+", new Expression(3d));
        Double expected = 5d;
        Double actual = expression.evaluate().getValue();
        assertEquals(expected, actual);
    }
}
