package kajaljad.expressionevaluator.lib;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ExpressionEvaluatorTest {
    ExpressionEvaluator ee = new ExpressionEvaluator();

    @Test
    public void forWrongInput() {
        String text = "12345";
        ValueExpression expected = new ValueExpression(12345d);
        IExpression expression = ee.createExpression(text);
        assertThat(expected, is(expression.evaluate()));
    }

    @Test
    public void forAdditionOfTwoNumbers() {
        String text = "1 + 2";
        ValueExpression expected = new ValueExpression(3);
        IExpression actual = ee.createExpression(text);
        assertThat(expected, is(actual.evaluate()));
    }

    @Test
    public void forAdditionOfTwoNegativeNumbers() {
        String text = "-1 + -2";
        ValueExpression expected = new ValueExpression(-3);
        IExpression actual = ee.createExpression(text);
        assertThat(expected, is(actual.evaluate()));
    }

    @Test
    public void forSubtractionOfTwoNumbers() {
        String text = "2 - 1";
        ValueExpression expected = new ValueExpression(1);
        IExpression actual = ee.createExpression(text);
        assertThat(expected, is(actual.evaluate()));
    }

    @Test
    public void forSubtractionOfTwoNegativeNumbers() {
        String text = "-10 - -1";

        ValueExpression expected = new ValueExpression(-9);
        IExpression actual = ee.createExpression(text);
        assertThat(expected, is(actual.evaluate()));
    }

    @Test
    public void forMultiplicationOfTwoNumbers() {
        String text = "1 * 2";

        ValueExpression expected = new ValueExpression(2);
        IExpression actual = ee.createExpression(text);
        assertThat(expected, is(actual.evaluate()));
    }

    @Test
    public void forMultiplicationOfTwoNumbersWithNegativeNumber() {
        String text = "10 * -2";

        ValueExpression expected = new ValueExpression(-20);
        IExpression actual = ee.createExpression(text);
        assertThat(expected, is(actual.evaluate()));
    }

    @Test
    public void forDivisionOfTwoNumbers() {
        String text = "10 / 2";

        ValueExpression expected = new ValueExpression(5);
        IExpression actual = ee.createExpression(text);
        assertThat(expected, is(actual.evaluate()));
    }

    @Test
    public void forDivisionOfTwoNumbersWithNegativeNumber() {
        String text = "-10 / 2";

        ValueExpression expected = new ValueExpression(-5);
        IExpression actual = ee.createExpression(text);
        assertThat(expected, is(actual.evaluate()));
    }

    @Test
    public void forExponentialOfNumber() {
        String text = "10 ^ 2";

        ValueExpression expected = new ValueExpression(100);
        IExpression actual = ee.createExpression(text);
        assertThat(expected, is(actual.evaluate()));
    }

    @Test
    public void forAdditionOfThreeNumbers() {
        String text = "2 + 2 + 2";

        ValueExpression expected = new ValueExpression(6);
        IExpression actual = ee.createExpression(text);
        assertThat(expected, is(actual.evaluate()));
    }

    @Test
    public void forAdditionOfThreeNumbersWithNegativeNumber() {
        String text = "2 + 2 + -2";

        ValueExpression expected = new ValueExpression(2);
        IExpression actual = ee.createExpression(text);
        assertThat(expected, is(actual.evaluate()));
    }

    @Test
    public void forExponentialOfNegativeNumber() {
        String text = "-10 ^ 2";

        ValueExpression expected = new ValueExpression(100);
        IExpression actual = ee.createExpression(text);
        assertThat(expected, is(actual.evaluate()));
    }

    @Test
    public void forSubtractionOfThreeNumbers() {
        String text = "10 - 2 - 2";

        ValueExpression expected = new ValueExpression(6);
        IExpression actual = ee.createExpression(text);
        assertThat(expected, is(actual.evaluate()));
    }

    @Test
    public void forTwoOperatorsAndThreeOperands() {
        String text = "1 + 2 * 3";

        ValueExpression expected = new ValueExpression(9);
        IExpression actual = ee.createExpression(text);
        assertThat(expected, is(actual.evaluate()));
    }

    @Test
    public void forTwoOperatorsAndThreeOperandsWithNegativeValue() {
        String text = "1 + 2 * -3";

        ValueExpression expected = new ValueExpression(-9);
        IExpression actual = ee.createExpression(text);
        assertThat(expected, is(actual.evaluate()));
    }

    @Test
    public void forThreeOperatorsAndFourOperands() {
        String text = "1 + 2 * 3 - 4";

        ValueExpression expected = new ValueExpression(5);
        IExpression actual = ee.createExpression(text);
        assertThat(expected, is(actual.evaluate()));
    }

    @Test
    public void forFourOperatorsAndFiveOperands() {
        String text = "1 + 2 * 3 - 4 / 5";

        ValueExpression expected = new ValueExpression(1);
        IExpression actual = ee.createExpression(text);
        assertThat(expected, is(actual.evaluate()));
    }

    @Test
    public void forFiveOperatorsAndSixOperands() {
        String text = "1 + 2 * 3 - 4 / 5 ^ 6";

        ValueExpression expected = new ValueExpression(1);
        IExpression actual = ee.createExpression(text);
        assertThat(expected, is(actual.evaluate()));
    }

    @Test
    public void forHandlingMultipleOperandsAndOperatorsWithNegativeValue() {
        String text = "1 + 2 * 3 - 4 / 5 ^ -6";

        ValueExpression expected = new ValueExpression(1);
        IExpression actual = ee.createExpression(text);
        assertThat(expected, is(actual.evaluate()));
    }

    @Test
    public void forHandlingOperatorsAndOperandWithSingleBracket() {
        String text = "1 + ( 2 + 3 )";

        ValueExpression expected = new ValueExpression(6);
        IExpression actual = ee.createExpression(text);
        assertThat(expected, is(actual.evaluate()));
    }

    @Test
    public void forHandlingOperatorsAndOperandsWithMultipleBrackets() {
        String text = "1 + ( 2 * 3 ) + ( 6 - 2 )";

        ValueExpression expected = new ValueExpression(11);
        IExpression actual = ee.createExpression(text);
        assertThat(expected, is(actual.evaluate()));
    }

    @Test
    public void forCheckingDivisionOfNumberWhenOutputIsFloatingPoint() {
        String text = "22 / 3";

        ValueExpression expected = new ValueExpression(7.333333333333333);
        IExpression actual = ee.createExpression(text);
        assertThat(expected, is(actual.evaluate()));
    }

    @Test
    public void forHandlingExponential() {
        String text = "2 ^ 31";

        ValueExpression expected = new ValueExpression(2.147483648E9);
        IExpression actual = ee.createExpression(text);
        assertThat(expected, is(actual.evaluate()));
    }

    @Test
    public void forHandlingSingleNestedBrackets() {
        String text = "1 + ( 2 + ( 2 + 3 ) )";

        ValueExpression expected = new ValueExpression(8);
        IExpression actual = ee.createExpression(text);
        assertThat(expected, is(actual.evaluate()));
    }

    @Test
    public void forHandlingMultipleBrackets() {
        String text = "1 + ( ( 2 * 3 ) + ( 10 / 5 ) * 2 )";

        ValueExpression expected = new ValueExpression(17);
        IExpression actual = ee.createExpression(text);
        assertThat(expected, is(actual.evaluate()));
    }

    @Test
    public void forHandlingMultipleNestedBrackets() {
        String text = "1 + ( ( 2 * 3 ) + ( 10 / 5 ) ^ 2 )";

        ValueExpression expected = new ValueExpression(65);
        IExpression actual = ee.createExpression(text);
        assertThat(expected, is(actual.evaluate()));
    }

    @Test
    public void forHandlingNestedBracketsInNestedBrackets() {
        String text = "1 + ( ( 2 * ( 4 - 3 ) ) + ( 10 / 5 ) ^ 2 )";

        ValueExpression expected = new ValueExpression(17);
        IExpression actual = ee.createExpression(text);
        assertThat(expected, is(actual.evaluate()));
    }

    @Test
    public void forHandlingNestedBracketsInNestedBracketsWithNegativeNumbers() {
        String text = "1 + ( ( 2 * ( 4 - 3 ) ) + ( 10 / -5 ) ^ 2 )";

        ValueExpression expected = new ValueExpression(1);
        IExpression actual = ee.createExpression(text);
        assertThat(expected, is(actual.evaluate()));
    }


    @Test
    public void forAdditionOfTwoFloatingPoints() {
        String text = "1.0 + 2.0";

        ValueExpression expected = new ValueExpression(3.0);
        IExpression actual = ee.createExpression(text);
        assertThat(expected, is(actual.evaluate()));
    }

    @Test
    public void forHandingPowerOfNegativeNumber() {
        String text = "-1 ^ -1";

        ValueExpression expected = new ValueExpression(-1);
        IExpression actual = ee.createExpression(text);
        assertThat(expected, is(actual.evaluate()));
    }

    @Test
    public void forSingleNegativeNumberInsideBrackets() {
        String text = "( -1 )";

        ValueExpression expected = new ValueExpression(-1);
        IExpression actual = ee.createExpression(text);
        assertThat(expected, is(actual.evaluate()));
    }

    @Test
    public void forAddingOfTwoNegativeNumbers() {
        String text = "-1 + -2";

        ValueExpression expected = new ValueExpression(-3);
        IExpression actual = ee.createExpression(text);
        assertThat(expected, is(actual.evaluate()));
    }

    @Test
    public void forNegativeNumbers() {
        String text = "-1 - 1";

        ValueExpression expected = new ValueExpression(-2d);
        IExpression actual = ee.createExpression(text);
        assertThat(expected, is(actual.evaluate()));
    }

    @Test
    public void forGivingOneOperand() {
        String text = "(((((3)))))";

        ValueExpression expected = new ValueExpression(3);
        IExpression actual = ee.createExpression(text);
        assertThat(expected, is(actual.evaluate()));
    }

    @Test
    public void forNegativeOperandAfterNegativeOperator() {
        String text = "1.25 - -0.25";

        ValueExpression expected = new ValueExpression(1.5);
        IExpression actual = ee.createExpression(text);
        assertThat(expected, is(actual.evaluate()));
    }

    @Test(expected = RuntimeException.class)
    public void forHandlingExceptionIfCharacterIsGivenInExpression() {
        String text = "a1 + 2";

        ValueExpression expected = new ValueExpression(0);
        IExpression actual = ee.createExpression(text);
        assertThat(expected, is(actual.evaluate()));
    }

    @Test(expected = RuntimeException.class)
    public void forHandlingExceptionForSingleOperatorWithSingleOperand() {
        String text = "22 *";

        ValueExpression expected = new ValueExpression(0);
        IExpression actual = ee.createExpression(text);
        assertThat(expected, is(actual.evaluate()));
    }

    @Test
    public void forNegativeExponential() {
        String text = "8 ^ -1";

        ValueExpression expected = new ValueExpression(0.125);
        IExpression actual = ee.createExpression(text);
        assertThat(expected, is(actual.evaluate()));
    }

    @Test
    public void forFloatingPoint() {
        String text = ".5 + .5";

        ValueExpression expected = new ValueExpression(1);
        IExpression actual = ee.createExpression(text);
        assertThat(expected, is(actual.evaluate()));
    }
}
