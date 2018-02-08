package mx.iteso.ut;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CheddarTest {
    Cheddar cheddar;

    @Before
    public void setUp(){
        cheddar = new Cheddar();
        cheddar.setCurrentTemperature(13);
        cheddar.melt(true);
    }


    @Test
    public void correctMeltingTemperature(){
        int expectedTemperature = 17;
        Assert.assertEquals(expectedTemperature, cheddar.getMeltingTemperature());
    }

    @Test
    public void correctCurrentTemperature(){
        int expectedTemperature = 13;
        Assert.assertEquals(expectedTemperature, cheddar.getCurrentTemperature());
    }

    @Test
    public void isMelted(){
        boolean expected = true;
        Assert.assertEquals(expected, cheddar.isMelted());
    }
}
