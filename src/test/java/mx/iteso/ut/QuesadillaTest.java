package mx.iteso.ut;


import org.junit.Assert;
import org.junit.Before;
import org.junit .Test;
import static org.mockito.Mockito.*;




/**
 * Unit test for simple Quesadilla.
 */
public class QuesadillaTest{
    private Tortilla mTortilla;
    private Queso mQueso;
    private  Quesadilla quesadilla;
    @Before
    public void setup(){
        mTortilla = mock(Tortilla.class);
        mQueso = mock(Queso.class);
        quesadilla = new Quesadilla();
        quesadilla.setQueso(mQueso);
        quesadilla.setTortilla(mTortilla);
    }

    @Test
    public void perfectQuesadilla(){
        when(mTortilla.getToastTemperature()).thenReturn(20);
        when(mTortilla.getCurrentTemperature()).thenReturn(2,6,10,14,18,22);

        when(mQueso.getMeltingTemperature()).thenReturn(20);
        when(mQueso.getCurrentTemperature()).thenReturn(2,6,10,14,18,22);

        //Conditions to be a perfect quesadilla
        when(mQueso.isMelted()).thenReturn(true);
        when(mTortilla.isToasted()).thenReturn(true);
        //assert if it is a perfect quesadilla
        Assert.assertEquals("Perfect quesadilla", quesadilla.prepareSingle());



        /*
        verify(quesadilla.getQueso(), times(4)).getCurrentTemperature();
        verify(quesadilla.getTortilla(), times(3)).getCurrentTemperature();

        verify(mockedQueso, times(1)).melt(true);
        verify(mockedTortilla, times(1)).toast(true);


        or

        verify(mockedTortilla, atLeastOnce()).toast(true);
        verify(mockedQueso, atLeastOnce()).melt(true);
        */
    }

    @Test
    public void goodQuesadilla(){
        when(mTortilla.getToastTemperature()).thenReturn(10);
        when(mTortilla.getCurrentTemperature()).thenReturn(2,6,10);

        when(mQueso.getMeltingTemperature()).thenReturn(10);
        when(mQueso.getCurrentTemperature()).thenReturn(2,6,10);

        //Conditions to be a good quesadilla
        when(mTortilla.isToasted()).thenReturn(false);
        when(mQueso.isMelted()).thenReturn(true);

        //assert if it is a perfect quesadilla
        Assert.assertEquals("Good quesadilla", quesadilla.prepareSingle());
        /*
        verify(mockedQueso, atLeastOnce()).melt(true);
        verify(mockedTortilla, atLeastOnce()).toast(false);
        */
    }

    @Test
    public void terribleQuesadilla(){
        when(mTortilla.getToastTemperature()).thenReturn(5);
        when(mTortilla.getCurrentTemperature()).thenReturn(2,6,10);

        when(mQueso.getMeltingTemperature()).thenReturn(5);
        when(mQueso.getCurrentTemperature()).thenReturn(2,6,10);

        //Conditions to be a terrible quesadilla
        when(mTortilla.isToasted()).thenReturn(true);
        when(mQueso.isMelted()).thenReturn(false);

        //assert if it is a perfect quesadilla
        Assert.assertEquals("Terrible quesadilla", quesadilla.prepareSingle());
    }

    @Test
    public void outOfGas(){
        when(mTortilla.getToastTemperature()).thenReturn(10);
        when(mTortilla.getCurrentTemperature()).thenReturn(10);

        when(mQueso.getMeltingTemperature()).thenReturn(10);
        when(mQueso.getCurrentTemperature()).thenReturn(10);

        //Conditions to be a good quesadilla
        when(mTortilla.isToasted()).thenReturn(false);
        when(mQueso.isMelted()).thenReturn(false);

        //assert if it is a perfect quesadilla
        Assert.assertEquals("You ran out of gas", quesadilla.prepareSingle());
    }
   
}
