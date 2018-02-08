package mx.iteso.ut;

import org.junit.Before;
import org.junit.*;

import static org.junit.Assert.assertArrayEquals;
import static org.mockito.Mockito.*;// esta vez se usa mockito por las interfaces que se tienen, no siempre es necesario su uso

//verify método de mockito
//AssertEqual(EXPECTED, ACTUAL);
//TIP usar m[etodo setqueso y settortilla 
/**
 * Unit test for simple Quesadilla.
 */
public class QuesadillaTest

{
	/**
	 * Create the test case
	 *
	 * @param testName
	 *            name of the test case
	 */
	Tortilla tortilla;
	Queso queso;
	Quesadilla quesadilla;

	@Before
	public void setUp() {
		tortilla = mock(Tortilla.class);
		queso = mock(Queso.class);
		quesadilla = new Quesadilla();
		quesadilla.setQueso(queso);
		quesadilla.setTortilla(tortilla);
	}

	@Test
	public void quesadillaPerfecta() {
		when(tortilla.getToastTemperature()).thenReturn(20);
		when(tortilla.getCurrentTemperature()).thenReturn(2, 6, 10, 14, 18, 22);
		when(queso.getMeltingTemperature()).thenReturn(20);
		when(queso.getCurrentTemperature()).thenReturn(2, 6, 10, 14, 18, 22);
		when(tortilla.isToasted()).thenReturn(true);
		when(queso.isMelted()).thenReturn(true);
		Assert.assertEquals("Perfect quesadilla", quesadilla.prepareSingle());
		verify(tortilla,  atLeastOnce()).toast(true);
        verify(queso, atLeastOnce()).melt(true);
	}

	@Test
	public void quesadillaBuena() {
		when(tortilla.getToastTemperature()).thenReturn(23);
		when(tortilla.getCurrentTemperature()).thenReturn(2, 6, 10, 14, 18, 22);
		when(queso.getMeltingTemperature()).thenReturn(20);
		when(queso.getCurrentTemperature()).thenReturn(2, 6, 10, 14, 18, 22);
		when(tortilla.isToasted()).thenReturn(false);
		when(queso.isMelted()).thenReturn(true);
		Assert.assertEquals("Good quesadilla", quesadilla.prepareSingle());
		verify(tortilla, never()).toast(true);
        verify(queso, atLeastOnce()).melt(true);
	}

	@Test
	public void quesadillaTerrible() {
		when(tortilla.getToastTemperature()).thenReturn(20);
		when(tortilla.getCurrentTemperature()).thenReturn(2, 6, 10, 14, 18, 22);
		when(queso.getMeltingTemperature()).thenReturn(23);
		when(queso.getCurrentTemperature()).thenReturn(2, 6, 10, 14, 18, 22);
		when(tortilla.isToasted()).thenReturn(true);
		when(queso.isMelted()).thenReturn(false);
		Assert.assertEquals("Terrible quesadilla", quesadilla.prepareSingle());
		verify(queso, never()).melt(true);
        verify(tortilla, atLeastOnce()).toast(true);
	}

	@Test
	public void quesadillaSinGas() {
		when(tortilla.getToastTemperature()).thenReturn(20);
        when(tortilla.getCurrentTemperature()).thenReturn(22);
        when(queso.getMeltingTemperature()).thenReturn(20);
        when(queso.getCurrentTemperature()).thenReturn(22);
		when(tortilla.isToasted()).thenReturn(false);
		when(queso.isMelted()).thenReturn(false);
		Assert.assertEquals("You ran out of gas", quesadilla.prepareSingle());
		verify(tortilla, never()).toast(true);
        verify(queso, never()).melt(true);
	}
}
