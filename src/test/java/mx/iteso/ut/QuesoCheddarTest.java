package mx.iteso.ut;

import org.junit.Test;
import org.junit.Before;
import org.junit.Assert;

public class QuesoCheddarTest {

	QuesoCheddar quesito = new QuesoCheddar();

	@Before
	public void SetUp() {
		quesito.setCurrentTemperature(23);
		quesito.melTemp = 21;
	}

	@Test
	public void getCurrentTemperature() {
		Assert.assertEquals(23, quesito.getCurrentTemperature());
	}

	@Test
	public void getMeltingTemperature() {
		Assert.assertEquals(21, quesito.getMeltingTemperature());
	}

	@Test
	public void melt() {
		quesito.melt(true);
		Assert.assertEquals(true, quesito.isMelted());
	}

}
