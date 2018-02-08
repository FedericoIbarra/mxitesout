package mx.iteso.ut;

import org.junit.*;


public class QuesoOaxacaTest {
	QuesoOaxaca queso;

	@Before
	public void SetUp() {
		queso = new QuesoOaxaca();
	}

	@Test
	public void setCTemperature() {
		queso.setCurrentTemperature(14);
		Assert.assertEquals(14, queso.getCurrentTemperature());
	}

	@Test
	public void Melt() {
		queso.melt(true);
		Assert.assertEquals(true, queso.isMelted());
	}

}
