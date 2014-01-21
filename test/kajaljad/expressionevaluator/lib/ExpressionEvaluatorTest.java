package kajaljad.expressionevaluator.lib;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class ExpressionEvaluatorTest {

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void forWrongInput() {
        ExpressionEvaluator ee = new ExpressionEvaluator("12345");
        int expected = 12345;
        int actual = ee.calculation();
        assertEquals(expected, actual);
    }

    @Test
    public void forAdditionOfTwoNumbers() throws Exception {
        ExpressionEvaluator ee = new ExpressionEvaluator("1 + 2");
        int expected = 3;
        int actual = ee.calculation();
        assertEquals(expected, actual);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void forConditionIfOnlyOneOperandIsGiven() {
        ExpressionEvaluator ee = new ExpressionEvaluator("1 + ");
        int expected = 10;
        int actual = ee.calculation();
        assertEquals(expected, actual);
    }
}