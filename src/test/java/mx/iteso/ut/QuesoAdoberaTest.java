package mx.iteso.ut;

import org.junit.Test;
import org.junit.Before;
import org.junit.Assert;

public class QuesoAdoberaTest {
	
	QuesoAdobera quesito = new QuesoAdobera();
	
	@Before
    public void SetUp(){
     quesito.setCurrentTemperature(17);
     quesito.melTemp = 20;
    }

    @Test
    public void getCurrentTemperature(){
        Assert.assertEquals(17, quesito.getCurrentTemperature());
    }
    
    @Test
    public void getMeltingTemperature(){
        Assert.assertEquals(20, quesito.getMeltingTemperature());
    }

    @Test
    public void  melt(){
    	quesito.melt(false);
        Assert.assertEquals(false, quesito.isMelted());
    }

}
