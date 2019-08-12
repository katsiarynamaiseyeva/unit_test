package testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SinDoubleCalcTest extends BaseTest {
    @Test(dataProvider = "valuesForSinDoubleTest")
    public void sinDoubleTest(double a, double expectedValue) {

        double sinDoubleResult = calculator.sin(a);
        Assert.assertEquals(sinDoubleResult, expectedValue, "Invalid result of sin double operation!");
    }

    @DataProvider(name = "valuesForSinDoubleTest")
    public Object[][] valuesForSinDouble() {
        return new Object[][]{
                {90, 1},
                {270, -1},
                {0, 0}
        };
    }
}
