package kajaljad.expressionevaluator.lib;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ValueExpressionTest{
    final ValueExpression _5 = new ValueExpression(5d);
    final ValueExpression _10 = new ValueExpression(10d);

    @Test
    public void _5_equals_5() {
        assertThat(_5,is(_5));
    }

    @Test
    public void _5_equals_another_5() {
        assertThat(_5, is(new ValueExpression(5d)));
    }

    @Test
    public void _5_evaluates_5() {
        assertThat(_5.evaluate(), is(_5));
    }

    @Test
    public void _5_toString_is_5() {
        assertThat(_5.toString(), is("5.0"));
    }
    @Test
    public void _5_plus_5_is_10(){
        assertThat(_5.operate(Operator.plus,_5), is(_10));
    }
}
