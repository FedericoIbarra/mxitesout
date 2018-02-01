package mx.iteso.ut;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import static org.mockito.Mockito.*;

/*import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Before;*/


/**
 * Unit test for simple Quesadilla.
 *
 *
**/

public class QuesadillaTest{
    public Tortilla tortilla= mock(Tortilla.class);
    public Queso queso = mock(Queso.class);
    public Quesadilla quesadilla = new Quesadilla();

    @Before
    public void setUp (){
        quesadilla.setQueso(queso);
        quesadilla.setTortilla(tortilla);
    }

    @Test
    public void perfectQuesadilla(){
        when(tortilla.isToasted()).thenReturn(true);
        when(queso.isMelted()).thenReturn(true);
        Assert.assertEquals("Perfect quesadilla", quesadilla.prepareSingle());
    }

    @Test
    public void goodQuesadilla(){

    }

    @Test
    public void terribleQuesadilla(){

    }

    @Test
    public void noQuesadilla(){

    }
}



