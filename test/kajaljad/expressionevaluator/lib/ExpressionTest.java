package kajaljad.expressionevaluator.lib;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class ExpressionTest {
    final Expression _5 = new Expression(5d);
    final Expression _2 = new Expression(2d);
    final Expression _3 = new Expression(3d);
    final Expression _2_plus_3 = new Expression(_2, "+", _3);

    @Test
    public void _5_equals_5() {
        assertEquals(_5, _5);
    }

    @Test
    public void _5_equals_another_5() {
        assertEquals(_5, new Expression(5d));
    }

    @Test
    public void _2_plus_3_equals_2_plus_3() {
        assertEquals(_2_plus_3, _2_plus_3);
    }

    @Test
    public void _2_plus_3_equals_another_2_plus_3() {
        assertEquals(_2_plus_3, new Expression(new Expression(2d), "+", new Expression(3d)));
    }

    @Test
    public void _2_plus_3_is_not_equal_to_5() {
        assertThat(_2_plus_3, is(not(_5)));
    }

    @Test
    public void _2_plus_3_evaluates_5() {
        assertThat(_2_plus_3.evaluate(), is(_5));
    }

    @Test
    public void _5_evaluates_5() {
        assertThat(_5.evaluate(), is(_5));
    }

    @Test
    public void _2_toString_is_2() {
        assertThat(_2.toString(), is("2.0"));
    }

    @Test
    public void _2_plus_3_toString_is_2_plus_3() {
        assertThat(_2_plus_3.toString(), is("2.0+3.0"));
    }
}
