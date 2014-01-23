package kajaljad.expressionevaluator.lib;

import org.junit.Test;

import java.rmi.server.ExportException;

import static junit.framework.Assert.assertEquals;

public class ExpressionEvaluatorTest {

    @Test
    public void forWrongInput() throws Exception {
        String expression = "12345";
        ExpressionEvaluator ee = new ExpressionEvaluator();
        double expected = 12345;
        double actual = ee.calculation(expression);
        assertEquals(expected, actual);
    }

    @Test
    public void forAdditionOfTwoNumbers() throws Exception {
        ExpressionEvaluator ee = new ExpressionEvaluator();
        double expected = 3;
        double actual = ee.calculation("1 + 2");
        assertEquals(expected, actual);
    }

    @Test
    public void forAdditionOfTwoNegativeNumbers() throws Exception {
        ExpressionEvaluator ee = new ExpressionEvaluator();
        double expected = -3;
        double actual = ee.calculation("-1 + -2");
        assertEquals(expected, actual);
    }

    @Test
    public void forSubtractionOfTwoNumbers() throws Exception {
        ExpressionEvaluator ee = new ExpressionEvaluator();
        double expected = 1;
        double actual = ee.calculation("2 - 1");
        assertEquals(expected, actual);
    }

    @Test
    public void forSubtractionOfTwoNegativeNumbers() throws Exception {
        ExpressionEvaluator ee = new ExpressionEvaluator();
        double expected = -9;
        double actual = ee.calculation("-10 - -1");
        assertEquals(expected, actual);
    }

    @Test
    public void forMultiplicationOfTwoNumbers() throws Exception {
        ExpressionEvaluator ee = new ExpressionEvaluator();
        double expected = 2;
        double actual = ee.calculation("1 * 2");
        assertEquals(expected, actual);
    }

    @Test
    public void forMultiplicationOfTwoNumbersWithNegativeNumber() throws Exception {
        ExpressionEvaluator ee = new ExpressionEvaluator();
        double expected = -20;
        double actual = ee.calculation("10 * -2");
        assertEquals(expected, actual);
    }

    @Test
    public void forDivisionOfTwoNumbers() throws Exception {
        ExpressionEvaluator ee = new ExpressionEvaluator();
        double expected = 5;
        double actual = ee.calculation("10 / 2");
        assertEquals(expected, actual);
    }

    @Test
    public void forDivisionOfTwoNumbersWithNegativeNumber() throws Exception {
        ExpressionEvaluator ee = new ExpressionEvaluator();
        double expected = -5;
        double actual = ee.calculation("-10 / 2");
        assertEquals(expected, actual);
    }

    @Test
    public void forExponentialOfNumber() throws Exception {
        ExpressionEvaluator ee = new ExpressionEvaluator();
        double expected = 100;
        double actual = ee.calculation("10 ^ 2");
        assertEquals(expected, actual);
    }

    @Test
    public void forExponentialOfNegativeNumber() throws Exception {
        ExpressionEvaluator ee = new ExpressionEvaluator();
        double expected = 100;
        double actual = ee.calculation("-10 ^ 2");
        assertEquals(expected, actual);
    }

    @Test
    public void forAdditionOfThreeNumbers() throws Exception {
        ExpressionEvaluator ee = new ExpressionEvaluator();
        double expected = 6;
        double actual = ee.calculation("2 + 2 + 2");
        assertEquals(expected, actual);
    }

    @Test
    public void forAdditionOfThreeNumbersWithNegativeNumber() throws Exception {
        ExpressionEvaluator ee = new ExpressionEvaluator();
        double expected = 2;
        double actual = ee.calculation("2 + 2 + -2");
        assertEquals(expected, actual);
    }

    @Test
    public void forSubtractionOfThreeNumbers() throws Exception {
        ExpressionEvaluator ee = new ExpressionEvaluator();
        double expected = 6;
        double actual = ee.calculation("10 - 2 - 2");
        assertEquals(expected, actual);
    }

    @Test
    public void forTwoOperatorsAndThreeOperands() throws Exception {
        ExpressionEvaluator ee = new ExpressionEvaluator();
        double expected = 9;
        double actual = ee.calculation("1 + 2 * 3");
        assertEquals(expected, actual);
    }

    @Test
    public void forTwoOperatorsAndThreeOperandsWithNegativeValue() throws Exception {
        ExpressionEvaluator ee = new ExpressionEvaluator();
        double expected = -9;
        double actual = ee.calculation("1 + 2 * -3");
        assertEquals(expected, actual);
    }

    @Test
    public void forThreeOperatorsAndFourOperands() throws Exception {
        ExpressionEvaluator ee = new ExpressionEvaluator();
        double expected = 5;
        double actual = ee.calculation("1 + 2 * 3 - 4");
        assertEquals(expected, actual);
    }

    @Test
    public void forFourOperatorsAndFiveOperands() throws Exception {
        ExpressionEvaluator ee = new ExpressionEvaluator();
        double expected = 1;
        double actual = ee.calculation("1 + 2 * 3 - 4 / 5");
        assertEquals(expected, actual);
    }

    @Test
    public void forFiveOperatorsAndSixOperands() throws Exception {
        ExpressionEvaluator ee = new ExpressionEvaluator();
        double expected = 1;
        double actual = ee.calculation("1 + 2 * 3 - 4 / 5 ^ 6");
        assertEquals(expected, actual);
    }

    @Test
    public void forHandlingMultipleOperandsAndOperatorsWithNegativeValue() throws Exception {
        ExpressionEvaluator ee = new ExpressionEvaluator();
        double expected = 1;
        double actual = ee.calculation("1 + 2 * 3 - 4 / 5 ^ -6");
        assertEquals(expected, actual);
    }

    @Test
    public void forHandlingOperatorsAndOperandWithSingleBracket() throws Exception {
        ExpressionEvaluator ee = new ExpressionEvaluator();
        double expected = 6;
        double actual = ee.calculation("1 + ( 2 + 3 )");
        assertEquals(expected, actual);
    }

}