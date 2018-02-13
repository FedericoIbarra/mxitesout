package mx.iteso.ut;

import org.junit.Test;

import static org.junit.Assert.*;

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
		
		assertTrue(thi.getCurrentTemperature()==intended);
	}
}
