package kajaljad.expressionevaluator.lib;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class ExpressionParserTest {
    ExpressionParser parser = new ExpressionParser();
    private ValueExpression _5 = new ValueExpression(5d);
    private ValueExpression _minus5 = new ValueExpression(-5d);
    private ValueExpression _2 = new ValueExpression(2d);
    private ValueExpression _3 = new ValueExpression(3d);
    private ValueExpression _4 = new ValueExpression(4d);
    private OperationExpression _2_plus_3 = new OperationExpression(_2, Operator.plus, _3);
    private OperationExpression _2_plus_3_plus_4 = new OperationExpression(_2_plus_3, Operator.plus, _4);

    private IExpression parse(String text) {
        return parser.parse(text);
    }

    @Test
    public void _5() {
        assertEquals(parse(" 5 "), _5);
    }

    @Test(expected = Exception.class)
    public void _5plus() {
        parse("5+");
    }

    @Test
    public void _brackets_5() {
        assertEquals(parse("( 5 )"), new BracketExpression(_5));
    }

    @Test
    public void _minus5() {
        assertEquals(parse("-5"), _minus5);
    }

    @Test
    public void _2_plus_3() {
        assertEquals(parse("2 + 3"), _2_plus_3);
    }

    @Test
    public void _2_plus_3_brackets() {
        assertEquals(parse("( 2 + 3 )"), new BracketExpression(_2_plus_3));
    }

    @Test
    public void _2_plus_3_plus_4() {
        assertEquals(parse("2 + 3 + 4"), _2_plus_3_plus_4);
    }

    @Test
    public void _2_plus_3_plus_4_bracket() {
        assertEquals(parse("( 2 + 3 + 4 )"), new BracketExpression(_2_plus_3_plus_4));
    }

    @Test
    public void _5_plus_2_plus_3_in__bracket() {
        assertEquals(parse("5 + ( 2 + 3 )"), new OperationExpression(_5, Operator.plus, new BracketExpression(_2_plus_3)));
    }

    @Test
    public void forSingleBracketWithMultipleSpace() {
        String text = "1 + (     2 * 3 )";

        ValueExpression expected = new ValueExpression(7);
        IExpression actual = parse(text);
        assertThat(expected, is(actual.evaluate()));
    }

    @Test
    public void forNegativeNumberWithoutSpace() {
        String text = "10+-5";

        ValueExpression expected = new ValueExpression(5);
        IExpression actual = parse(text);
        assertThat(expected, is(actual.evaluate()));
    }

    @Test
    public void forSingleBracketsWithoutSpace() {
        String text = "1+(2*3)";

        ValueExpression expected = new ValueExpression(7);
        IExpression actual = parse(text);
        assertThat(expected, is(actual.evaluate()));
    }

    @Test
    public void forNestedBracketsWithoutSpaces() {
        String text = "1+(2*(3+4)    )";

        ValueExpression expected = new ValueExpression(15);
        IExpression actual = parse(text);
        assertThat(expected, is(actual.evaluate()));
    }

    @Test
    public void forHandlingNestedBracketsInNestedBracketsWithNegativeNumbers() {
        String text = "1+((2*(4-3))+(10 / -5 ) ^ 2 )";

        ValueExpression expected = new ValueExpression(1);
        IExpression actual = parse(text);
        assertThat(expected, is(actual.evaluate()));
    }
}
