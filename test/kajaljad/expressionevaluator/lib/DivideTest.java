package kajaljad.expressionevaluator.lib;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class DivideTest{
    @Test
    public void _4_divide_2_is_2(){
        Operator divide = new Divide();
        assertThat(divide.operate(4d, 2d),is(2d));
    }

}
