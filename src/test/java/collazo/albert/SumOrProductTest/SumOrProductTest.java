package collazo.albert.SumOrProductTest;

import static org.junit.Assert.*;

import collazo.albert.SumOrProduct.SumOrProduct;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SumOrProductTest {

    SumOrProduct sumOrProduct;

    @Before
    public void setUP(){
        sumOrProduct = new SumOrProduct();
    }

    @Test
    public void sumFunctionTest(){
        Integer expected = 15;
        Integer actual = sumOrProduct.sumFunction(5);
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void productFunctionTest(){
        Integer expected = 120;
        Integer actual = sumOrProduct.productFunction(5);
        Assert.assertEquals(actual, expected);
    }
}
