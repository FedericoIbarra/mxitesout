package mx.iteso.ut;

import org.junit.Test;

import junit.framework.Assert;

import org.junit.Before;
import static org.mockito.Mockito.*;

import java.util.Random;

public class QuesadillaTest
{
   Quesadilla quesadilla;
   Queso mockedQueso;
   Tortilla mockedTortilla;
   
   static Random rand = new Random(System.currentTimeMillis());

   @Before
   public void setUp(){
      quesadilla = new Quesadilla();
      mockedTortilla = mock(Tortilla.class);
      mockedQueso = mock(Queso.class);
      quesadilla.setQueso(mockedQueso);
      quesadilla.setTortilla(mockedTortilla);
      rand = new Random(System.currentTimeMillis());
      quesadilla.setHeatLevel(rand.nextInt(100));

   }
   @Test
   public void quesadillaPerfecta(){
      when(mockedTortilla.getToastTemperature()).thenReturn(30);
      when(mockedTortilla.getCurrentTemperature()).thenReturn(2,6,10,14,18,22);
      when(mockedQueso.getMeltingTemperature()).thenReturn(30);
      when(mockedQueso.getCurrentTemperature()).thenReturn(2,6,10,14,18,22);
      
      when(mockedQueso.isMelted()).thenReturn(true);
      when(mockedTortilla.isToasted()).thenReturn(true);
      
      Assert.assertTrue(quesadilla.prepareSingle().equals("Perfect quesadilla"));
   }
   @Test
   public void quesadillaBuena(){
	   when(mockedTortilla.getToastTemperature()).thenReturn(30);
	   when(mockedTortilla.getCurrentTemperature()).thenReturn(2,6,10,14,18,22); //2,6,10,14,18,22
	   when(mockedQueso.getMeltingTemperature()).thenReturn(30);
	   when(mockedQueso.getCurrentTemperature()).thenReturn(2,6,10,14,18,22);//rand.nextInt(90)
	   
	   when(mockedQueso.isMelted()).thenReturn(true);
	   when(mockedTortilla.isToasted()).thenReturn(false);
	   
	   Assert.assertTrue(quesadilla.prepareSingle().equals("Good quesadilla"));
   }
   @Test
   public void quesadillaTerrible(){
	   when(mockedTortilla.getToastTemperature()).thenReturn(30);
	   when(mockedTortilla.getCurrentTemperature()).thenReturn(2,6,10,14,18,22); //2,6,10,14,18,22
	   when(mockedQueso.getMeltingTemperature()).thenReturn(30);
	   when(mockedQueso.getCurrentTemperature()).thenReturn(2,6,10,14,18,22);//rand.nextInt(90)
	   
	   when(mockedQueso.isMelted()).thenReturn(false);
	   when(mockedTortilla.isToasted()).thenReturn(true);
	   
	   Assert.assertTrue(quesadilla.prepareSingle().equals("Terrible quesadilla"));
   }
   @Test
   public void noHayGas(){
	   when(mockedTortilla.getToastTemperature()).thenReturn(30);
	   when(mockedTortilla.getCurrentTemperature()).thenReturn(2,6,10,14,18,22); //2,6,10,14,18,22
	   when(mockedQueso.getMeltingTemperature()).thenReturn(30);
	   when(mockedQueso.getCurrentTemperature()).thenReturn(2,6,10,14,18,22);//rand.nextInt(90)*/
	   
	   when(mockedQueso.isMelted()).thenReturn(false);
	   when(mockedTortilla.isToasted()).thenReturn(false);
	   
	   Assert.assertTrue(quesadilla.prepareSingle().equals("You ran out of gas"));
   }
}
