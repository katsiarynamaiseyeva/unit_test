package testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PowDoubleCalcTest extends BaseTest {
    @Test(dataProvider = "valuesForPowDoubleTest")
    public void powDoubleTest(double a, double b, double expectedValue) {

        double powDoubleResult = calculator.pow(a, b);
        Assert.assertEquals(powDoubleResult, expectedValue, "Invalid result of pow double operation!");
    }

    @DataProvider(name = "valuesForPowDoubleTest")
    public Object[][] valuesForPowDouble() {
        return new Object[][]{
                {2, 2, 4},
                {-2, 2, 4},
                {3, 0, 1},
                {-4, -1, -0.25}
        };
    }
}
