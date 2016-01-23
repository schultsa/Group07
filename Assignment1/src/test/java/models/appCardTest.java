package models;

/**
 * Created by Lee on 1/22/2016.
 */

import org.junit.Test;

import ninja.NinjaDocTester;
import org.doctester.testbrowser.Request;
import org.doctester.testbrowser.Response;
import org.hamcrest.CoreMatchers;
import org.mockito.internal.matchers.InstanceOf;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

import java.util.*;

public class appCardTest extends NinjaDocTester{
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
