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

        //compare if it is a perfect quesadilla
        Assert.assertEquals("Perfect quesadilla", quesadilla.prepareSingle());

        //check if the function enters the cycle
        verify(mTortilla, atLeastOnce()).toast(true);
        verify(mQueso, atLeastOnce()).melt(true);
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

        //compare if it is a perfect quesadilla
        Assert.assertEquals("Good quesadilla", quesadilla.prepareSingle());

        //check if the function enters to the cycle
        verify(mQueso, atLeastOnce()).melt(true);
        verify(mTortilla, atLeastOnce()).toast(false);


    }

    @Test
    public void terribleQuesadilla(){
        when(mTortilla.getToastTemperature()).thenReturn(20);
        when(mTortilla.getCurrentTemperature()).thenReturn(2,6,10);

        when(mQueso.getMeltingTemperature()).thenReturn(10);
        when(mQueso.getCurrentTemperature()).thenReturn(2,6,10);

        //Conditions to be a terrible quesadilla
        when(mTortilla.isToasted()).thenReturn(true);
        when(mQueso.isMelted()).thenReturn(false);

        //compare if it is a perfect quesadilla
        Assert.assertEquals("Terrible quesadilla", quesadilla.prepareSingle());

        //check if the function enters to the cycle
        verify(mTortilla, atLeastOnce()).toast(true);
        verify(mQueso, never()).melt(true);
        //verify(mQueso, atLeastOnce()).melt(false);
        //verify(mTortilla, atLeastOnce()).toast(true);
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

        //compare if it is a perfect quesadilla
        Assert.assertEquals("You ran out of gas", quesadilla.prepareSingle());

        //check if the function enters to the cycle
        verify(mTortilla, never()).toast(true);
        verify(mQueso, never()).melt(true);
    }
   
}
