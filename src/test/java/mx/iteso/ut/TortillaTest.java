package mx.iteso.ut;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import static org.mockito.Mockito.*;

public class TortillaTest
{
   
   TortillaHarina th;
   TortillaMaiz tm;

   @Before
   public void setUp(){
        th = new TortillaHarina();
        tm = new TortillaMaiz();
   }

   @Test
   public void tortillaHarinaTostada(){
      th.toast(true);
      Assert.assertEquals(true, th.isToasted());
   }
   @Test
   public void tortillaMaizTostada(){
        th.toast(true);
        Assert.assertEquals(true, th.isToasted());
   }
   
}