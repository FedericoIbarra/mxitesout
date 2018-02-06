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
		when(mockedQueso.isMelted()).thenReturn(true);
		when(mockedTortilla.isToasted()).thenReturn(true);
		
		Assert.assertEquals("Perfect quesadilla", quesadilla.prepareSingle());
	}

	@Test
	public void quesadillaBuena() {
		when(mockedQueso.isMelted()).thenReturn(true);
		when(mockedTortilla.isToasted()).thenReturn(false);
	
		Assert.assertEquals("Good quesadilla", quesadilla.prepareSingle());
	}

	@Test
	public void quesadillaTerrible() {
		when(mockedQueso.isMelted()).thenReturn(false);
		when(mockedTortilla.isToasted()).thenReturn(true);

		Assert.assertEquals("Terrible quesadilla", quesadilla.prepareSingle());
	}

	@Test
	public void noHayGas() {
		when(mockedQueso.isMelted()).thenReturn(false);
		when(mockedTortilla.isToasted()).thenReturn(false);

		Assert.assertEquals("You ran out of gas", quesadilla.prepareSingle());
	}
}