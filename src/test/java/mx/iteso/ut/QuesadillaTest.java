package mx.iteso.ut;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.mockito.Mock;

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
    /*public Tortilla mock_tortilla= mock(Tortilla.class);
    public Queso mock_queso = mock(Queso.class);
    public Quesadilla quesadilla = new Quesadilla();*/
    @Mock
    Quesadilla quesadilla;
    Queso mockedQueso;
    Tortilla mockedTortilla;


    @Before
    public void setUp (){
        /*quesadilla.setQueso(mock_queso);
        quesadilla.setTortilla(mock_tortilla);*/
        quesadilla = new Quesadilla();
        mockedTortilla = mock(Tortilla.class);
        mockedQueso = mock(Queso.class);
        quesadilla.setQueso(mockedQueso);
        quesadilla.setTortilla(mockedTortilla);
    }

    @Test
    public void perfectQuesadilla(){
        when(mockedTortilla.getToastTemperature()).thenReturn(20);
        when(mockedTortilla.getCurrentTemperature()).thenReturn(10,10,20);

        when(mockedQueso.getMeltingTemperature()).thenReturn(20);
        when(mockedQueso.getCurrentTemperature()).thenReturn(10,10,20);

        when(mockedQueso.isMelted()).thenReturn(true);
        when(mockedTortilla.isToasted()).thenReturn(true);
        Assert.assertEquals("Perfect quesadilla", quesadilla.prepareSingle());

        verify(quesadilla.getQueso(), times(4)).getCurrentTemperature();
        verify(quesadilla.getTortilla(), times(3)).getCurrentTemperature();

        verify(mockedQueso, times(1)).melt(true);
        verify(mockedTortilla, times(1)).toast(true);

    }

    @Test
    public void goodQuesadilla(){
        when(mockedTortilla.getToastTemperature()).thenReturn(30);
        when(mockedTortilla.getCurrentTemperature()).thenReturn(10,10,20);

        when(mockedQueso.getMeltingTemperature()).thenReturn(20);
        when(mockedQueso.getCurrentTemperature()).thenReturn(10,20,20);

        when(mockedQueso.isMelted()).thenReturn(true);
        when(mockedTortilla.isToasted()).thenReturn(false);
        Assert.assertEquals("Good quesadilla", quesadilla.prepareSingle());

        verify(quesadilla.getQueso(), times(4)).getCurrentTemperature();
        verify(quesadilla.getTortilla(), times(3)).getCurrentTemperature();

        verify(mockedQueso, times(1)).melt(true);
        verify(mockedTortilla, times(0)).toast(true);
    }


    @Test
    public void terribleQuesadilla(){
        when(mockedTortilla.getToastTemperature()).thenReturn(20);
        when(mockedTortilla.getCurrentTemperature()).thenReturn(10,10,20);

        when(mockedQueso.getMeltingTemperature()).thenReturn(30);
        when(mockedQueso.getCurrentTemperature()).thenReturn(10,20,20);

        when(mockedQueso.isMelted()).thenReturn(false);
        when(mockedTortilla.isToasted()).thenReturn(true);
        Assert.assertEquals("Terrible quesadilla", quesadilla.prepareSingle());

        verify(quesadilla.getQueso(), times(4)).getCurrentTemperature();
        verify(quesadilla.getTortilla(), times(4)).getCurrentTemperature();

        verify(mockedQueso, times(0)).melt(true);
        verify(mockedTortilla, times(1)).toast(true);
    }

    @Test
    public void noQuesadilla(){
        when(mockedTortilla.getToastTemperature()).thenReturn(10);
        when(mockedTortilla.getCurrentTemperature()).thenReturn(20);

        when(mockedQueso.getMeltingTemperature()).thenReturn(10);
        when(mockedQueso.getCurrentTemperature()).thenReturn(20);

        when(mockedQueso.isMelted()).thenReturn(false);
        when(mockedTortilla.isToasted()).thenReturn(false);
        Assert.assertEquals("You ran out of gas", quesadilla.prepareSingle());

        verify(quesadilla.getQueso(), times(1)).getCurrentTemperature();
        verify(quesadilla.getTortilla(), times(0)).getCurrentTemperature();

        verify(mockedQueso, times(0)).melt(true);
        verify(mockedTortilla, times(0)).toast(true);
    }
}



