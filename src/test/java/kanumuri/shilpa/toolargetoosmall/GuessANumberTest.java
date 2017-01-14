package kanumuri.shilpa.toolargetoosmall;

import kanumuri.shilpa.greetings.toolargetoosmall.GuessANumber;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by shilpakanumuri on 1/14/17.
 */
public class GuessANumberTest {

    GuessANumber guessANumberTest;

    @Before
    public void setUp(){
        guessANumberTest = new GuessANumber();
    }

    @Test
    public void guessWin(){
        String expected = "win";
        String actual = guessANumberTest.guessANumber(5,5);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void guessClose(){
        String expected = "CLOSE";
        String actual = guessANumberTest.guessANumber(5,6);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void guessBig(){
        String expected = "BIG";
        String actual = guessANumberTest.guessANumber(1,8);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void guessSmall(){
        String expected = "SMALL";
        String actual = guessANumberTest.guessANumber(7,2);
        Assert.assertEquals(expected, actual);

    }

}
