package kajaljad.expressionevaluator.lib;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class PowerTest{
    @Test
    public void _1_power_2_is_1(){
        Operator power = new Power();
        assertThat(power.operate(1d, 2d),is(1d));
    }

}
