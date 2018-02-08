package mx.iteso.ut;

import org.junit.Test;
import org.junit.Before;
import org.junit.Assert;
import static org.mockito.Mockito.*;

public class QuesadillaTest {
	Quesadilla quesadilla;
	Queso mockedQueso;
	Tortilla mockedTortilla;

	@Before
	public void setUp() {
		quesadilla = new Quesadilla();
		mockedTortilla = mock(Tortilla.class);
		mockedQueso = mock(Queso.class);
		quesadilla.setQueso(mockedQueso);
		quesadilla.setTortilla(mockedTortilla);
	}

	@Test
	public void quesadillaPerfecta() {
		when(mockedTortilla.getToastTemperature()).thenReturn(20);
		when(mockedTortilla.getCurrentTemperature()).thenReturn(2, 6, 10, 14, 18, 22);
		when(mockedQueso.getMeltingTemperature()).thenReturn(20);
		when(mockedQueso.getCurrentTemperature()).thenReturn(2, 6, 10, 14, 18, 22);

		when(mockedQueso.isMelted()).thenReturn(true);
		when(mockedTortilla.isToasted()).thenReturn(true);

		Assert.assertEquals("Perfect quesadilla", quesadilla.prepareSingle());

		verify(mockedTortilla, atLeastOnce()).toast(true);
		verify(mockedQueso, atLeastOnce()).melt(true);
	}

	@Test
	public void quesadillaBuena() {
		when(mockedTortilla.getToastTemperature()).thenReturn(24);
		when(mockedTortilla.getCurrentTemperature()).thenReturn(2, 6, 10, 14, 18, 22);
		when(mockedQueso.getMeltingTemperature()).thenReturn(20);
		when(mockedQueso.getCurrentTemperature()).thenReturn(2, 6, 10, 14, 18, 22);

		when(mockedQueso.isMelted()).thenReturn(true);
		when(mockedTortilla.isToasted()).thenReturn(false);

		Assert.assertEquals("Good quesadilla", quesadilla.prepareSingle());
		
		verify(mockedTortilla, never()).toast(true);
		verify(mockedQueso, atLeastOnce()).melt(true);
	}

	@Test
	public void quesadillaTerrible() {
		when(mockedTortilla.getToastTemperature()).thenReturn(20);
		when(mockedTortilla.getCurrentTemperature()).thenReturn(2, 6, 10, 14, 18, 22);
		when(mockedQueso.getMeltingTemperature()).thenReturn(25);
		when(mockedQueso.getCurrentTemperature()).thenReturn(7, 10, 13, 16, 19, 22);

		when(mockedQueso.isMelted()).thenReturn(false);
		when(mockedTortilla.isToasted()).thenReturn(true);

		Assert.assertEquals("Terrible quesadilla", quesadilla.prepareSingle());
		
		verify(mockedTortilla, atLeastOnce()).toast(true);
		verify(mockedQueso, never()).melt(true);
	}

	@Test
	public void noHayGas() {
		when(mockedTortilla.getToastTemperature()).thenReturn(20);
		when(mockedTortilla.getCurrentTemperature()).thenReturn(21);
		when(mockedQueso.getMeltingTemperature()).thenReturn(20);
		when(mockedQueso.getCurrentTemperature()).thenReturn(21);

		when(mockedQueso.isMelted()).thenReturn(false);
		when(mockedTortilla.isToasted()).thenReturn(false);

		Assert.assertEquals("You ran out of gas", quesadilla.prepareSingle());
		
		verify(mockedTortilla, never()).toast(true);
		verify(mockedQueso, never()).melt(true);
	}
}