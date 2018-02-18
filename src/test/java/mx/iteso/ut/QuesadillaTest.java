package mx.iteso.ut;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.mockito.Mockito.*;

public class QuesadillaTest
{
    Quesadilla quesadilla;
    Queso mockedQueso;
    Tortilla mockedTortilla;
    Tortilla mockedTortilla2;

    @Before
    public void setUp(){
        quesadilla = new Quesadilla();
        mockedQueso = mock(Queso.class);
        mockedTortilla = mock(Tortilla.class);
        quesadilla.setQueso(mockedQueso);
        quesadilla.setTortilla(mockedTortilla);
        mockedTortilla2 = mock(Tortilla.class);
        quesadilla.setTortilla2(mockedTortilla2);

    }

    @Test
    public void quesadillaPerfecta(){
        when(mockedQueso.isMelted()).thenReturn(true);
        when(mockedTortilla.isToasted()).thenReturn(true);
        when(mockedTortilla.getCurrentTemp()).thenReturn(2,8,8,8,14);
        when(mockedTortilla.getToastTem()).thenReturn(10);
        when(mockedQueso.getCurrentTemp()).thenReturn(2,8,8,8,14);
        when(mockedQueso.getMeltingTemperature()).thenReturn(10);
        assertEquals("Perfect quesadilla",quesadilla.prepareSingle());
        verify(mockedTortilla,times(1)).toast(true);
        verify(mockedQueso,times(1)).melt(true);
    }
    @Test
    public void quesadillaBuena(){
        when(mockedQueso.isMelted()).thenReturn(true);
        when(mockedTortilla.isToasted()).thenReturn(false);
        when(mockedTortilla.getCurrentTemp()).thenReturn(2,8,8,8,14);
        when(mockedTortilla.getToastTem()).thenReturn(20);
        when(mockedQueso.getCurrentTemp()).thenReturn(2,8,8,8,14);
        when(mockedQueso.getMeltingTemperature()).thenReturn(10);
        assertEquals("Good quesadilla",quesadilla.prepareSingle());
        verify(mockedTortilla,never()).toast(true);
        verify(mockedQueso,times(1)).melt(true);
    }
    @Test
    public void quesadillaTerrible(){
        when(mockedQueso.isMelted()).thenReturn(false);
        when(mockedTortilla.isToasted()).thenReturn(true);
        when(mockedTortilla.getCurrentTemp()).thenReturn(2,8,8,8,14);
        when(mockedTortilla.getToastTem()).thenReturn(10);
        when(mockedQueso.getCurrentTemp()).thenReturn(2,8,8,8,14);
        when(mockedQueso.getMeltingTemperature()).thenReturn(20);
        assertEquals("Terrible quesadilla",quesadilla.prepareSingle());
        verify(mockedTortilla,times(1)).toast(true);
        verify(mockedQueso,never()).melt(true);
    }

    @Test
    public void noHayGas(){
        when(mockedQueso.isMelted()).thenReturn(false);
        when(mockedTortilla.isToasted()).thenReturn(false);
        when(mockedTortilla.getCurrentTemp()).thenReturn(2,8,8,8,14);
        when(mockedTortilla.getToastTem()).thenReturn(1);
        when(mockedQueso.getCurrentTemp()).thenReturn(2,8,8,8,14);
        when(mockedQueso.getMeltingTemperature()).thenReturn(1);
        assertEquals("You ran out of gas",quesadilla.prepareSingle());
        verify(mockedTortilla,never()).toast(true);
        verify(mockedQueso,never()).melt(true);
    }



    @Test
    public void spledidDoubleQuesadilla(){
        when (mockedQueso.isMelted()).thenReturn(true);
        when (mockedTortilla.isToasted()).thenReturn(true);
        when (mockedTortilla2.isToasted()).thenReturn(true);
        when(mockedTortilla.getCurrentTemp()).thenReturn(2,8,8,8,14);
        when(mockedTortilla2.getCurrentTemp()).thenReturn(2,8,8,8,14);
        when(mockedQueso.getCurrentTemp()).thenReturn(2,8,8,8,14);

        when (mockedTortilla.getToastTem()).thenReturn(10);
        when (mockedTortilla2.getToastTem()).thenReturn(10);
        when (mockedQueso.getMeltingTemperature()).thenReturn(10);

        assertEquals("Spledid double quesadilla", quesadilla.prepareDouble());

        verify(mockedTortilla,times(1)).toast(true);
        verify(mockedTortilla2, times(1)).toast(true);
        verify(mockedQueso, times(1)).melt(true);
    }

    @Test
    public void tortillaOneToastedQuesoMelted(){
        when (mockedQueso.isMelted()).thenReturn(true);
        when (mockedTortilla.isToasted()).thenReturn(true);
        when (mockedTortilla2.isToasted()).thenReturn(false);
        when(mockedTortilla.getCurrentTemp()).thenReturn(2,8,8,8,14);
        when(mockedTortilla2.getCurrentTemp()).thenReturn(2,8,8,8,14);
        when(mockedQueso.getCurrentTemp()).thenReturn(2,8,8,8,14);

        when (mockedTortilla.getToastTem()).thenReturn(10);
        when (mockedTortilla2.getToastTem()).thenReturn(20);
        when (mockedQueso.getMeltingTemperature()).thenReturn(10);

        assertEquals("Just a good  double quesadilla", quesadilla.prepareDouble());

        verify(mockedTortilla,times(1)).toast(true);
        verify(mockedTortilla2, never()).toast(true);
        verify(mockedQueso, times(1)).melt(true);
    }

    @Test
    public void tortillaTwoToastedQuesoMelted(){
        when (mockedQueso.isMelted()).thenReturn(true);
        when (mockedTortilla2.isToasted()).thenReturn(true);
        when (mockedTortilla.isToasted()).thenReturn(false);
        when(mockedTortilla.getCurrentTemp()).thenReturn(2,8,8,8,14);
        when(mockedTortilla2.getCurrentTemp()).thenReturn(2,8,8,8,14);
        when(mockedQueso.getCurrentTemp()).thenReturn(2,8,8,8,14);

        when (mockedTortilla.getToastTem()).thenReturn(20);
        when (mockedTortilla2.getToastTem()).thenReturn(10);
        when (mockedQueso.getMeltingTemperature()).thenReturn(10);

        assertEquals("Just a good  double quesadilla", quesadilla.prepareDouble());

        verify(mockedTortilla2,times(1)).toast(true);
        verify(mockedTortilla, never()).toast(true);
        verify(mockedQueso, times(1)).melt(true);
    }

    @Test
    public void tortillaOneToastedQuesoNotMelted(){
        when (mockedQueso.isMelted()).thenReturn(false);
        when (mockedTortilla2.isToasted()).thenReturn(false);
        when (mockedTortilla.isToasted()).thenReturn(true);
        when(mockedTortilla.getCurrentTemp()).thenReturn(2,8,8,8,14);
        when(mockedTortilla2.getCurrentTemp()).thenReturn(2,8,8,8,14);
        when(mockedQueso.getCurrentTemp()).thenReturn(2,8,8,8,14);

        when (mockedTortilla.getToastTem()).thenReturn(10);
        when (mockedTortilla2.getToastTem()).thenReturn(20);
        when (mockedQueso.getMeltingTemperature()).thenReturn(20);

        assertEquals("Notoriously bad quesadilla", quesadilla.prepareDouble());

        verify(mockedTortilla,times(1)).toast(true);
        verify(mockedTortilla2, never()).toast(true);
        verify(mockedQueso, never()).melt(true);
    }

    @Test
    public void tortillaTwoToastedQuesoNotMelted(){
        when (mockedQueso.isMelted()).thenReturn(false);
        when (mockedTortilla2.isToasted()).thenReturn(true);
        when (mockedTortilla.isToasted()).thenReturn(false);
        when(mockedTortilla.getCurrentTemp()).thenReturn(2,8,8,8,14);
        when(mockedTortilla2.getCurrentTemp()).thenReturn(2,8,8,8,14);
        when(mockedQueso.getCurrentTemp()).thenReturn(2,8,8,8,14);

        when (mockedTortilla.getToastTem()).thenReturn(20);
        when (mockedTortilla2.getToastTem()).thenReturn(10);
        when (mockedQueso.getMeltingTemperature()).thenReturn(20);

        assertEquals("Notoriously bad quesadilla", quesadilla.prepareDouble());

        verify(mockedTortilla2,times(1)).toast(true);
        verify(mockedTortilla, never()).toast(true);
        verify(mockedQueso, never()).melt(true);
    }

    @Test
    public void tortillasToastedQuesoNotMelted(){
        when (mockedQueso.isMelted()).thenReturn(false);
        when (mockedTortilla2.isToasted()).thenReturn(true);
        when (mockedTortilla.isToasted()).thenReturn(true);
        when(mockedTortilla.getCurrentTemp()).thenReturn(2,8,8,8,14);
        when(mockedTortilla2.getCurrentTemp()).thenReturn(2,8,8,8,14);
        when(mockedQueso.getCurrentTemp()).thenReturn(2,8,8,8,14);

        when (mockedTortilla.getToastTem()).thenReturn(10);
        when (mockedTortilla2.getToastTem()).thenReturn(10);
        when (mockedQueso.getMeltingTemperature()).thenReturn(20);

        assertEquals("Weak double quesadilla", quesadilla.prepareDouble());

        verify(mockedTortilla2,times(1)).toast(true);
        verify(mockedTortilla,times(1)).toast(true);
        verify(mockedQueso, never()).melt(true);
    }

    @Test
    public void pleseQuit(){
        when (mockedQueso.isMelted()).thenReturn(false);
        when (mockedTortilla2.isToasted()).thenReturn(false);
        when (mockedTortilla.isToasted()).thenReturn(false);
        when(mockedTortilla.getCurrentTemp()).thenReturn(2,8,8,8,14);
        when(mockedTortilla2.getCurrentTemp()).thenReturn(2,8,8,8,14);
        when(mockedQueso.getCurrentTemp()).thenReturn(2,8,8,8,14);

        when (mockedTortilla.getToastTem()).thenReturn(1);
        when (mockedTortilla2.getToastTem()).thenReturn(1);
        when (mockedQueso.getMeltingTemperature()).thenReturn(1);

        assertEquals("Go get UberEats, please!", quesadilla.prepareDouble());

        verify(mockedTortilla2,never()).toast(true);
        verify(mockedTortilla,never()).toast(true);
        verify(mockedQueso, never()).melt(true);
    }
}
