package kajaljad.expressionevaluator.lib;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

public class OperatorTest {

    @Test
    public void _1_plus_2_is_3(){
        assertThat(Operator.plus.operate(1d, 2d),is(3d));
    }
    @Test
    public void _1_multiply_2_is_2(){
        assertThat(Operator.multiply.operate(1d, 2d),is(2d));
    }
    @Test
    public void _1_minus_2_is__1(){
        assertThat(Operator.minus.operate(1d, 2d),is(-1d));
    }
    @Test
    public void _4_divide_2_is_2(){
        assertThat(Operator.divide.operate(4d, 2d),is(2d));
    }
    @Test
    public void _1_power_2_is_1(){
        assertThat(Operator.power.operate(1d, 2d),is(1d));
    }

    @Test
    public void Plus_toString(){
        assertThat(Operator.plus.toString(),is("+") );
    }
    @Test
    public void plus_equals_plus(){
        assertThat(Operator.plus,is(Operator.plus));
    }
    @Test
    public void plus_is_not_minus(){
        assertThat(Operator.plus,is(not(Operator.minus)));
    }

}
