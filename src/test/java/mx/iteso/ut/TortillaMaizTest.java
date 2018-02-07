package mx.iteso.ut;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TortillaMaizTest {
    TortillaMaiz maiz;

    @Before
    public void SetUp(){
        //estas variables van a ser mockeadas, usando la clase Tortilla que es una interfaz
        maiz = new TortillaMaiz();

    }

    @Test
    public void setCurrentTemperatureTest(){
        maiz.setCurrentTemperature(15);

        Assert.assertEquals(15, maiz.getCurrentTemperature());
    }

    @Test
    public void  melt0(){
        maiz.toast(true);
        Assert.assertEquals(true, maiz.isToasted());
    }
}
