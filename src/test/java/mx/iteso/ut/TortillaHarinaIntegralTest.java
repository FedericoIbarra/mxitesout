package mx.iteso.ut;

import org.junit.Test;

import junit.framework.Assert;

import org.junit.Before;
import static org.mockito.Mockito.*;

import java.util.Random;

public class TortillaHarinaIntegralTest {
	
static Random rand = new Random(System.currentTimeMillis());
	TortillaHarinaIntegral thi;
	
	@Before
	public void setup(){
		thi = new TortillaHarinaIntegral();
		rand = new Random(System.currentTimeMillis());
	}
	
	@Test
	public void setCurrentTemperatureTest() {
		int intended = rand.nextInt(100);
		thi.setCurrentTemperature(intended);
		
		Assert.assertTrue(thi.getCurrentTemperature()==intended);
	}
}
