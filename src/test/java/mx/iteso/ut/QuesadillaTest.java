package mx.iteso.ut;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.mockito.internal.stubbing.BaseStubbing;

import static org.mockito.Mockito.*;


/**
 * Unit test for simple Quesadilla.
 */
public class QuesadillaTest{
    Tortilla mockedTortilla;
    Queso mockedQueso;
    Quesadilla quesadilla;

	@Before
    public void setUp() {
    	mockedTortilla = mock(Tortilla.class);
    	mockedQueso = mock(Queso.class);
    	quesadilla = new Quesadilla();
    	quesadilla.setQueso(mockedQueso);
    	quesadilla.setTortilla(mockedTortilla);
    }
    
	@Test
    public void quesadillaPerfecta() {
	    when(mockedTortilla.getToastTemperature()).thenReturn(20);
        when(mockedTortilla.getCurrentTemperature()).thenReturn(2,6,10,14,18,22);
        when(mockedQueso.getMeltingTemperature()).thenReturn(20);
        when(mockedQueso.getCurrentTemperature()).thenReturn(2,6,10,14,18,22);


        when(mockedTortilla.isToasted()).thenReturn(true);
        when(mockedQueso.isMelted()).thenReturn(true);

        Assert.assertEquals("Perfect quesadilla", quesadilla.prepareSingle());
        verify(mockedTortilla, atLeastOnce()).toast(true);
        verify(mockedQueso, atLeastOnce()).melt(true);
    }


	@Test
    public void quesadillaBuena() {
        when(mockedTortilla.getToastTemperature()).thenReturn(24);
        when(mockedTortilla.getCurrentTemperature()).thenReturn(2,6,10,14,18, 22);
        when(mockedQueso.getMeltingTemperature()).thenReturn(20);
        when(mockedQueso.getCurrentTemperature()).thenReturn(2,6,10,14,18,22);

        when(mockedTortilla.isToasted()).thenReturn(false);
        when(mockedQueso.isMelted()).thenReturn(true);

        Assert.assertEquals("Good quesadilla", quesadilla.prepareSingle());
        verify(mockedTortilla, never()).toast(true);
        verify(mockedQueso, atLeastOnce()).melt(true);

    }


	@Test
    public void quesadillaTerrible() {
        when(mockedTortilla.getToastTemperature()).thenReturn(20);
        when(mockedTortilla.getCurrentTemperature()).thenReturn(2,6,10,14,18,22);
        when(mockedQueso.getMeltingTemperature()).thenReturn(24);
        when(mockedQueso.getCurrentTemperature()).thenReturn(2,6,10,14,18,22);

        when(mockedTortilla.isToasted()).thenReturn(true);
        when(mockedQueso.isMelted()).thenReturn(false);

        Assert.assertEquals("Terrible quesadilla", quesadilla.prepareSingle());
        verify(mockedTortilla, atLeastOnce()).toast(true);
        verify(mockedQueso, never()).melt(true);
    }
    
	@Test
    public void noGas() {
        when(mockedTortilla.getToastTemperature()).thenReturn(20);
        when(mockedTortilla.getCurrentTemperature()).thenReturn(22);
        when(mockedQueso.getMeltingTemperature()).thenReturn(20);
        when(mockedQueso.getCurrentTemperature()).thenReturn(22);
        when(mockedTortilla.isToasted()).thenReturn(false);
        when(mockedQueso.isMelted()).thenReturn(false);

        Assert.assertEquals("You ran out of gas", quesadilla.prepareSingle());
        verify(mockedTortilla, never()).toast(true);
        verify(mockedQueso, never()).melt(true);
    }

}
