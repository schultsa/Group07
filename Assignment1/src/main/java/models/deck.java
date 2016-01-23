package models;

import java.util.*;

/**
 * Created by ramcharan on 1/21/16.
 */
public class deck {

    card[] deckOfCards;

    public void makeNewDeck()
    {
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

        deckOfCards=Cards;
    }

    public card getRandCard()
    {
        makeNewDeck();

        Random rand=new Random();

        while(true)
        {
            int randomNum = rand.nextInt(52);

            if (deckOfCards[randomNum] != null)
            {
                card retCard = deckOfCards[randomNum];
                deckOfCards[randomNum] = null;

                return retCard;
            }
        }

    }

    public card[] dealFourCards()
    {
        makeNewDeck();

        card[] fourNewCards=new card[4];

        for (int i=0;i<4;i++)
        {
            fourNewCards[i]=getRandCard();
        }

        return fourNewCards;
    }

}
