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
        miQueso = mock(QuesoAmarillo.class);
    }

    @Test
    public void getCurrentTemperature(){
        when(miQueso.getCurrentTemperature()).thenReturn(20);
        Assert.assertEquals(20, miQueso.getCurrentTemperature());
    }

    @Test
    public void getMeltingTemperature(){
        when(miQueso.getMeltingTemperature()).thenReturn(20);
        Assert.assertEquals(20, miQueso.getMeltingTemperature());
    }

    @Test
    public void melted(){
        when(miQueso.isMelted()).thenReturn(true);
        Assert.assertEquals(true, miQueso.isMelted());
    }
}
