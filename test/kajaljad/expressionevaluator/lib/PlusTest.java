package kajaljad.expressionevaluator.lib;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class PlusTest{
    @Test
    public void _1_plus_2_is_3(){
        Operator plus = new Plus();
        assertThat(plus.operate(1d, 2d),is(3d));
    }

}
