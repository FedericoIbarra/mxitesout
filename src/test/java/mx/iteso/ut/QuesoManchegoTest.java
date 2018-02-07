package mx.iteso.ut;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QuesoManchegoTest {
	
	QuesoManchego queso = new QuesoManchego();
	
	@Before
	public void setUp(){
		queso = mock(QuesoManchego.class);
	}
	
	
	@Test
	public void setCurrent(){
		when(queso.getCurrentTemperature()).thenReturn(10);
		Assert.assertEquals(10,queso.getCurrentTemperature());
	}
	
	@Test
	public void meltCheese(){
		when(queso.getCurrentTemperature()).thenReturn(20);
		when(queso.isMelted()).thenReturn(true);
		Assert.assertEquals(true, queso.isMelted());
	}
	
}
