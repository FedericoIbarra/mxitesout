package mx.iteso.ut;

import org.junit.*;

public class QuesoManchegoTest {
	QuesoManchego queso;

	@Before
	public void SetUp() {
		queso = new QuesoManchego();
	}

	@Test
	public void setCTemperature() {
		queso.setCurrentTemperature(18);
		Assert.assertEquals(18, queso.getCurrentTemperature());
	}

	@Test
	public void Melt() {
		queso.melt(true);
		Assert.assertEquals(true, queso.isMelted());
	}

}
