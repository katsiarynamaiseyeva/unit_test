package testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumDoubleCalcTest extends BaseTest {
    private static final double DELTA = 1e-15;

    @Test(dataProvider = "valuesForSumDoubleTest")
    public void sumDoubleTest(double a, double b, double expectedValue) {
        double sumDoubleResult = calculator.sum(a, b);
        Assert.assertEquals(sumDoubleResult, expectedValue, DELTA, "Invalid result of long double operation!");
    }

    @DataProvider(name = "valuesForSumDoubleTest")
    public Object[][] valuesForSumDouble() {
        return new Object[][]{
                {2.5, 1.3, 3.8},
                {1.5, -1.2, 0.3},
                {0.1, 0, 0.1},
                {-1.3, -1.2, -2.5}
        };
    }
}