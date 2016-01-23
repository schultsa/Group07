package models;

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

    @Test
    public void testBoard(){
        board newBoard = new board();
        assertThat(newBoard,instanceOf(board.class) );
    }

    @Test
    public void testBoardInit(){
        board newBoard = new board();
        //card newCard = new card("Diamond", "Jack");
        newBoard.init();
        for(int i =0;i<4;i++){
            assertTrue(newBoard.boardArray[i].empty());
        }

    }

    @Test
    public void testBoardAdd(){
        board newBoard = new board();
        card newCard = new card("Diamond", "Jack");
        newBoard.init();
        newBoard.addStack(0,newCard);
        assertTrue(!(newBoard.boardArray[0].empty()));
    }
}
