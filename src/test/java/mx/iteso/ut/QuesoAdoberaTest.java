package mx.iteso.ut;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class QuesoAdoberaTest {

    QuesoAdobera adobera;

    @Before
    public void SetUp(){
        //estas variables van a ser mockeadas, usando la clase Tortilla que es una interfaz
     adobera = new QuesoAdobera();

    }

    @Test
    public void setCurrentTemperatureTest(){
        adobera.setCurrentTemperature(45);

        Assert.assertEquals(45, adobera.getCurrentTemperature());
    }

    @Test
    public void  melt0(){
        adobera.melt(true);
        Assert.assertEquals(true, adobera.isMelted());
    }
}
