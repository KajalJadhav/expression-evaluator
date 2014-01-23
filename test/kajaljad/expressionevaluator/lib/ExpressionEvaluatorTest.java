package kajaljad.expressionevaluator.lib;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class ExpressionEvaluatorTest {

    @Test
    public void forWrongInput() throws Exception {
        ExpressionEvaluator ee = new ExpressionEvaluator();
        double expected = 12345;
        double actual = ee.calculation("12345");
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
    public void forSubtractionOfTwoNumbers() throws Exception {
        ExpressionEvaluator ee = new ExpressionEvaluator();
        double expected = 1;
        double actual = ee.calculation("2 - 1");
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
    public void forExponentialOfNumber() throws Exception {
        ExpressionEvaluator ee = new ExpressionEvaluator();
        double expected = 100;
        double actual = ee.calculation("10 ^ 2");
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

    @Test
    public void forHandlingOperatorsAndOperandsWithMultipleBrackets() throws Exception {
        ExpressionEvaluator ee = new ExpressionEvaluator();
        double expected = 11;
        double actual = ee.calculation("1 + ( 2 * 3 ) + ( 6 - 2 )");
        assertEquals(expected, actual);
    }

    @Test
    public void forCheckingDivisionOfNumberWhenOutputIsFloatingPoint() throws Exception {
        ExpressionEvaluator ee = new ExpressionEvaluator();
        double expected = 7.333333333333333;
        double actual = ee.calculation("22 / 3");
        assertEquals(expected, actual);
    }

    @Test
    public void forHandlingExponential() throws Exception {
        ExpressionEvaluator ee = new ExpressionEvaluator();
        double expected = 2.147483648E9;
        double actual = ee.calculation("2 ^ 31");
        assertEquals(expected, actual);
    }

    @Test
    public void forHandlingSingleNestedBrackets() throws Exception {
        ExpressionEvaluator ee = new ExpressionEvaluator();
        double expected = 8;
        double actual = ee.calculation("1 + ( 2 + ( 2 + 3 ) )");
        assertEquals(expected, actual);
    }

    @Test
    public void forHandlingMultipleBrackets() throws Exception {
        ExpressionEvaluator ee = new ExpressionEvaluator();
        double expected = 17;
        double actual = ee.calculation("1 + ( ( 2 * 3 ) + ( 10 / 5 ) * 2 )");
        assertEquals(expected, actual);
    }

    @Test
    public void forHandlingMultipleNestedBrackets() throws Exception {
        ExpressionEvaluator ee = new ExpressionEvaluator();
        double expected = 65;
        double actual = ee.calculation("1 + ( ( 2 * 3 ) + ( 10 / 5 ) ^ 2 )");
        assertEquals(expected, actual);
    }

    @Test
    public void forHandlingNestedBracketsInNestedBrackets() throws Exception {
        ExpressionEvaluator ee = new ExpressionEvaluator();
        double expected = 17;
        double actual = ee.calculation("1 + ( ( 2 * ( 4 - 3 ) ) + ( 10 / 5 ) ^ 2 )");
        assertEquals(expected, actual);
    }

    @Test
    public void forHandlingNestedBracketsInNestedBracketsWithNegativeNumbers() throws Exception {
        ExpressionEvaluator ee = new ExpressionEvaluator();
        double expected = 1;
        double actual = ee.calculation("1 + ( ( 2 * ( 4 - 3 ) ) + ( 10 / -5 ) ^ 2 )");
        assertEquals(expected, actual);
    }

    @Test
    public void forNegativeNumberWithoutSpace() throws Exception {
        ExpressionEvaluator ee = new ExpressionEvaluator();
        double expected = 5;
        double actual = ee.calculation("10+-5");
        assertEquals(expected, actual);
    }

    @Test
    public void forSingleBracketWithMultipleSpace() throws Exception {
        ExpressionEvaluator ee = new ExpressionEvaluator();
        double expected = 7;
        double actual = ee.calculation("1+(  2*3)");
        assertEquals(expected, actual);
    }

    @Test
    public void forSingleBraketsWithoutSpace() throws Exception {
        ExpressionEvaluator ee = new ExpressionEvaluator();
        double expected = 7;
        double actual = ee.calculation("1+(2*3)");
        assertEquals(expected, actual);
    }

    @Test
    public void forNestedBracketsWithoutSpaces() throws Exception {
        ExpressionEvaluator ee = new ExpressionEvaluator();
        double expected = 15;
        double actual = ee.calculation("1+(2*(3+4))");
        assertEquals(expected, actual);
    }

    @Test
    public void forAdditionOfTwoFloatingPoints() throws Exception {
        ExpressionEvaluator ee = new ExpressionEvaluator();
        double expected = 3.0;
        double actual = ee.calculation("1.0+2.0");
        assertEquals(expected, actual);
    }
}