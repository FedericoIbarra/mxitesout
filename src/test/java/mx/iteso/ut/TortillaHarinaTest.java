package mx.iteso.ut;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TortillaHarinaTest {
    TortillaHarina miTortilla = new TortillaHarina();

    @Before
    public void setUp(){
        miTortilla.setCurrentTemperature(0);
    }

    @Test
    public void getCurrentTemperature() {
        Assert.assertEquals(0, miTortilla.getCurrentTemperature());
    }

    @Test
    public void getToastTemperature(){
        Assert.assertEquals(20, miTortilla.getToastTemperature());
    }

    @Test
    public void toasted(){
        miTortilla.setCurrentTemperature(22);
        Assert.assertEquals(true, miTortilla.isToasted());

        miTortilla.setCurrentTemperature(18);
        Assert.assertEquals(false, miTortilla.isToasted());
    }
}
