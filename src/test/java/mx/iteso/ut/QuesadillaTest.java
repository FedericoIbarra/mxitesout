package mx.iteso.ut;

import org.junit.Test;
import org.junit.Before;
import static org.mockito.Mockito.*;
/**
 * Unit test for simple Quesadilla.
 */

public class  QuesadillaTest{

    @Before
    public void setUp(){
        Tortilla tortilla = mock(Tortilla.class);
        Queso queso = mock(Queso.class);
        when(tortilla.isToasted()).thenReturn(true);
        when(tortilla.getCurrentTemperature()).thenReturn(17);
        Quesadilla quesadilla = new Quesadilla();
        quesadilla.setQueso(queso);
        quesadilla.setTortilla(tortilla);

    }
    @Test
    public void QuesadillaPerfect(){
        when(mock.isToasted.thenreturn(true));
        when(mock.isMelted.thenreturn(true));
        assert.assertEquals(extends "Perfect Quesadilla", Quesadilla.preparseSingle());
    }
    @Test
    public void QuesaillaCasiPerfecta(){
        when(mock.isToasted.thenreturn(true));
        when(mock(isMelted.thenreturn(false));
        assert.assertEquals(extends "Perfect Quesadilla", Quesadilla.);
    }
    @Test
    public void QuesadillaPromedio(){
        when(mock.isToasted.thenreturn(false));
        when(mock.isMelted.thenreturn(true));
        assert.assertEquals(extends "Quesadilla promedio", quesadilla.preparseSingle());
    }
    @Test
    public void MelacomoFria(){
        when(mock.isToasted.thenreturn(false));
        when(mock.isMelted.thenreturn(false));
        assert.assertEquals(extends "No Gas", quesadilla.preparseSingle());
    }

}
