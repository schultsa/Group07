package models;

import org.junit.Test;

import ninja.NinjaDocTester;
import org.doctester.testbrowser.Request;
import org.doctester.testbrowser.Response;
import org.hamcrest.CoreMatchers;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

/**
 * Created by ramcharan on 1/20/16.
 */

public class appModelTest extends NinjaDocTester{

    @Test
    public void testObjCreation()
    {
        card newCard = new card();
        assertThat(newCard,instanceOf(card.class));
    }

    @Test
    public void testParamObj()
    {
        card newCard=new card("Spade","Queen");
        assertThat(newCard,instanceOf(card.class) );
    }

    @Test
    public void testParamOfObj()
    {
        card newCard=new card("Diamond","Jack");
        assertEquals(newCard.suit,"Diamond");
        assertEquals(newCard.value,"Jack");
    }
}
