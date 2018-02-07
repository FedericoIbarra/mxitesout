package mx.iteso.ut;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
import org.junit.Test;
import org.junit.Before;
import org.mockito.verification.VerificationMode;
import sun.invoke.util.VerifyAccess;

import java.util.Iterator;


/**
 * Unit test for simple Quesadilla.
 */
public class QuesadillaTest {

    private Quesadilla quesadilla;
    private Queso mockedQueso;
    private Tortilla mockedTortilla;

    @Before
    public void setUp() {

        quesadilla = new Quesadilla();
        mockedTortilla = mock(Tortilla.class);
        mockedQueso = mock(Queso.class);

        quesadilla.setQueso(mockedQueso);
        quesadilla.setTortilla(mockedTortilla);

    }

    @Test
    public void quesadillaPerfecta() {
        when(mockedQueso.isMelted()).thenReturn(true);
        when(mockedTortilla.isToasted()).thenReturn(true);

        assertEquals("Perfect quesadilla", quesadilla.prepareSingle());

        //verify(mock(quesadilla.getClass())).prepareSingle();

    }

    @Test
    public void quesadillaBuena() {
        when(mockedQueso.isMelted()).thenReturn(true);
        when(mockedTortilla.isToasted()).thenReturn(false);
        assertEquals("Good quesadilla", quesadilla.prepareSingle());
    }

    @Test
    public void quesadillaTerrible() {
        when(mockedQueso.isMelted()).thenReturn(false);
        when(mockedTortilla.isToasted()).thenReturn(true);
        assertEquals("Terrible quesadilla", quesadilla.prepareSingle());
    }

    @Test
    public void noHayGas() {
        when(mockedQueso.isMelted()).thenReturn(false);
        when(mockedTortilla.isToasted()).thenReturn(false);
        assertEquals("You ran out of gas", quesadilla.prepareSingle());
    }


}
