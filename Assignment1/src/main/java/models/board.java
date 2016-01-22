package models;

/**
 * Created by Lee on 1/21/2016.
 */
import java.util.*;
import com.google.inject.Singleton;

@Singleton
public class board {
    Stack[] boardArray = new Stack[4];
    public void init() {
        for (int i = 0; i < 4; i++) {
            boardArray[i] = new Stack();
        }
    }
    public void addStack(int col, card pushCard){
        boardArray[col].push(pushCard);
    }
    public void topStack(int col){
        System.out.println("Top Element: " + boardArray[col].peek());
    }
}
