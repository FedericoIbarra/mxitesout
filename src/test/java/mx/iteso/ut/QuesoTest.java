package mx.iteso.ut;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import static org.mockito.Mockito.*;

public class QuesoTest
{
   
   QuesoAmarillo qa;
   QuesoBlanco qb;

   @Before
   public void setUp(){
        qa = new QuesoAmarillo();
        qb = new QuesoBlanco();
   }

   @Test
   public void quesoBlancoFundido(){
      qa.melt(true);
      Assert.assertEquals(true, qa.isMelted());
   }
   @Test
   public void quesoAmarilloFundido(){
      qb.melt(true);
      Assert.assertEquals(true, qb.isMelted());
   }
   
}