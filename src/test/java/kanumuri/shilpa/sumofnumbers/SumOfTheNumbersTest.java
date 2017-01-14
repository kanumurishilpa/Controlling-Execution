package kanumuri.shilpa.sumofnumbers;

import kanumuri.shilpa.greetings.sumofnumbers.SumOfTheNumbers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by shilpakanumuri on 1/13/17.
 */
public class SumOfTheNumbersTest {


    SumOfTheNumbers sum = new SumOfTheNumbers();

    @Test
    public void sum(){
        int expected = 15;
        int actual = sum.sumOfTheNumbers(5);
        Assert.assertEquals(expected, actual);

    }

}


