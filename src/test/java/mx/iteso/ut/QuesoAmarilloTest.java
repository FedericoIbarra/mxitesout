package mx.iteso.ut;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class QuesoAmarilloTest {
    QuesoAmarillo miQueso= new QuesoAmarillo();

    @Before
    public void setUp(){
        miQueso.setCurrentTemperature(0);
    }

    @Test
    public void getCurrentTemperature(){
        Assert.assertEquals(0, miQueso.getCurrentTemperature());
    }

    @Test
    public void getMeltingTemperature(){
        Assert.assertEquals(20, miQueso.getMeltingTemperature());
    }

    @Test
    public void melted(){
        miQueso.setCurrentTemperature(22);
        Assert.assertEquals(true, miQueso.isMelted());

        miQueso.setCurrentTemperature(18);
        Assert.assertEquals(false, miQueso.isMelted());

    }
}
