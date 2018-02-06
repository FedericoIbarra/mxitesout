package mx.iteso.ut;

import org.junit.Test;

import junit.framework.Assert;

import org.junit.Before;
import static org.mockito.Mockito.*;

import java.util.Random;

public class TortillaHarinaTest {
	
	static Random rand = new Random(System.currentTimeMillis());
	
	TortillaHarina th;
	
	@Before
	public void setup(){
		th = new TortillaHarina();
		rand = new Random(System.currentTimeMillis());
	}
	
	@Test
	public void setCurrentTemperatureTest() {
		int intended = rand.nextInt(100);
		th.setCurrentTemperature(intended);
		
		Assert.assertTrue(th.getCurrentTemperature()==intended);
	}
}
