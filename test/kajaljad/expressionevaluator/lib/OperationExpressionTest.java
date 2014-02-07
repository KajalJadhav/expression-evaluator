package kajaljad.expressionevaluator.lib;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class OperationExpressionTest{

    final OperationExpression _2_plus_3 = new OperationExpression(new ValueExpression(2d),Operator.plus,new ValueExpression(3d));
    final ValueExpression _5 = new ValueExpression(5d);
    @Test
    public void _2_plus_3_equals_2_plus_3() {
        assertThat(_2_plus_3, is(_2_plus_3));
    }

    @Test
    public void _2_plus_3_equals_another_2_plus_3() {
        assertEquals(_2_plus_3, new OperationExpression(new ValueExpression(2d),Operator.plus, new ValueExpression(3d)));
    }

    @Test
    public void _2_plus_3_evaluates_5() {
        assertThat(_2_plus_3.evaluate(), is(_5));
    }

    @Test
    public void _2_plus_3_toString_is_2_plus_3() {
        assertThat(_2_plus_3.toString(), is("2.0+3.0"));
    }
}
