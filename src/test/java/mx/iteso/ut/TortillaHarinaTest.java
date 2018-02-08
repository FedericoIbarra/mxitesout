package mx.iteso.ut;

import org.junit.Test;
import org.junit.Before;
import org.junit.Assert;

public class TortillaHarinaTest {

	TortillaHarina torti = new TortillaHarina();

	@Before
	public void SetUp() {
		torti.setCurrentTemperature(15);
		torti.toastTemp = 17;
	}

	@Test
	public void getCurrentTemperature() {
		Assert.assertEquals(15, torti.getCurrentTemperature());
	}

	@Test
	public void getMeltingTemperature() {
		Assert.assertEquals(17, torti.getToastTemperature());
	}

	@Test
	public void toast() {
		torti.toast(false);
		Assert.assertEquals(false, torti.isToasted());
	}
	
}
