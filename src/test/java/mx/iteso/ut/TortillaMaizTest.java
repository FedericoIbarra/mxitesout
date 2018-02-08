package mx.iteso.ut;
import org.junit.*;


public class TortillaMaizTest {
	TortillaMaiz tortilla;

	@Before
	public void SetUp() {
		tortilla = new TortillaMaiz();
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
