package kajaljad.expressionevaluator.lib;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MinusTest{
    @Test
    public void _1_minus_2_is_minus_1(){
        Operator minus = new Minus();
        assertThat(minus.operate(1d, 2d),is(-1d));
    }

}
