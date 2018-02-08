package mx.iteso.ut;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import static org.mockito.Mockito.*;

public class QuesadillaTest
{
   Quesadilla quesadilla;

   Queso mockedQueso;
   Tortilla mockedTortilla;

   @Before
   public void setUp(){
      quesadilla = new Quesadilla();
      mockedTortilla = mock(Tortilla.class);
      mockedQueso = mock(Queso.class);
      quesadilla.setQueso(mockedQueso);
      quesadilla.setTortilla(mockedTortilla);

   }

   @Test
   public void quesadillaPerfecta(){
      when(mockedTortilla.getToastTemperature()).thenReturn(20);
      when(mockedTortilla.getCurrentTemperature()).thenReturn(2,18,22);
      when(mockedTortilla.isToasted()).thenReturn(true);
      when(mockedQueso.getMeltingTemperature()).thenReturn(17);
      when(mockedQueso.getCurrentTemperature()).thenReturn(2,10,19, 20);
      when(mockedQueso.isMelted()).thenReturn(true);

      Assert.assertEquals(quesadilla.prepareSingle(), "Perfect quesadilla");

   }
   @Test
   public void quesadillaBuena(){
    when(mockedQueso.getMeltingTemperature()).thenReturn(17);
    when(mockedQueso.getCurrentTemperature()).thenReturn(2,10,19, 20);
    when(mockedQueso.isMelted()).thenReturn(true);

    Assert.assertEquals(quesadilla.prepareSingle(), "Good quesadilla");

   }
   @Test
   public void quesadillaTerrible(){
    when(mockedTortilla.getToastTemperature()).thenReturn(20);
    when(mockedTortilla.getCurrentTemperature()).thenReturn(2,18,22);
    when(mockedTortilla.isToasted()).thenReturn(true);
    Assert.assertEquals(quesadilla.prepareSingle(), "Terrible quesadilla");

   }
   @Test
   public void noHayGas(){
    when(mockedTortilla.getToastTemperature()).thenReturn(20);
    when(mockedTortilla.getCurrentTemperature()).thenReturn(20);
    when(mockedTortilla.isToasted()).thenReturn(false);
    when(mockedQueso.getMeltingTemperature()).thenReturn(17);
    when(mockedQueso.getCurrentTemperature()).thenReturn(17);
    when(mockedQueso.isMelted()).thenReturn(false);

    Assert.assertEquals(quesadilla.prepareSingle(), "You ran out of gas");
   }
}