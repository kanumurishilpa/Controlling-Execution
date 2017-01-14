package kanumuri.shilpa.greetings;

import kanumuri.shilpa.greetings.greetings.AliceandBobGreeting;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by shilpakanumuri on 1/13/17.
 */
public class AliceandBobGreetingTest {

    AliceandBobGreeting aliceandBobGreeting;


    @Before
    public void setUp(){
        aliceandBobGreeting = new AliceandBobGreeting();
    }

    @Test
    public void nameAlice(){
        String expected = "Hello Alice";
        String actual = aliceandBobGreeting.greeting("Alice");
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void nameBob(){
        String expected = "Hello Bob";
        String actual = aliceandBobGreeting.greeting("Bob");
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void iDontKnowYou(){
        String expected = "Do i know you";
        String actual = aliceandBobGreeting.greeting("Shilpa");
        Assert.assertEquals(expected, actual);

    }

}
