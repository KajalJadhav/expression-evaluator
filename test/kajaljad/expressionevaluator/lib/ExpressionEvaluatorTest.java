package kajaljad.expressionevaluator.lib;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class ExpressionEvaluatorTest {

    @Test
    public void forWrongInput() throws Exception {
        String expression = "12345";
        ExpressionEvaluator ee = new ExpressionEvaluator(expression);
        double expected = 12345;
        double actual = ee.calculation();
        assertEquals(expected, actual);
    }

    @Test
    public void forAdditionOfTwoNumbers() throws Exception {
        String expression = "1 + 2";
        ExpressionEvaluator ee = new ExpressionEvaluator(expression);
        double expected = 3;
        double actual = ee.calculation();
        assertEquals(expected, actual);
    }

    @Test
    public void forAdditionOfTwoNegativeNumbers() throws Exception {
        String expression = "-1 + -2";
        ExpressionEvaluator ee = new ExpressionEvaluator(expression);
        double expected = -3;
        double actual = ee.calculation();
        assertEquals(expected, actual);
    }

    @Test
    public void forSubtractionOfTwoNumbers() throws Exception {
        String expression = "2 - 1";
        ExpressionEvaluator ee = new ExpressionEvaluator(expression);
        double expected = 1;
        double actual = ee.calculation();
        assertEquals(expected, actual);
    }

    @Test
    public void forSubtractionOfTwoNegativeNumbers() throws Exception {
        String expression = "-10 - -1";
        ExpressionEvaluator ee = new ExpressionEvaluator(expression);
        double expected = -9;
        double actual = ee.calculation();
        assertEquals(expected, actual);
    }

    @Test
    public void forMultiplicationOfTwoNumbers() throws Exception {
        String expression = "1 * 2";
        ExpressionEvaluator ee = new ExpressionEvaluator(expression);
        double expected = 2;
        double actual = ee.calculation();
        assertEquals(expected, actual);
    }

    @Test
    public void forMultiplicationOfTwoNumbersWithNegativeNumber() throws Exception {
        String expression = "10 * -2";
        ExpressionEvaluator ee = new ExpressionEvaluator(expression);
        double expected = -20;
        double actual = ee.calculation();
        assertEquals(expected, actual);
    }

    @Test
    public void forDivisionOfTwoNumbers() throws Exception {
        String expression = "10 / 2";
        ExpressionEvaluator ee = new ExpressionEvaluator(expression);
        double expected = 5;
        double actual = ee.calculation();
        assertEquals(expected, actual);
    }

    @Test
    public void forDivisionOfTwoNumbersWithNegativeNumber() throws Exception {
        String expression = "-10 / 2";
        ExpressionEvaluator ee = new ExpressionEvaluator(expression);
        double expected = -5;
        double actual = ee.calculation();
        assertEquals(expected, actual);
    }

    @Test
    public void forExponentialOfNumber() throws Exception {
        String expression = "10 ^ 2";
        ExpressionEvaluator ee = new ExpressionEvaluator(expression);
        double expected = 100;
        double actual = ee.calculation();
        assertEquals(expected, actual);
    }


    @Test
    public void forAdditionOfThreeNumbers() throws Exception {
        String expression = "2 + 2 + 2";
        ExpressionEvaluator ee = new ExpressionEvaluator(expression);
        double expected = 6;
        double actual = ee.calculation();
        assertEquals(expected, actual);
    }

    @Test
    public void forAdditionOfThreeNumbersWithNegativeNumber() throws Exception {
        String expression = "2 + 2 + -2";
        ExpressionEvaluator ee = new ExpressionEvaluator(expression);
        double expected = 2;
        double actual = ee.calculation();
        assertEquals(expected, actual);
    }

    @Test
    public void forExponentialOfNegativeNumber() throws Exception {
        String expression = "-10 ^ 2";
        ExpressionEvaluator ee = new ExpressionEvaluator(expression);
        double expected = 100;
        double actual = ee.calculation();
        assertEquals(expected, actual);
    }

    @Test
    public void forSubtractionOfThreeNumbers() throws Exception {
        String expression = "10 - 2 - 2";
        ExpressionEvaluator ee = new ExpressionEvaluator(expression);
        double expected = 6;
        double actual = ee.calculation();
        assertEquals(expected, actual);
    }

    @Test
    public void forTwoOperatorsAndThreeOperands() throws Exception {
        String expression = "1 + 2 * 3";
        ExpressionEvaluator ee = new ExpressionEvaluator(expression);
        double expected = 9;
        double actual = ee.calculation();
        assertEquals(expected, actual);
    }

    @Test
    public void forTwoOperatorsAndThreeOperandsWithNegativeValue() throws Exception {
        String expression = "1 + 2 * -3";
        ExpressionEvaluator ee = new ExpressionEvaluator(expression);
        double expected = -9;
        double actual = ee.calculation();
        assertEquals(expected, actual);
    }

    @Test
    public void forThreeOperatorsAndFourOperands() throws Exception {
        String expression = "1 + 2 * 3 - 4";
        ExpressionEvaluator ee = new ExpressionEvaluator(expression);
        double expected = 5;
        double actual = ee.calculation();
        assertEquals(expected, actual);
    }

    @Test
    public void forFourOperatorsAndFiveOperands() throws Exception {
        String expression = "1 + 2 * 3 - 4 / 5";
        ExpressionEvaluator ee = new ExpressionEvaluator(expression);
        double expected = 1;
        double actual = ee.calculation();
        assertEquals(expected, actual);
    }

    @Test
    public void forFiveOperatorsAndSixOperands() throws Exception {
        String expression = "1 + 2 * 3 - 4 / 5 ^ 6";
        ExpressionEvaluator ee = new ExpressionEvaluator(expression);
        double expected = 1;
        double actual = ee.calculation();
        assertEquals(expected, actual);
    }

    @Test
    public void forHandlingMultipleOperandsAndOperatorsWithNegativeValue() throws Exception {
        String expression = "1 + 2 * 3 - 4 / 5 ^ -6";
        ExpressionEvaluator ee = new ExpressionEvaluator(expression);
        double expected = 1;
        double actual = ee.calculation();
        assertEquals(expected, actual);
    }

    @Test
    public void forHandlingOperatorsAndOperandWithSingleBracket() throws Exception {
        String expression = "1 + ( 2 + 3 )";
        ExpressionEvaluator ee = new ExpressionEvaluator(expression);
        double expected = 6;
        double actual = ee.calculation();
        assertEquals(expected, actual);
    }

    @Test
    public void forHandlingOperatorsAndOperandsWithMultipleBrackets() throws Exception {
        String expression = "1 + ( 2 * 3 ) + ( 6 - 2 )";
        ExpressionEvaluator ee = new ExpressionEvaluator(expression);
        double expected = 11;
        double actual = ee.calculation();
        assertEquals(expected, actual);
    }

    @Test
    public void forCheckingDivisionOfNumberWhenOutputIsFloatingPoint() throws Exception {
        String expression = "22 / 3";
        ExpressionEvaluator ee = new ExpressionEvaluator(expression);
        double expected = 7.333333333333333;
        double actual = ee.calculation();
        assertEquals(expected, actual);
    }

    @Test
    public void forHandlingExponential() throws Exception {
        String expression = "2 ^ 31";
        ExpressionEvaluator ee = new ExpressionEvaluator(expression);
        double expected = 2.147483648E9;
        double actual = ee.calculation();
        assertEquals(expected, actual);
    }

    @Test
    public void forHandlingSingleNestedBrackets() throws Exception {
        String expression = "1 + ( 2 + ( 2 + 3 ) )";
        ExpressionEvaluator ee = new ExpressionEvaluator(expression);
        double expected = 8;
        double actual = ee.calculation();
        assertEquals(expected, actual);
    }

    @Test
    public void forHandlingMultipleBrackets() throws Exception {
        String expression = "1 + ( ( 2 * 3 ) + ( 10 / 5 ) * 2 )";
        ExpressionEvaluator ee = new ExpressionEvaluator(expression);
        double expected = 17;
        double actual = ee.calculation();
        assertEquals(expected, actual);
    }

    @Test
    public void forHandlingMultipleNestedBrackets() throws Exception {
        String expression = "1 + ( ( 2 * 3 ) + ( 10 / 5 ) ^ 2 )";
        ExpressionEvaluator ee = new ExpressionEvaluator(expression);
        double expected = 65;
        double actual = ee.calculation();
        assertEquals(expected, actual);
    }

    @Test
    public void forHandlingNestedBracketsInNestedBrackets() throws Exception {
        String expression = "1 + ( ( 2 * ( 4 - 3 ) ) + ( 10 / 5 ) ^ 2 )";
        ExpressionEvaluator ee = new ExpressionEvaluator(expression);
        double expected = 17;
        double actual = ee.calculation();
        assertEquals(expected, actual);
    }

    @Test
    public void forHandlingNestedBracketsInNestedBracketsWithNegativeNumbers() throws Exception {
        String expression = "1 + ( ( 2 * ( 4 - 3 ) ) + ( 10 / -5 ) ^ 2 )";
        ExpressionEvaluator ee = new ExpressionEvaluator(expression);
        double expected = 1;
        double actual = ee.calculation();
        assertEquals(expected, actual);
    }

    @Test
    public void forNegativeNumberWithoutSpace() throws Exception {
        String expression = "10+-5";
        ExpressionEvaluator ee = new ExpressionEvaluator(expression);
        double expected = 5;
        double actual = ee.calculation();
        assertEquals(expected, actual);
    }

    @Test
    public void forSingleBracketWithMultipleSpace() throws Exception {
        String expression = "1+(  2*3)";
        ExpressionEvaluator ee = new ExpressionEvaluator(expression);
        double expected = 7;
        double actual = ee.calculation();
        assertEquals(expected, actual);
    }

    @Test
    public void forSingleBraketsWithoutSpace() throws Exception {
        String expression = "1+(2*3)";
        ExpressionEvaluator ee = new ExpressionEvaluator(expression);
        double expected = 7;
        double actual = ee.calculation();
        assertEquals(expected, actual);
    }

    @Test
    public void forNestedBracketsWithoutSpaces() throws Exception {
        String expression = "1+(2*(3+4))";
        ExpressionEvaluator ee = new ExpressionEvaluator(expression);
        double expected = 15;
        double actual = ee.calculation();
        assertEquals(expected, actual);
    }

    @Test
    public void forAdditionOfTwoFloatingPoints() throws Exception {
        String expression = "1.0+2.0";
        ExpressionEvaluator ee = new ExpressionEvaluator(expression);
        double expected = 3.0;
        double actual = ee.calculation();
        assertEquals(expected, actual);
    }

    @Test
    public void forHandingPowerOfNegativeNumber() throws Exception {
        String expression = "-1^-1";
        ExpressionEvaluator ee = new ExpressionEvaluator(expression);
        double expected = -1;
        double actual = ee.calculation();
        assertEquals(expected, actual);
    }

    @Test
    public void forSingleNegativeNumberInsideBrackets() throws Exception {
        String expression = "(-1)";
        ExpressionEvaluator ee = new ExpressionEvaluator(expression);
        double expected = -1;
        double actual = ee.calculation();
        assertEquals(expected, actual);
    }

    @Test
    public void forSubstractionOfTwoNumbers() throws Exception {
        String expression = "-1+-2";
        ExpressionEvaluator ee = new ExpressionEvaluator(expression);
        double expected = -3;
        double actual = ee.calculation();
        assertEquals(expected, actual);
    }

    @Test
    public void forNegativeNumbers() throws Exception {
        String expression = "-1-1";
        ExpressionEvaluator ee = new ExpressionEvaluator(expression);
        double expected = -2;
        double actual = ee.calculation();
        assertEquals(expected, actual);
    }

    @Test
    public void testForGivingOneOperand() throws Exception {
        String expression = "(((((3)))))";
        ExpressionEvaluator ee = new ExpressionEvaluator(expression);
        double expected = 3;
        double actual = ee.calculation();
        assertEquals(expected, actual);
    }
}