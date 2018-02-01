package mx.iteso.ut;

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
    @Before
    public void setUp (){
        Tortilla tortilla= mock(Tortilla.class);
        Queso queso = mock(Queso.class);
    }

    @Test
    public void perfectQuesadilla(){
        when(tortilla.isToasted()).thenReturn(true);
        when(queso.isMelted()).thenReturn(true);
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



