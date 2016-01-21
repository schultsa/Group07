package models;

import org.junit.Test;

import ninja.NinjaDocTester;
import org.doctester.testbrowser.Request;
import org.doctester.testbrowser.Response;
import org.hamcrest.CoreMatchers;
import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;
/**
 * Created by ramcharan on 1/20/16.
 */
public class appModelTest extends NinjaDocTester{

    @Test
    public void testObjCreation()
    {
        card newCard=new card();
    }

}
