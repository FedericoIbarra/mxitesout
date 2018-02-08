package mx.iteso.ut;
import org.junit.*;


public class TortillaHarinaTest {
	TortillaHarina tortilla;

	@Before
	public void SetUp() {
		tortilla = new TortillaHarina();
	}

	@Test
	public void setCTemperature() {
		tortilla.setCurrentTemperature(14);
		Assert.assertEquals(14, tortilla.getCurrentTemperature());
	}
	@Test
	public void Toast() {
		tortilla.toast(true);
		Assert.assertEquals(true, tortilla.isToasted());
	}

}
