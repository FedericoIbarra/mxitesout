package mx.iteso.ut;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QuesoMozarellaTest {
    QuesoMozarella mozarella;

    @Before
    public void SetUp(){
        //estas variables van a ser mockeadas, usando la clase Tortilla que es una interfaz
        mozarella = new QuesoMozarella();

    }

    @Test
    public void setCurrentTemperatureTest(){
        mozarella.setCurrentTemperature(30);

        Assert.assertEquals(30, mozarella.getCurrentTemperature());
    }

    @Test
    public void  melt0(){
        mozarella.melt(true);
        Assert.assertEquals(true, mozarella.isMelted());
    }
}
