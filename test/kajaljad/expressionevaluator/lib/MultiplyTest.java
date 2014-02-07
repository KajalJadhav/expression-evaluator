package kajaljad.expressionevaluator.lib;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MultiplyTest{
    @Test
    public void _1_multiply_2_is_2(){
        Operator multiply = new Multiply();
        assertThat(multiply.operate(1d, 2d),is(2d));
    }

}
