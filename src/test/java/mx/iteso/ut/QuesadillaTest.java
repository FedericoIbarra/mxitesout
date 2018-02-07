package mx.iteso.ut;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import static org.mockito.Mockito.*;

/*import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Before;*/


/**
 * Unit test for simple Quesadilla.
 *
 *
**/

public class QuesadillaTest{
    public Tortilla mock_tortilla= mock(Tortilla.class);
    public Queso mock_queso = mock(Queso.class);
    public Quesadilla quesadilla = new Quesadilla();
    /*Quesadilla quesadilla;
    Queso mockedQueso;
    Tortilla mockedTortilla;*/

    @Before
    public void setUp (){
        quesadilla.setQueso(mock_queso);
        quesadilla.setTortilla(mock_tortilla);
        /*quesadilla = new Quesadilla();
        mockedTortilla = mock(Tortilla.class);
        mockedQueso = mock(Queso.class);
        quesadilla.setQueso(mockedQueso);
        quesadilla.setTortilla(mockedTortilla);*/
    }

    @Test
    public void perfectQuesadilla(){
        when(mock_tortilla.isToasted()).thenReturn(true);
        when(mock_queso.isMelted()).thenReturn(true);
        /*quesadilla.setHeatLevel(2);

        when(quesadilla.getQueso().getCurrentTemperature()).thenReturn(6,6,8);
        when(quesadilla.getQueso().getMeltingTemperature()).thenReturn(8);

        when(quesadilla.getTortilla().getCurrentTemperature()).thenReturn(6,8,8);
        when(quesadilla.getTortilla().getToastTemperature()).thenReturn(8);*/

        //when(mockedTortilla.getToastTemperature()).thenReturn(20);
        //when(mockedTortilla.getCurrentTemperature()).thenReturn(2,6,10,14,18,22);

        //when(mockedQueso.getMeltingTemperature()).thenReturn(20);
        //when(mockedQueso.getCurrentTemperature()).thenReturn(2,6,10,14,18,22);

        Assert.assertEquals("Perfect quesadilla", quesadilla.prepareSingle());
    }

    @Test
    public void goodQuesadilla(){
        when(mock_tortilla.isToasted()).thenReturn(false);
        when(mock_queso.isMelted()).thenReturn(true);
        Assert.assertEquals("Good quesadilla", quesadilla.prepareSingle());
    }

    @Test
    public void terribleQuesadilla(){
        when(mock_tortilla.isToasted()).thenReturn(true);
        when(mock_queso.isMelted()).thenReturn(false);
        Assert.assertEquals("Terrible quesadilla", quesadilla.prepareSingle());
    }

    @Test
    public void noQuesadilla(){
        when(mock_tortilla.isToasted()).thenReturn(false);
        when(mock_queso.isMelted()).thenReturn(false);
        Assert.assertEquals("You ran out of gas", quesadilla.prepareSingle());
    }
}



