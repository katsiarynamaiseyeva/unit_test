package testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultDoubleCalcTest extends BaseTest {
    private static final double DELTA = 1e-15;

    @Test(dataProvider = "valuesForMultDoubleTest")
    public void multDoubleTest(double a, double b, double expectedValue) {

        double multDoubleResult = calculator.mult(a, b);
        Assert.assertEquals(multDoubleResult, expectedValue, DELTA, "Invalid result of mult double operation!");
    }

    @DataProvider(name = "valuesForMultDoubleTest")
    public Object[][] valuesForMultDouble() {
        return new Object[][]{
                {2.5, 2.5, 6.25},
                {1.2, -1.1, -1.32},
                {2.3, 0, 0},
                {-1.8, -1.2, 2.16}
        };
    }
}
