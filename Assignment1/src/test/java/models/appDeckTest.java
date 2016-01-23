package models;

import org.junit.Test;

import ninja.NinjaDocTester;
import org.doctester.testbrowser.Request;
import org.doctester.testbrowser.Response;
import org.hamcrest.CoreMatchers;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

/**
 * Created by ramcharan on 1/21/16.
 */
public class appDeckTest extends NinjaDocTester {

    @Test
    public void test52CardsCreation()
    {
        deck newDeck = new deck();
        newDeck.makeNewDeck();

        assertThat(newDeck, instanceOf(deck.class));
    }

    @Test
    public void testIf52Cards()
    {
        deck newDeck = new deck();
        newDeck.makeNewDeck();

        assertEquals(newDeck.deckOfCards.length, 52);
    }

    @Test
    public void testIfRightCardsMade()
    {
        deck newDeck = new deck();
        newDeck.makeNewDeck();

        String[] suits={"Diamond","Spade","Heart","Clove"};
        String[] values={"A","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};

        card[] Cards=new card[52];

        int counter=0;

        for(int suitLoop=0;suitLoop<4;suitLoop++)
        {
            for (int valLoop=0;valLoop<13;valLoop++)
            {
                Cards[counter]=new card(suits[suitLoop],values[valLoop]);
                counter++;
            }
        }

        for (int i = 0; i < 52; i++)
        {
            assertEquals(Cards[i].suit,newDeck.deckOfCards[i].suit);
            assertEquals(Cards[i].value,newDeck.deckOfCards[i].value);
        }
    }

    @Test
    public void testIfRandomInDeck()
    {
        deck newDeck = new deck();
        newDeck.makeNewDeck();

        card[] randCards = new card[52];

        for (int i = 0; i < 52; i++)
        {
            randCards[i] = newDeck.getRandCard();

            for (int j = 0; j < i; j++)
            {
                System.out.println("Checking");
                assertNotEquals(randCards[i], randCards[j]);
            }
        }
    }

    @Test
    public void testDealFourCards()
    {
        deck newDeck = new deck();
        newDeck.makeNewDeck();

        card[] fourCards = newDeck.dealFourCards();

        for (int j = 0; j < 4; j++)
        {
            for (int i = 0; i < 52; i++)
            {
                assertNotEquals(fourCards[j], newDeck.deckOfCards[i]);
            }
        }
    }
}
