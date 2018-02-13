package mx.iteso.ut;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class QuesadillaTest
{
    Quesadilla quesadilla;
    Queso mockedQueso;
    Tortilla mockedTortilla;

    @Before
    public void setUp(){
        quesadilla = new Quesadilla();
        mockedTortilla = mock(Tortilla.class);
        mockedQueso = mock(Queso.class);
        quesadilla.setQueso(mockedQueso);
        quesadilla.setTortilla(mockedTortilla);

    }
    @Test
    public void quesadillaPerfecta(){
        when(mockedTortilla.getToastTemperature()).thenReturn(20);
        when(mockedTortilla.getCurrentTemperature()).thenReturn(2,6,10,14,18,22);


        if(mockedTortilla.getCurrentTemperature() >= mockedTortilla.getToastTemperature()){
            when(mockedTortilla.isToasted()).thenReturn(true);
        }


        when(mockedQueso.getMeltingTemperature()).thenReturn(20);
        when(mockedQueso.getCurrentTemperature()).thenReturn(2,6,10,14,18,22);
        when(mockedQueso.isMelted()).thenReturn(true);

        //quesadilla.setHeatLevel(2);
        assertEquals("Perfect quesadilla", quesadilla.prepareSingle());
    }
    @Test
    public void quesadillaBuena(){

    }
    @Test
    public void quesadillaTerrible(){

    }
    @Test
    public void noHayGas(){

    }
}
