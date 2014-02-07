package kajaljad.expressionevaluator.lib;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class ExpressionEvaluatorTest {
    @Test
    public void forWrongInput() {
        String expression = "12345";
        ExpressionEvaluator ee = new ExpressionEvaluator();
        double expected = 12345;
        double actual = ee.calculate(expression);
        assertEquals(expected, actual);
    }

    @Test
    public void forAdditionOfTwoNumbers() {
        String expression = "1 + 2";
        ExpressionEvaluator ee = new ExpressionEvaluator();
        double expected = 3;
        double actual = ee.calculate(expression);
        assertEquals(expected, actual);
    }

    @Test
    public void forAdditionOfTwoNegativeNumbers() {
        String expression = "-1 + -2";
        ExpressionEvaluator ee = new ExpressionEvaluator();
        double expected = -3;
        double actual = ee.calculate(expression);
        assertEquals(expected, actual);
    }

    @Test
    public void forSubtractionOfTwoNumbers() {
        String expression = "2 - 1";
        ExpressionEvaluator ee = new ExpressionEvaluator();
        double expected = 1;
        double actual = ee.calculate(expression);
        assertEquals(expected, actual);
    }

    @Test
    public void forSubtractionOfTwoNegativeNumbers() {
        String expression = "-10 - -1";
        ExpressionEvaluator ee = new ExpressionEvaluator();
        double expected = -9;
        double actual = ee.calculate(expression);
        assertEquals(expected, actual);
    }

    @Test
    public void forMultiplicationOfTwoNumbers() {
        String expression = "1 * 2";
        ExpressionEvaluator ee = new ExpressionEvaluator();
        double expected = 2;
        double actual = ee.calculate(expression);
        assertEquals(expected, actual);
    }

    @Test
    public void forMultiplicationOfTwoNumbersWithNegativeNumber() {
        String expression = "10 * -2";
        ExpressionEvaluator ee = new ExpressionEvaluator();
        double expected = -20;
        double actual = ee.calculate(expression);
        assertEquals(expected, actual);
    }

    @Test
    public void forDivisionOfTwoNumbers() {
        String expression = "10 / 2";
        ExpressionEvaluator ee = new ExpressionEvaluator();
        double expected = 5;
        double actual = ee.calculate(expression);
        assertEquals(expected, actual);
    }

    @Test
    public void forDivisionOfTwoNumbersWithNegativeNumber() {
        String expression = "-10 / 2";
        ExpressionEvaluator ee = new ExpressionEvaluator();
        double expected = -5;
        double actual = ee.calculate(expression);
        assertEquals(expected, actual);
    }

    @Test
    public void forExponentialOfNumber() {
        String expression = "10 ^ 2";
        ExpressionEvaluator ee = new ExpressionEvaluator();
        double expected = 100;
        double actual = ee.calculate(expression);
        assertEquals(expected, actual);
    }

    @Test
    public void forAdditionOfThreeNumbers() {
        String expression = "2 + 2 + 2";
        ExpressionEvaluator ee = new ExpressionEvaluator();
        double expected = 6;
        double actual = ee.calculate(expression);
        assertEquals(expected, actual);
    }

    @Test
    public void forAdditionOfThreeNumbersWithNegativeNumber() {
        String expression = "2 + 2 + -2";
        ExpressionEvaluator ee = new ExpressionEvaluator();
        double expected = 2;
        double actual = ee.calculate(expression);
        assertEquals(expected, actual);
    }

    @Test
    public void forExponentialOfNegativeNumber() {
        String expression = "-10 ^ 2";
        ExpressionEvaluator ee = new ExpressionEvaluator();
        double expected = 100;
        double actual = ee.calculate(expression);
        assertEquals(expected, actual);
    }

    @Test
    public void forSubtractionOfThreeNumbers() {
        String expression = "10 - 2 - 2";
        ExpressionEvaluator ee = new ExpressionEvaluator();
        double expected = 6;
        double actual = ee.calculate(expression);
        assertEquals(expected, actual);
    }

    @Test
    public void forTwoOperatorsAndThreeOperands() {
        String expression = "1 + 2 * 3";
        ExpressionEvaluator ee = new ExpressionEvaluator();
        double expected = 9;
        double actual = ee.calculate(expression);
        assertEquals(expected, actual);
    }

    @Test
    public void forTwoOperatorsAndThreeOperandsWithNegativeValue() {
        String expression = "1 + 2 * -3";
        ExpressionEvaluator ee = new ExpressionEvaluator();
        double expected = -9;
        double actual = ee.calculate(expression);
        assertEquals(expected, actual);
    }

    @Test
    public void forThreeOperatorsAndFourOperands() {
        String expression = "1 + 2 * 3 - 4";
        ExpressionEvaluator ee = new ExpressionEvaluator();
        double expected = 5;
        double actual = ee.calculate(expression);
        assertEquals(expected, actual);
    }

    @Test
    public void forFourOperatorsAndFiveOperands() {
        String expression = "1 + 2 * 3 - 4 / 5";
        ExpressionEvaluator ee = new ExpressionEvaluator();
        double expected = 1;
        double actual = ee.calculate(expression);
        assertEquals(expected, actual);
    }

    @Test
    public void forFiveOperatorsAndSixOperands() {
        String expression = "1 + 2 * 3 - 4 / 5 ^ 6";
        ExpressionEvaluator ee = new ExpressionEvaluator();
        double expected = 1;
        double actual = ee.calculate(expression);
        assertEquals(expected, actual);
    }

    @Test
    public void forHandlingMultipleOperandsAndOperatorsWithNegativeValue() {
        String expression = "1 + 2 * 3 - 4 / 5 ^ -6";
        ExpressionEvaluator ee = new ExpressionEvaluator();
        double expected = 1;
        double actual = ee.calculate(expression);
        assertEquals(expected, actual);
    }

    @Test
    public void forHandlingOperatorsAndOperandWithSingleBracket() {
        String expression = "1 + ( 2 + 3 )";
        ExpressionEvaluator ee = new ExpressionEvaluator();
        double expected = 6;
        double actual = ee.calculate(expression);
        assertEquals(expected, actual);
    }

    @Test
    public void forHandlingOperatorsAndOperandsWithMultipleBrackets() {
        String expression = "1 + ( 2 * 3 ) + ( 6 - 2 )";
        ExpressionEvaluator ee = new ExpressionEvaluator();
        double expected = 11;
        double actual = ee.calculate(expression);
        assertEquals(expected, actual);
    }

    @Test
    public void forCheckingDivisionOfNumberWhenOutputIsFloatingPoint() {
        String expression = "22 / 3";
        ExpressionEvaluator ee = new ExpressionEvaluator();
        double expected = 7.333333333333333;
        double actual = ee.calculate(expression);
        assertEquals(expected, actual);
    }

    @Test
    public void forHandlingExponential() {
        String expression = "2 ^ 31";
        ExpressionEvaluator ee = new ExpressionEvaluator();
        double expected = 2.147483648E9;
        Double actual = ee.calculate(expression);
        assertEquals(expected, actual);
    }

    @Test
    public void forHandlingSingleNestedBrackets() {
        String expression = "1 + ( 2 + ( 2 + 3 ) )";
        ExpressionEvaluator ee = new ExpressionEvaluator();
        double expected = 8;
        Double actual = ee.calculate(expression);
        assertEquals(expected, actual);
    }

    @Test
    public void forHandlingMultipleBrackets() {
        String expression = "1 + ( ( 2 * 3 ) + ( 10 / 5 ) * 2 )";
        ExpressionEvaluator ee = new ExpressionEvaluator();
        double expected = 17;
        Double actual = ee.calculate(expression);
        assertEquals(expected, actual);
    }

    @Test
    public void forHandlingMultipleNestedBrackets() {
        String expression = "1 + ( ( 2 * 3 ) + ( 10 / 5 ) ^ 2 )";
        ExpressionEvaluator ee = new ExpressionEvaluator();
        double expected = 65;
        Double actual = ee.calculate(expression);
        assertEquals(expected, actual);
    }

    @Test
    public void forHandlingNestedBracketsInNestedBrackets() {
        String expression = "1 + ( ( 2 * ( 4 - 3 ) ) + ( 10 / 5 ) ^ 2 )";
        ExpressionEvaluator ee = new ExpressionEvaluator();
        double expected = 17;
        Double actual = ee.calculate(expression);
        assertEquals(expected, actual);
    }

    @Test
    public void forHandlingNestedBracketsInNestedBracketsWithNegativeNumbers() {
        String expression = "1 + ( ( 2 * ( 4 - 3 ) ) + ( 10 / -5 ) ^ 2 )";
        ExpressionEvaluator ee = new ExpressionEvaluator();
        double expected = 1;
        double actual = ee.calculate(expression);
        assertEquals(expected, actual);
    }

    @Test
    public void forNegativeNumberWithoutSpace() {
        String expression = "10+-5";
        ExpressionEvaluator ee = new ExpressionEvaluator();
        double expected = 5;
        double actual = ee.calculate(expression);
        assertEquals(expected, actual);
    }

    @Test
    public void forSingleBracketWithMultipleSpace() {
        String expression = "1+(  2*3)";
        ExpressionEvaluator ee = new ExpressionEvaluator();
        double expected = 7;
        double actual = ee.calculate(expression);
        assertEquals(expected, actual);
    }

    @Test
    public void forSingleBraketsWithoutSpace() {
        String expression = "1+(2*3)";
        ExpressionEvaluator ee = new ExpressionEvaluator();
        double expected = 7;
        double actual = ee.calculate(expression);
        assertEquals(expected, actual);
    }

    @Test
    public void forNestedBracketsWithoutSpaces() {
        String expression = "1+(2*(3+4))";
        ExpressionEvaluator ee = new ExpressionEvaluator();
        double expected = 15;
        double actual = ee.calculate(expression);
        assertEquals(expected, actual);
    }

    @Test
    public void forAdditionOfTwoFloatingPoints() {
        String expression = "1.0+2.0";
        ExpressionEvaluator ee = new ExpressionEvaluator();
        double expected = 3.0;
        double actual = ee.calculate(expression);
        assertEquals(expected, actual);
    }

    @Test
    public void forHandingPowerOfNegativeNumber() {
        String expression = "-1^-1";
        ExpressionEvaluator ee = new ExpressionEvaluator();
        double expected = -1;
        double actual = ee.calculate(expression);
        assertEquals(expected, actual);
    }

    @Test
    public void forSingleNegativeNumberInsideBrackets() {
        String expression = "(-1)";
        ExpressionEvaluator ee = new ExpressionEvaluator();
        double expected = -1;
        double actual = ee.calculate(expression);
        assertEquals(expected, actual);
    }

    @Test
    public void forSubstractionOfTwoNumbers() {
        String expression = "-1+-2";
        ExpressionEvaluator ee = new ExpressionEvaluator();
        double expected = -3;
        double actual = ee.calculate(expression);
        assertEquals(expected, actual);
    }

    @Test
    public void forNegativeNumbers() {
        String expression = "-1-1";
        ExpressionEvaluator ee = new ExpressionEvaluator();
        double expected = -2;
        double actual = ee.calculate(expression);
        assertEquals(expected, actual);
    }

    @Test
    public void forGivingOneOperand() {
        String expression = "(((((3)))))";
        ExpressionEvaluator ee = new ExpressionEvaluator();
        double expected = 3;
        double actual = ee.calculate(expression);
        assertEquals(expected, actual);
    }

    @Test
    public void forNegativeOperandAfterNegativeOperator() {
        String expression = "1.25--0.25";
        ExpressionEvaluator ee = new ExpressionEvaluator();
        double expected = 1.5;
        double actual = ee.calculate(expression);
        assertEquals(expected, actual);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void forHandlingExceptionIfCharacterIsGivenInExpression() {
        String expression = "a1+2";
        ExpressionEvaluator ee = new ExpressionEvaluator();
        double expected = 0;
        double actual = ee.calculate(expression);
        assertEquals(expected, actual);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void forHandlingExceptionForSingleOperatorWithSingleOperand() {
        String expression = "22*";
        ExpressionEvaluator ee = new ExpressionEvaluator();
        double expected = 0;
        double actual = ee.calculate(expression);
        assertEquals(expected, actual);
    }

    @Test
    public void forNegativeExponential() {
        String expression = "8^-1";
        ExpressionEvaluator ee = new ExpressionEvaluator();
        double expected = 0.125;
        double actual = ee.calculate(expression);
        assertEquals(expected, actual);
    }

    @Test
    public void forFloatingPoint() {
        String expression = ".5+.5";
        ExpressionEvaluator ee = new ExpressionEvaluator();
        double expected = 1;
        double actual = ee.calculate(expression);
        assertEquals(expected, actual);
    }
}
