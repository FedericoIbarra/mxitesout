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
    private Quesadilla mockedQuesadilla;
    private Queso mockedQueso;
    private Tortilla mockedTortilla;

    private Quesadilla quesadillaPanela;
    private Quesadilla mockedQuesadillaPanela;
    private QuesoP mockedQuesoPanela;
    private TortillaH mockedTortillaHarina;

    @Before
    public void setUp() {

        //Quesadilla normal, con quesito y tortillita.
        quesadilla = new Quesadilla();
        mockedQuesadilla = mock(quesadilla.getClass());
        mockedTortilla = mock(Tortillita.class);
        mockedQueso = mock(Quesito.class);
        quesadilla.setQueso(mockedQueso);
        quesadilla.setTortilla(mockedTortilla);

        //Quesadilla con queso panela y tortilla harina.
        quesadillaPanela = new Quesadilla();
        mockedQuesadillaPanela = mock(quesadillaPanela.getClass());
        mockedTortillaHarina = mock(TortillaHarina.class);
        mockedQuesoPanela = mock(QuesoPanela.class);
        quesadillaPanela.setTortillaHarina(mockedTortillaHarina);
        quesadillaPanela.setQuesoPanela(mockedQuesoPanela);

    }

    @Test
    public void quesadillaPanelaPerfecta() {
        when(mockedQuesoPanela.isMelted()).thenReturn(true);
        when(mockedTortillaHarina.isToasted()).thenReturn(true);
        mockedQuesadillaPanela.prepareSingle();
        assertEquals("Perfect quesadilla", quesadillaPanela.prepareSingleConPanela());
        verify(mockedQuesadillaPanela).prepareSingleConPanela();
    }

    @Test
    public void quesadillaPanelaBuena() {
        when(mockedQuesoPanela.isMelted()).thenReturn(true);
        when(mockedTortillaHarina.isToasted()).thenReturn(false);
        mockedQuesadillaPanela.prepareSingle();
        assertEquals("Perfect quesadilla", quesadillaPanela.prepareSingleConPanela());
        verify(mockedQuesadillaPanela).prepareSingleConPanela();
    }

    @Test
    public void quesadillaPanelaTerrible() {
        when(mockedQuesoPanela.isMelted()).thenReturn(false);
        when(mockedTortillaHarina.isToasted()).thenReturn(true);
        mockedQuesadillaPanela.prepareSingle();
        assertEquals("Perfect quesadilla", quesadillaPanela.prepareSingleConPanela());
        verify(mockedQuesadillaPanela).prepareSingleConPanela();
    }

    @Test
    public void noHayGas2() {
        when(mockedQuesoPanela.isMelted()).thenReturn(false);
        when(mockedTortillaHarina.isToasted()).thenReturn(false);
        mockedQuesadillaPanela.prepareSingle();
        assertEquals("Perfect quesadilla", quesadillaPanela.prepareSingleConPanela());
        verify(mockedQuesadillaPanela).prepareSingleConPanela();

        
    }

    @Test
    public void quesadillaPerfecta() {
        when(mockedQueso.isMelted()).thenReturn(true);
        when(mockedTortilla.isToasted()).thenReturn(true);
        mockedQuesadilla.prepareSingle();
        assertEquals("Perfect quesadilla", quesadillaPanela.prepareSingle());
        verify(mockedQuesadilla).prepareSingle();
    }

    @Test
    public void quesadillaBuena() {
        when(mockedQueso.isMelted()).thenReturn(true);
        when(mockedTortilla.isToasted()).thenReturn(false);
        mockedQuesadilla.prepareSingle();
        assertEquals("Good quesadilla", quesadilla.prepareSingle());
        verify(mockedQuesadilla).prepareSingle();
    }

    @Test
    public void quesadillaTerrible() {
        when(mockedQueso.isMelted()).thenReturn(false);
        when(mockedTortilla.isToasted()).thenReturn(true);
        mockedQuesadilla.prepareSingle();
        assertEquals("Terrible quesadilla", quesadilla.prepareSingle());
        verify(mockedQuesadilla).prepareSingle();
    }

    @Test
    public void noHayGas() {
        when(mockedQueso.isMelted()).thenReturn(false);
        when(mockedTortilla.isToasted()).thenReturn(false);
        mockedQuesadilla.prepareSingle();
        assertEquals("You ran out of gas", quesadilla.prepareSingle());
        verify(mockedQuesadilla).prepareSingle();
    }


}
