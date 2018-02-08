package mx.iteso.ut;

import org.junit.Test;
import org.junit.Before;

import static org.mockito.Mockito.*;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
/**
 * Unit test for simple Quesadilla.
 */
public class QuesadillaTest
{
    Quesadilla quesadilla;
    Quesadilla quesAdob;
    Quesadilla quesChi;
    Queso mockedQueso;
    QuesoChihuahua mockedQuesoChihuahua;
    QuesoAdobera mockedQuesoAdobera;
    Tortilla mockedTortilla;
    TortillaMaiz mockedTortillaMaiz;
    TortillaNopal mockedTortillaNopal;


    @Before
    public void SetUp()
    {
        quesadilla = new Quesadilla();
        quesAdob = new Quesadilla();
        quesChi = new Quesadilla();

        mockedTortilla = mock(Tortilla.class);
        mockedTortillaMaiz = mock(TortillaMaiz.class);
        mockedTortillaNopal = mock(TortillaNopal.class);
        mockedQueso = mock(Queso.class);
        mockedQuesoChihuahua = mock(QuesoChihuahua.class);
        mockedQuesoAdobera = mock(QuesoAdobera.class);

        quesadilla.setQueso(mockedQueso);
        quesadilla.setTortilla(mockedTortilla);

        quesAdob.setQueso(mockedQuesoAdobera);
        quesAdob.setTortilla(mockedTortillaMaiz);

        quesChi.setQueso(mockedQuesoChihuahua);
        quesChi.setTortilla(mockedTortillaNopal);

        Tortilla tortilla=mock(Tortilla.class);
        Queso queso=mock(Queso.class);
        when(tortilla.isToasted()).thenReturn(true);
        when(tortilla.getCurrentTemperature()).thenReturn(17);
        Quesadilla quesadilla=new Quesadilla();
        quesadilla.setQueso(queso);
        quesadilla.setTortilla(tortilla);

    }


    @Test
    public void QuesadillaPerfecta()
    {
        when(mockedQueso.isMelted()).thenReturn(true);
        when(mockedQuesoChihuahua.isMelted()).thenReturn(true);
        when(mockedQuesoAdobera.isMelted()).thenReturn(true);

        when(mockedTortilla.isToasted()).thenReturn(true);
        when(mockedTortillaMaiz.isToasted()).thenReturn(true);
        when(mockedTortillaNopal.isToasted()).thenReturn(true);

        assertEquals( "Perfect quesadilla", quesadilla.prepareSingle());
        assertEquals( "Perfect quesadilla", quesAdob.prepareSingle());
        assertEquals( "Perfect quesadilla", quesChi.prepareSingle());

    }


    @Test
    public void buena()
    {
        when(mockedQueso.isMelted()).thenReturn(true);
        when(mockedQuesoChihuahua.isMelted()).thenReturn(true);
        when(mockedQuesoAdobera.isMelted()).thenReturn(true);

        when(mockedTortilla.isToasted()).thenReturn(false);
        when(mockedTortillaMaiz.isToasted()).thenReturn(false);
        when(mockedTortillaNopal.isToasted()).thenReturn(false);

        assertEquals( "Good quesadilla", quesadilla.prepareSingle());
        assertEquals( "Good quesadilla", quesAdob.prepareSingle());
        assertEquals( "Good quesadilla", quesChi.prepareSingle());

    }



    @Test
    public void terrible()
    {
        when(mockedQueso.isMelted()).thenReturn(false);
        when(mockedQuesoChihuahua.isMelted()).thenReturn(false);
        when(mockedQuesoAdobera.isMelted()).thenReturn(false);

        when(mockedTortilla.isToasted()).thenReturn(true);
        when(mockedTortillaMaiz.isToasted()).thenReturn(true);
        when(mockedTortillaNopal.isToasted()).thenReturn(true);

        assertEquals( "Terrible quesadilla", quesadilla.prepareSingle());
        assertEquals( "Terrible quesadilla", quesAdob.prepareSingle());
        assertEquals( "Terrible quesadilla", quesChi.prepareSingle());

    }


    @Test
    public void NoHayGas()
    {
        when(mockedQueso.isMelted()).thenReturn(false);
        when(mockedQuesoChihuahua.isMelted()).thenReturn(false);
        when(mockedQuesoAdobera.isMelted()).thenReturn(false);

        when(mockedTortilla.isToasted()).thenReturn(false);
        when(mockedTortillaMaiz.isToasted()).thenReturn(false);
        when(mockedTortillaNopal.isToasted()).thenReturn(false);

        assertEquals( "You ran out of gas", quesadilla.prepareSingle());
        assertEquals( "You ran out of gas", quesAdob.prepareSingle());
        assertEquals( "You ran out of gas", quesChi.prepareSingle());

    }

}
