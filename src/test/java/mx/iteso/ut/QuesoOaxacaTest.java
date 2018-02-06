package mx.iteso.ut;

import org.junit.Test;

import junit.framework.Assert;

import org.junit.Before;
import static org.mockito.Mockito.*;

import java.util.Random;

public class QuesoOaxacaTest {
	
	static Random rand = new Random(System.currentTimeMillis());
	
	QuesoOaxaca qm;
	
	@Before
	public void setup(){
		qm = new QuesoOaxaca();
		rand = new Random(System.currentTimeMillis());
	}
	
	@Test
	public void setCurrentTemperatureTest() {
		int intended = rand.nextInt(100);
		qm.setCurrentTemperature(intended);
		
		Assert.assertTrue(qm.getCurrentTemperature()==intended);
	}
}
