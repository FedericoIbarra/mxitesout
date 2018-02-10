package mx.iteso.ut;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class QuesadillaTest{

    Quesadilla quesadilla,nueva_quesadilla,otra_quesadilla;

    Queso mockedQueso;
    Queso1 mockedQueso1;
    Queso2 mockedQueso2;

    Tortilla mockedTortilla;
    Tortilla1 mockedTortilla1;
    Tortilla2 mockedTortilla2;

    /** */
    @Before
    public void setUp() throws Exception {
        quesadilla = new Quesadilla();
        nueva_quesadilla = new Quesadilla();
        otra_quesadilla = new Quesadilla();

        mockedTortilla = mock(Tortilla.class);
        mockedTortilla1 = mock(Tortilla1.class);
        mockedTortilla2 = mock(Tortilla2.class);

        mockedQueso = mock(Queso.class);
        mockedQueso1 = mock(Queso1.class);
        mockedQueso2 = mock(Queso2.class);


        quesadilla.setQueso(mockedQueso);
        quesadilla.setTortilla(mockedTortilla);
        nueva_quesadilla.setQueso(mockedQueso1);
        nueva_quesadilla.setTortilla(mockedTortilla1);
        otra_quesadilla.setQueso(mockedQueso2);
        otra_quesadilla.setTortilla(mockedTortilla2);
    }
    /** */
    @Test
    public void quesadillaPerfecta() throws Exception {
        when(mockedTortilla.isToasted()).thenReturn(true);
        when(mockedQueso.isMelted()).thenReturn(true); //expected melt
        assertEquals("Perfect quesadilla",quesadilla.prepareSingle());
        verify(mockedTortilla).getToastTemp();
        verify(mockedQueso).getMeltingTemp();

        when(mockedTortilla1.isToasted()).thenReturn(true);
        when(mockedQueso1.isMelted()).thenReturn(true);
        assertEquals("Perfect quesadilla",nueva_quesadilla.prepareSingle());
        verify(mockedTortilla1).getToastTemp();
        verify(mockedQueso1).getMeltingTemp();

        when(mockedTortilla2.isToasted()).thenReturn(true);
        when(mockedQueso2.isMelted()).thenReturn(true);
        assertEquals("Perfect quesadilla",otra_quesadilla.prepareSingle());
        verify(mockedTortilla2).getToastTemp();
        verify(mockedQueso2).getMeltingTemp();
    }
    /** */
    @Test
    public void quesadillaBuena() throws Exception {
        when(mockedTortilla.isToasted()).thenReturn(false);
        when(mockedQueso.isMelted()).thenReturn(true); //expected melt
        assertEquals("Good quesadilla",quesadilla.prepareSingle());
        verify(mockedTortilla).getToastTemp();
        verify(mockedQueso).getMeltingTemp();

        when(mockedTortilla1.isToasted()).thenReturn(false);
        when(mockedQueso1.isMelted()).thenReturn(true); //expected melt
        assertEquals("Good quesadilla",nueva_quesadilla.prepareSingle());
        verify(mockedTortilla1).getToastTemp();
        verify(mockedQueso1).getMeltingTemp();

        when(mockedTortilla2.isToasted()).thenReturn(false);
        when(mockedQueso2.isMelted()).thenReturn(true); //expected melt
        assertEquals("Good quesadilla",otra_quesadilla.prepareSingle());
        verify(mockedTortilla2).getToastTemp();
        verify(mockedQueso2).getMeltingTemp();
    }
    /** */
    @Test
    public void quesadillaTerrible() throws Exception {
        when(mockedTortilla.isToasted()).thenReturn(true);
        when(mockedQueso.isMelted()).thenReturn(false); //expected melt
        assertEquals("Terrible quesadilla",quesadilla.prepareSingle());
        verify(mockedTortilla).getToastTemp();
        verify(mockedQueso).getMeltingTemp();

        when(mockedTortilla1.isToasted()).thenReturn(true);
        when(mockedQueso1.isMelted()).thenReturn(false); //expected melt
        assertEquals("Terrible quesadilla",nueva_quesadilla.prepareSingle());
        verify(mockedTortilla1).getToastTemp();
        verify(mockedQueso1).getMeltingTemp();

        when(mockedTortilla2.isToasted()).thenReturn(true);
        when(mockedQueso2.isMelted()).thenReturn(false); //expected melt
        assertEquals("Terrible quesadilla",otra_quesadilla.prepareSingle());
        verify(mockedTortilla2).getToastTemp();
        verify(mockedQueso2).getMeltingTemp();

    }
    /** */
    @Test
    public void noHayGas() throws Exception {
        when(mockedTortilla.isToasted()).thenReturn(false);
        when(mockedQueso.isMelted()).thenReturn(false); //expected melt
        assertEquals("You ran out of gas",quesadilla.prepareSingle());
        verify(mockedTortilla).getToastTemp();
        verify(mockedQueso).getMeltingTemp();

        when(mockedTortilla1.isToasted()).thenReturn(false);
        when(mockedQueso1.isMelted()).thenReturn(false); //expected melt
        assertEquals("You ran out of gas",nueva_quesadilla.prepareSingle());
        verify(mockedTortilla1).getToastTemp();
        verify(mockedQueso1).getMeltingTemp();

        when(mockedTortilla2.isToasted()).thenReturn(false);
        when(mockedQueso2.isMelted()).thenReturn(false); //expected melt
        assertEquals("You ran out of gas",otra_quesadilla.prepareSingle());
        verify(mockedTortilla2).getToastTemp();
        verify(mockedQueso2).getMeltingTemp();

    }
}