package mx.iteso.ut;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TortillaHarinaTest {
    TortillaHarina harina;

    @Before
    public void SetUp(){
        //estas variables van a ser mockeadas, usando la clase Tortilla que es una interfaz
      harina = new TortillaHarina();

    }

    @Test
    public void setCurrentTemperatureTest(){
        harina.setCurrentTemperature(18);

        Assert.assertEquals(18, harina.getCurrentTemperature());
    }

    @Test
    public void  melt0(){
       harina.toast(true);
       Assert.assertEquals(true, harina.isToasted());
    }
}
