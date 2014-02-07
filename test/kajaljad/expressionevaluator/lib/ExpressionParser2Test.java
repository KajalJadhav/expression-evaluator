package kajaljad.expressionevaluator.lib;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class ExpressionParser2Test {
    ExpressionParser2 parser = new ExpressionParser2();
    private ValueExpression _5 = new ValueExpression(5d);
    private ValueExpression _minus5 = new ValueExpression(-5d);
    private ValueExpression _2 = new ValueExpression(2d);
    private ValueExpression _3 = new ValueExpression(3d);
    private ValueExpression _4 = new ValueExpression(4d);
    private OperationExpression _2_plus_3 = new OperationExpression(_2,Operator.plus,_3);
    private OperationExpression _2_plus_3_plus_4 = new OperationExpression(_2_plus_3,Operator.plus,_4);


    private IExpression parse(String text) {
        return parser.parse(text);
    }
    @Test
    public void _5() {
        assertEquals(parse("5"), _5);
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

}
