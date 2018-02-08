package mx.iteso.ut;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;

public class ManchegoTest {
    Manchego manchego;

    @Before
    public void setUp(){
        manchego = new Manchego();
        manchego.setCurrentTemperature(13);
        manchego.melt(true);
    }


    @Test
    public void correctMeltingTemperature(){
        int expectedTemperature = 15;
        Assert.assertEquals(expectedTemperature, manchego.getMeltingTemperature());
    }

    @Test
    public void correctCurrentTemperature(){
        int expectedTemperature = 13;
        Assert.assertEquals(expectedTemperature, manchego.getCurrentTemperature());
    }

    @Test
    public void isMelted(){
        boolean expected = true;
        Assert.assertEquals(expected, manchego.isMelted());
    }

}
