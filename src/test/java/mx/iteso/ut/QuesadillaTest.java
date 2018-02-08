package mx.iteso.ut;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;


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
    mockedTortilla = Mockito.mock(Tortilla.class);
    mockedQueso = Mockito.mock(Queso.class);
    quesadilla.setQueso(mockedQueso);
    quesadilla.setTortilla(mockedTortilla);


}

@Test
public void quesadillaPerfecta(){
    when(mockedTortilla.getToastTemperature()).thenReturn(20);
    when(mockedTortilla.getCurrentTemperature()).thenReturn(2,6,10,14,18,22);
    when(mockedQueso.getMeltingTemperature()).thenReturn(20);
    when(mockedQueso.getCurrentTemperature()).thenReturn(2,10,14,18,22,30);

    Mockito.when(mockedTortilla.isToasted()).thenReturn(true);
    Mockito.when(mockedQueso.isMelted()).thenReturn(true);

    Assert.assertEquals("Perfect quesadilla", quesadilla.prepareSingle());
    verify(mockedQueso,atLeastOnce()).melt(true);
    verify(mockedTortilla, atLeastOnce()).toast(true);

}

@Test
public void quesadillaBuena(){
    when(mockedTortilla.getToastTemperature()).thenReturn(25);
    when(mockedTortilla.getCurrentTemperature()).thenReturn(2,6,10,14,18, 22);
    when(mockedQueso.getMeltingTemperature()).thenReturn(20);
    when(mockedQueso.getCurrentTemperature()).thenReturn(2,6,10,14,18,22);


    Mockito.when(mockedTortilla.isToasted()).thenReturn(false);
    Mockito.when(mockedQueso.isMelted()).thenReturn(true);

    Assert.assertEquals("Good quesadilla", quesadilla.prepareSingle());
    verify(mockedQueso,atLeastOnce()).melt(true);
    verify(mockedTortilla, never()).toast(true);
}

@Test
public void quesadillaTerrible(){

    when(mockedTortilla.getToastTemperature()).thenReturn(20);
    when(mockedTortilla.getCurrentTemperature()).thenReturn(2,6,10,14,18, 22);
    when(mockedQueso.getMeltingTemperature()).thenReturn(25);
    when(mockedQueso.getCurrentTemperature()).thenReturn(2,6,10,14,18,22);

    Mockito.when(mockedTortilla.isToasted()).thenReturn(true);
    Mockito.when(mockedQueso.isMelted()).thenReturn(false);

    Assert.assertEquals("Terrible quesadilla", quesadilla.prepareSingle());
    verify(mockedQueso,never()).melt(true);
    verify(mockedTortilla, atLeastOnce()).toast(true);
}

@Test
public void SinGas(){

    when(mockedTortilla.getToastTemperature()).thenReturn(20);
    when(mockedTortilla.getCurrentTemperature()).thenReturn(25);
    when(mockedQueso.getMeltingTemperature()).thenReturn(20);
    when(mockedQueso.getCurrentTemperature()).thenReturn(25);

    Mockito.when(mockedTortilla.isToasted()).thenReturn(false);
    Mockito.when(mockedQueso.isMelted()).thenReturn(false);

    Assert.assertEquals("You ran out of gas", quesadilla.prepareSingle());
    verify(mockedQueso,never()).melt(true);
    verify(mockedTortilla, never()).toast(true);
}

}
