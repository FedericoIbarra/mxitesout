package mx.iteso.ut;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
/**
 * Unit test for simple Quesadilla.
 */
public class QuesadillaTest {
	
	Tortilla tortilla;
	Queso queso;
	Quesadilla quesadilla = new Quesadilla();
	
	@Before
	public void setUp(){
		tortilla = mock(Tortilla.class);
	    queso = mock(Queso.class);
		quesadilla.setQueso(queso);
		quesadilla.setTortilla(tortilla);
	}
	
	@Test
	public void quesadillaPerfecta(){
		
		when(tortilla.getToastTemperature()).thenReturn(22);
		when(tortilla.getCurrentTemperature()).thenReturn(2,6,10,14,18,22);

		when(queso.getMeltingTemperature()).thenReturn(21);
		when(queso.getCurrentTemperature()).thenReturn(1,5,9,13,17,21);
		
		when(tortilla.isToasted()).thenReturn(true);
		when(queso.isMelted()).thenReturn(true);
		
		Assert.assertEquals("Perfect quesadilla", quesadilla.prepareSingle());
	}
	
	@Test
	public void quesadillaBuena(){
		
		when(tortilla.getToastTemperature()).thenReturn(22);
		when(tortilla.getCurrentTemperature()).thenReturn(2,6,10,14,18,22);

		when(queso.getMeltingTemperature()).thenReturn(21);
		when(queso.getCurrentTemperature()).thenReturn(1,5,9,13,17,21);
		
		when(tortilla.isToasted()).thenReturn(false);
		when(queso.isMelted()).thenReturn(true);
		
		Assert.assertEquals("Good quesadilla", quesadilla.prepareSingle());
	}
	
	@Test
	public void quesadillaTerrible(){
		
		when(tortilla.getToastTemperature()).thenReturn(22);
		when(tortilla.getCurrentTemperature()).thenReturn(2,6,10,14,18,22);

		when(queso.getMeltingTemperature()).thenReturn(21);
		when(queso.getCurrentTemperature()).thenReturn(1,5,9,13,17,21);
		
		when(tortilla.isToasted()).thenReturn(true);
		when(queso.isMelted()).thenReturn(false);
		
		Assert.assertEquals("Terrible quesadilla", quesadilla.prepareSingle());
	}
	
	@Test
	public void noHayGas(){
	
		when(tortilla.getToastTemperature()).thenReturn(22);
		when(tortilla.getCurrentTemperature()).thenReturn(2,6,10,14,18,22);

		when(queso.getMeltingTemperature()).thenReturn(21);
		when(queso.getCurrentTemperature()).thenReturn(1,5,9,13,17,21);
		
		when(tortilla.isToasted()).thenReturn(false);
		when(queso.isMelted()).thenReturn(false);
		
		Assert.assertEquals("You ran out of gas", quesadilla.prepareSingle());
	}
	
}
