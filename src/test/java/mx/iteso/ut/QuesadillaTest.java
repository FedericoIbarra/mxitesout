package mx.iteso.ut;
import org.junit.Assert;
import org.junit.Assume;
import org.junit.Test;
import org.junit.Before;
import static org.mockito.Mockito.*;
/*
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple Quesadilla.
*/
public class QuesadillaTest
  //  extends TestCase
{
    public Quesadilla quesadilla;
    public Queso mockedQueso;
    public Tortilla mockedTortilla;

    @Before
    public void setUp(){
        quesadilla = new Quesadilla();
        mockedTortilla = mock(Tortilla.class);
        mockedQueso = mock(Queso.class);
        quesadilla.setQueso(mockedQueso);
        quesadilla.setTortilla(mockedTortilla);

    }
    @Test
    public void perfectQuesadilla(){
        quesadilla.setHeatLevel(4);

        when(mockedQueso.getCurrentTemperature()).thenReturn(6,6,8);
        when(mockedQueso.getMeltingTemperature()).thenReturn(8);

        when(mockedTortilla.getCurrentTemperature()).thenReturn(6, 8, 8);
        when(mockedTortilla.getToastTemperature()).thenReturn(8);

        when(mockedQueso.isMelted()).thenReturn(true);
        when(mockedTortilla.isToasted()).thenReturn(true);
        Assert.assertEquals("Perfect quesadilla", quesadilla.prepareSingle());
        verify(mockedTortilla, atLeastOnce()).toast(true);
        verify(mockedQueso, atLeastOnce()).melt(true);

    }
    @Test
    public void goodQuesadilla(){
        quesadilla.setHeatLevel(4);

        when(mockedQueso.getCurrentTemperature()).thenReturn(6,6,8);
        when(mockedQueso.getMeltingTemperature()).thenReturn(8);

        when(mockedTortilla.getCurrentTemperature()).thenReturn(6, 8, 10);
        when(mockedTortilla.getToastTemperature()).thenReturn(10);


        when(mockedTortilla.isToasted()).thenReturn(false);
        when(mockedQueso.isMelted()).thenReturn(true);
        Assert.assertEquals("Good quesadilla", quesadilla.prepareSingle());
        verify(mockedQueso, atLeastOnce()).melt(true);
        verify(mockedTortilla, atLeastOnce()).toast(false);
    }
    @Test
    public void terribleQuesadilla(){
        quesadilla.setHeatLevel(4);

        when(mockedQueso.getCurrentTemperature()).thenReturn(4,4, 8, 11);
        when(mockedQueso.getMeltingTemperature()).thenReturn(10);

        when(mockedTortilla.getCurrentTemperature()).thenReturn(4, 8, 10);
        when(mockedTortilla.getToastTemperature()).thenReturn(8);

        when(mockedQueso.isMelted()).thenReturn(false);
        when(mockedTortilla.isToasted()).thenReturn(true);
        Assert.assertEquals("Terrible quesadilla", quesadilla.prepareSingle());
        verify(mockedTortilla, atLeastOnce()).toast(true);
        verify(mockedQueso, atLeastOnce()).melt(false);
    }
    @Test
    public void noGas(){
        quesadilla.setHeatLevel(4);

        when(mockedQueso.getCurrentTemperature()).thenReturn(4,4 ,8, 11);
        when(mockedQueso.getMeltingTemperature()).thenReturn(10);

        when(mockedTortilla.getCurrentTemperature()).thenReturn(3, 7, 9);
        when(mockedTortilla.getToastTemperature()).thenReturn(8);

        when(mockedTortilla.isToasted()).thenReturn(false);
        when(mockedQueso.isMelted()).thenReturn(false);
        Assert.assertEquals("You ran out of gas", quesadilla.prepareSingle());
        verify(mockedQueso, atLeastOnce()).melt(false);
        verify(mockedTortilla, atLeastOnce()).toast(false);
    }
}