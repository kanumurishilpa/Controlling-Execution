package kanumuri.shilpa.sumorproduct;


import kanumuri.shilpa.greetings.sumorproduct.SumOrProduct;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by shilpakanumuri on 1/13/17.
 */
public class SumOrProductTest {

    SumOrProduct sumOrProduct;

    @Before
    public void setUp(){
        sumOrProduct = new SumOrProduct();
    }

    @Test
    public void sum(){
        int expected = 6;
        int actual = sumOrProduct.sumOfTheNumbers(3);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void product(){
        int expected = 6;
        int actual = sumOrProduct.productOfTheNumbers(3);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void sumOrProductSum(){
        String expected = "The sum is 6";
        String actual = sumOrProduct.sumOrProduct("sum",3);
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void sumOrProductProduct(){
        String expected = "The product is 6";
        String actual = sumOrProduct.sumOrProduct("product",3);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void sumOrProductxyz(){
        String expected = " What do want me to do! Sum or Product!!!! ";
        String actual = sumOrProduct.sumOrProduct("xyz",3);
        Assert.assertEquals(expected, actual);

    }



}
