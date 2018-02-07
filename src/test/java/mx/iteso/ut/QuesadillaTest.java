/*
* Nombre: Alfonso Cervantes Alonso
* Asignatura: Diseño de software
* Profesor: Rodrigo Villalobos
* Documento: "QuesadillaTest.java"
* Fecha de entrega: 07/02/2018
* */
package mx.iteso.ut;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Unit test for simple Quesadilla.
 */
public class QuesadillaTest
{

    Quesadilla quesadilla;
    Quesadilla quesadilla1;
    Quesadilla quesadilla2;
    Queso mockedQueso;
    Tortilla mockedTortilla;
    QuesoOaxaca mockedQuesoOaxaca;
    TortillaIntegral mockedTortillaIntegral;
    QuesoManchego mockedQuesoManchego;
    TortillaHarina mockedTortillaHarina;

    @Before
    public void setUp(){
        quesadilla = new Quesadilla();
        quesadilla1 = new Quesadilla();
        quesadilla2 = new Quesadilla();
        mockedTortilla = mock(Tortilla.class);
        mockedQueso = mock(Queso.class);
        mockedTortillaIntegral = mock(TortillaIntegral.class);
        mockedQuesoOaxaca = mock(QuesoOaxaca.class);
        mockedTortillaHarina = mock(TortillaHarina.class);
        mockedQuesoManchego = mock(QuesoManchego.class);

        quesadilla.setQueso(mockedQueso);
        quesadilla.setTortilla(mockedTortilla);

        quesadilla1.setQueso(mockedQuesoOaxaca);
        quesadilla1.setTortilla(mockedTortillaIntegral);

        quesadilla2.setQueso(mockedQuesoManchego);
        quesadilla2.setTortilla(mockedTortillaHarina);
    }

    @Ignore
    @Test
    public void quesadillaPerfecta(){
        when(mockedTortilla.isToasted()).thenReturn(true);
        when(mockedTortillaIntegral.isToasted()).thenReturn(true);
        when(mockedTortillaHarina.isToasted()).thenReturn(true);
               //Queso
        when(mockedQueso.isMelted()).thenReturn(true);
        when(mockedQuesoManchego.isMelted()).thenReturn(true);
        when(mockedQuesoOaxaca.isMelted()).thenReturn(true);

        assertEquals( "Perfect quesadilla", quesadilla.prepareSingle());
        assertEquals( "Perfect quesadilla", quesadilla1.prepareSingle());
        assertEquals( "Perfect quesadilla", quesadilla2.prepareSingle());
    }

    @Ignore
    @Test
    public void quesadillaBuena(){
        when(mockedTortilla.isToasted()).thenReturn(false);
        when(mockedTortillaIntegral.isToasted()).thenReturn(false);
        when(mockedTortillaHarina.isToasted()).thenReturn(false);

        //Queso
        when(mockedQueso.isMelted()).thenReturn(true);
        when(mockedQuesoManchego.isMelted()).thenReturn(true);
        when(mockedQuesoOaxaca.isMelted()).thenReturn(true);


        assertEquals( "Good quesadilla", quesadilla.prepareSingle());
        assertEquals( "Good quesadilla", quesadilla1.prepareSingle());
        assertEquals( "Good quesadilla", quesadilla2.prepareSingle());
    }

    @Ignore
    @Test
    public void quesadillaTerrible(){
        when(mockedTortilla.isToasted()).thenReturn(true);
        when(mockedTortillaIntegral.isToasted()).thenReturn(true);
        when(mockedTortillaHarina.isToasted()).thenReturn(true);

        //Queso
        when(mockedQueso.isMelted()).thenReturn(false);
        when(mockedQuesoManchego.isMelted()).thenReturn(false);
        when(mockedQuesoOaxaca.isMelted()).thenReturn(false);

        assertEquals( "Terrible quesadilla", quesadilla.prepareSingle());
        assertEquals( "Terrible quesadilla", quesadilla1.prepareSingle());
        assertEquals( "Terrible quesadilla", quesadilla2.prepareSingle());
    }

    @Ignore
    @Test
    public void noHayGas(){
        when(mockedTortilla.isToasted()).thenReturn(false);
        when(mockedTortillaIntegral.isToasted()).thenReturn(false);
        when(mockedTortillaHarina.isToasted()).thenReturn(false);

        //Queso
        when(mockedQueso.isMelted()).thenReturn(false);
        when(mockedQuesoManchego.isMelted()).thenReturn(false);
        when(mockedQuesoOaxaca.isMelted()).thenReturn(false);

        assertEquals( "You ran out of gas", quesadilla.prepareSingle());
        assertEquals( "You ran out of gas", quesadilla1.prepareSingle());
        assertEquals( "You ran out of gas", quesadilla2.prepareSingle());
    }

}
