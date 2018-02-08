package mx.iteso.ut;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BlueTortillaTest {
    BlueTortilla blueTortilla;

    @Before
    public void setUp(){
        blueTortilla = new BlueTortilla();
        blueTortilla.setCurrentTemperature(30);
        blueTortilla.toast(true);
    }

    @Test
    public void correctToastTemperature(){
        int expectedTemperature = 19;
        Assert.assertEquals(expectedTemperature, blueTortilla.getToastTemperature());
    }

    @Test
    public void correctCurrentTemperature(){
        int expectedTemperature = 30;
        Assert.assertEquals(expectedTemperature, blueTortilla.getCurrentTemperature());
    }

    @Test
    public void isToasted(){
        boolean expected = true;
        Assert.assertEquals(expected, blueTortilla.isToasted());
    }
}
