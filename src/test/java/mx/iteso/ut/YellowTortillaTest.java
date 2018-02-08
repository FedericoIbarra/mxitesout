package mx.iteso.ut;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class YellowTortillaTest {
    YellowTortilla yellowTortilla;

    @Before
    public void setUp(){
        yellowTortilla = new YellowTortilla();
        yellowTortilla.setCurrentTemperature(19);
        yellowTortilla.toast(false);
    }

    @Test
    public void correctToastTemperature(){
        int expectedTemperature = 21;
        Assert.assertEquals(expectedTemperature, yellowTortilla.getToastTemperature());
    }

    @Test
    public void correctCurrentTemperature(){
        int expectedTemperature = 19;
        Assert.assertEquals(expectedTemperature, yellowTortilla.getCurrentTemperature());
    }

    @Test
    public void isToasted(){
        boolean expected = false;
        Assert.assertEquals(expected, yellowTortilla.isToasted());
    }
}
