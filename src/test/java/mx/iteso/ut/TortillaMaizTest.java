package mx.iteso.ut;

import org.junit.Test;
import org.junit.Before;
import org.junit.Assert;

public class TortillaMaizTest {

	TortillaMaiz torti = new TortillaMaiz();

	@Before
	public void SetUp() {
		torti.setCurrentTemperature(23);
		torti.toastTemp = 20;
	}

	@Test
	public void getCurrentTemperature() {
		Assert.assertEquals(23, torti.getCurrentTemperature());
	}

	@Test
	public void getMeltingTemperature() {
		Assert.assertEquals(20, torti.getToastTemperature());
	}

	@Test
	public void toast() {
		torti.toast(true);
		Assert.assertEquals(true, torti.isToasted());
	}
	
}
