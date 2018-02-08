package mx.iteso.ut;

import org.junit.Test;
import org.junit.Before;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

/**
 * Unit test for simple Quesadilla.
 */
public class QuesadillaTest{
    Quesadilla quesadilla;
    Queso mockedQueso;
    Tortilla mockedTortilla;

    // Preparar la clase para el test
    @Before
    public void setUp(){
        quesadilla = new Quesadilla();
        mockedTortilla = mock(Tortilla.class);
        mockedQueso = mock(Queso.class);
        quesadilla.setQueso(mockedQueso);
        quesadilla.setTortilla(mockedTortilla);
        quesadilla.setHeatLevel(4);
    }

    @Test
    public void perfectQuesadilla(){
        // ¿Para qué me sirve poner estos 4 when...
        when(mockedTortilla.getToastTemperature()).thenReturn(20);
        when(mockedTortilla.getCurrentTemperature()).thenReturn(2,6,10,14,18,22);

        when(mockedQueso.getMeltingTemperature()).thenReturn(15);
        when(mockedQueso.getCurrentTemperature()).thenReturn(2,6,10,14,18,22);

        // ... si con éstos dos puedo hacer que la prueba se valide?
        when(mockedTortilla.isToasted()).thenReturn(true);
        when(mockedQueso.isMelted()).thenReturn(true);

        // Supongo que sirven para la ejecución del while, pero no entiendo cómo probar
        // que se está entrando al ciclo y que se están usando los valores de 2, 6, 10...
        // Profe, la verdad me gustaría tener una clase guiada por ud sobre este tema, no entiendo muchas cosas
        assertSame("Perfect quesadilla", quesadilla.prepareSingle());
    }

    @Test
    public void goodQuesadilla(){
        when(mockedTortilla.isToasted()).thenReturn(false);
        when(mockedQueso.isMelted()).thenReturn(true);

        assertSame("Good quesadilla", quesadilla.prepareSingle());
    }

    @Test
    public void terribleQuesadilla(){
        when(mockedTortilla.isToasted()).thenReturn(true);
        when(mockedQueso.isMelted()).thenReturn(false);

        assertSame("Terrible quesadilla", quesadilla.prepareSingle());
    }

    @Test
    public void noGas(){
        when(mockedTortilla.isToasted()).thenReturn(false);
        when(mockedQueso.isMelted()).thenReturn(false);

        assertSame("You ran out of gas", quesadilla.prepareSingle());
    }

}
