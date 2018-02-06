package mx.iteso.ut;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


/**
 * Unit test for simple Quesadilla.
 */
public class QuesadillaTest {
    Quesadilla quesadilla;
    Queso mockedQueso;
    Tortilla mockedTortilla;

@Before
public void SetUp(){
    //estas variables van a ser mockeadas, usando la clase Tortilla que es una interfaz
    quesadilla = new Quesadilla();
    mockedTortilla = mock(Tortilla.class);
    mockedQueso = mock(Queso.class);
    quesadilla.setQueso(mockedQueso);
    quesadilla.setTortilla(mockedTortilla);
    quesadilla.setHeatLevel(1);

}

@Test
public void quesadillaPerfecta(){

    when(mockedTortilla.isToasted()).thenReturn(true);
    when(mockedQueso.isMelted()).thenReturn(true);

    Assert.assertEquals("Perfect quesadilla", quesadilla.prepareSingle());

}

@Test
public void quesadillaBuena(){


    when(mockedTortilla.isToasted()).thenReturn(false);
    when(mockedQueso.isMelted()).thenReturn(true);

    Assert.assertEquals("Good quesadilla", quesadilla.prepareSingle());

}

@Test
public void quesadillaTerrible(){


    when(mockedTortilla.isToasted()).thenReturn(true);
    when(mockedQueso.isMelted()).thenReturn(false);

    Assert.assertEquals("Terrible quesadilla", quesadilla.prepareSingle());
}

@Test
public void SinGas(){

    when(mockedTortilla.isToasted()).thenReturn(false);
    when(mockedQueso.isMelted()).thenReturn(false);

    Assert.assertEquals("You ran out of gas", quesadilla.prepareSingle());
}

}
