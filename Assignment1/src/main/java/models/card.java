package models;

/**
 * Created by ramcharan on 1/20/16.
 */
//import com.sun.org.apache.xpath.internal.operations.String;
import ninja.Result;
import ninja.Results;

import com.google.inject.Singleton;


@Singleton
public class card {

    String suit;
    String value;

    public card()
    {
        this.suit="";
        this.value="";
    }

    public card(String suit, String value)
    {
        this.suit=suit;
        this.value=value;
    }

}
