package mx.iteso.ut;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.mockito.internal.matchers.Equals;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

public class QuesadillaTest{

    Quesadilla quesadilla,mockQuesadilla;
    Queso mockedQueso;
    Tortilla mockedTortilla;

    @Before
    public void setUp() throws Exception{
        quesadilla = new Quesadilla();
        mockedTortilla = mock(Tortilla.class);
        mockedQueso = mock(Queso.class);
        quesadilla.setQueso(mockedQueso);
        quesadilla.setTortilla(mockedTortilla);
    }
    @Test
    public void quesadillaPerfecta() throws Exception{
        when(mockedTortilla.isToasted()).thenReturn(true);
        when(mockedQueso.isMelted()).thenReturn(true); //expected melt
        assertEquals("Perfect quesadilla",quesadilla.prepareSingle());
    }
    @Test
    public void quesadillaBuena() throws Exception{
        when(mockedTortilla.isToasted()).thenReturn(false);
        when(mockedQueso.isMelted()).thenReturn(true); //expected melt
        assertEquals("Good quesadilla",quesadilla.prepareSingle());
    }
    @Test
    public void quesadillaTerrible() throws Exception{
        when(mockedTortilla.isToasted()).thenReturn(true);
        when(mockedQueso.isMelted()).thenReturn(false); //expected melt
        assertEquals("Terrible quesadilla",quesadilla.prepareSingle());
    }
    @Test
    public void noHayGas() throws Exception{
        when(mockedTortilla.isToasted()).thenReturn(false);
        when(mockedQueso.isMelted()).thenReturn(false); //expected melt
        assertEquals("You ran out of gas",quesadilla.prepareSingle());
    }

}
/*
* if(getQueso().isMelted() && getTortilla().isToasted())
         return "Perfect quesadilla";
     if(getQueso().isMelted() && !getTortilla().isToasted())
         return "Good quesadilla";
     if(!getQueso().isMelted() && getTortilla().isToasted())
         return "Terrible quesadilla";
     else
         return "You ran out of gas";
*
* */
