package testng;

import junit.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class IsPositiveCalcTest extends BaseTest {


    @Test(dataProvider = "valuesForIsPositiveTest")
    public void isPositiveTest(long a, boolean expectedValue) {
        boolean isPositiveResult = calculator.isPositive(a);
        Assert.assertEquals(isPositiveResult, expectedValue, "Invalid result of positive operation!");
    }

    @DataProvider(name = "valuesForIsPositiveTest")
    public Object[][] valuesForIsPositive() {
        return new Object[][]{
                {10, true},
                {0, false},
                {-1, false}
        };
    }
}
