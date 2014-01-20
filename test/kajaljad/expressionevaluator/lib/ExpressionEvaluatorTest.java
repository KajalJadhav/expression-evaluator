package kajaljad.expressionevaluator.lib;

import org.junit.Test;
import static junit.framework.Assert.assertEquals;

public class ExpressionEvaluatorTest {
    String input = "Hello World";

    @Test
    public void testCalculation() throws Exception {
        ExpressionEvaluator ee = new ExpressionEvaluator(input);
        String expected = "Hello World";
        String actual = ee.calculation();
        assertEquals(expected, actual);
    }

    @Test
    public void testCalculationForWrongInput() throws Exception {
        ExpressionEvaluator ee = new ExpressionEvaluator("I M Here");
        String expected = "I M Here";
        String actual = ee.calculation();
        assertEquals(expected, actual);
    }
}
