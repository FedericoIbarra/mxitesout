package mx.iteso.ut;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TortillaHarinaTest {

	TortillaHarina tortilla = new TortillaHarina();

	@Before
	public void setUp() {
		tortilla = mock(TortillaHarina.class);
	}

	@Test
	public void setCurrent() {
		when(tortilla.getCurrentTemperature()).thenReturn(10);
		Assert.assertEquals(10, tortilla.getCurrentTemperature());
	}

	@Test
	public void meltCheese() {
		when(tortilla.getCurrentTemperature()).thenReturn(20);
		when(tortilla.isToasted()).thenReturn(true);
		Assert.assertEquals(true, tortilla.isToasted());
	}

}
