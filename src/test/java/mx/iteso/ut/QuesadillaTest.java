package mx.iteso.ut;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 * Unit test for simple Quesadilla.
 */
public class QuesadillaTest
{
    protected TortillaPerron tortilla;
    protected QuesoPerron queso;
    protected Quesadilla quesadilla;

    @Before
    public void SetUp(){
        //Tortilla tortilla = mock(Tortilla.class);
        tortilla = new TortillaPerron();
        //Queso queso = mock(Queso.class);
        queso = new QuesoPerron();
        quesadilla = new Quesadilla();
        quesadilla.setQueso(queso);
        quesadilla.setTortilla(tortilla);
    }
    @Test
    public void QuesadillaPerfecta(){
        //when(tortilla.isToasted()).testReturn(true);
        quesadilla.setHeatLevel(75);
        assertEquals("La quesadilla no fue perfecta", "Perfect quesadilla", quesadilla.prepareSingle());
    }

    @Test
    public void QuesadillaBuena(){
        quesadilla.setHeatLevel(10);
        assertEquals("La quesadilla no fue buena", "Good quesadilla", quesadilla.prepareSingle());
    }
    @Test
    public void QuesadillaTerrible(){

    }
    @Test
    public void NoHayGas(){

    }
}
