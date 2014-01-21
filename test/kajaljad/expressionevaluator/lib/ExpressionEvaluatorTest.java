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

    @Test
    public void forAdditionOfTwoNegativeNumbers() throws Exception {
        ExpressionEvaluator ee = new ExpressionEvaluator("-1 + -2");
        int expected = -3;
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

    @Test
    public void forSubtractionOfTwoNumbers() throws Exception {
        ExpressionEvaluator ee = new ExpressionEvaluator("2 - 1");
        int expected = 1;
        int actual = ee.calculation();
        assertEquals(expected,actual);
    }

    @Test
    public void forSubtractionOfTwoNegativeNumbers() throws Exception {
        ExpressionEvaluator ee = new ExpressionEvaluator("-10 - -1");
        int expected = -9;
        int actual = ee.calculation();
        assertEquals(expected,actual);
    }

    @Test
    public void forMultiplicationOfTwoNumbers() throws Exception {
        ExpressionEvaluator ee = new ExpressionEvaluator("1 * 2");
        int expected = 2;
        int actual = ee.calculation();
        assertEquals(expected,actual);
    }

    @Test
    public void forMultiplicationOfTwoNumbersWithNegativeNumber() throws Exception {
        ExpressionEvaluator ee = new ExpressionEvaluator("10 * -2");
        int expected = -20;
        int actual = ee.calculation();
        assertEquals(expected,actual);
    }

    @Test
    public void forDivisionOfTwoNumbers() throws Exception {
        ExpressionEvaluator ee = new ExpressionEvaluator("10 / 2");
        int expected = 5;
        int actual = ee.calculation();
        assertEquals(expected,actual);
    }

    @Test
    public void forDivisionOfTwoNumbersWithNegativeNumber() throws Exception {
        ExpressionEvaluator ee = new ExpressionEvaluator("-10 / 2");
        int expected = -5;
        int actual = ee.calculation();
        assertEquals(expected,actual);
    }

    @Test
    public void forExponentialOfNumber() throws Exception {
        ExpressionEvaluator ee = new ExpressionEvaluator("10 ^ 2");
        int expected = 100;
        int actual = ee.calculation();
        assertEquals(expected,actual);
    }

    @Test
    public void forExponentialOfNegativeNumber() throws Exception {
        ExpressionEvaluator ee = new ExpressionEvaluator("-10 ^ 2");
        int expected = 100;
        int actual = ee.calculation();
        assertEquals(expected,actual);
    }
}