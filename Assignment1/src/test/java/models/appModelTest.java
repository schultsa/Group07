package models;

import org.junit.Test;

import ninja.NinjaDocTester;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import java.util.*;
/**
 * Created by ramcharan on 1/20/16.
 */
public class appModelTest extends NinjaDocTester{

    @Test
    public void testObjCreation()
    {
        card newCard=new card();
        assertThat(newCard,instanceOf(card.class));
    }

    @Test
    public void testBoardCreation(){
        board newBoard = new board();
        assertThat(newBoard,instanceOf(board.class));

    }

}
