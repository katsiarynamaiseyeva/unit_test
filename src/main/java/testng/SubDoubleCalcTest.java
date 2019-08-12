package testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SubDoubleCalcTest extends BaseTest {
    private static final double DELTA = 1e-15;

    @Test(dataProvider = "valuesForSubDoubleTest")
    public void subDoubleTest(double a, double b, double expectedValue) {

        double subDoubleResult = calculator.sub(a, b);
        Assert.assertEquals(subDoubleResult, expectedValue, DELTA,"Invalid result of double sub operation!");
    }

    @DataProvider(name = "valuesForSubDoubleTest")
    public Object[][] valuesForSubDouble() {
        return new Object[][]{
                {2.5, 1.1, 1.4},
                {2.5, -1.1, 3.6},
                {0.2, 0.5, -0.3},
                {-1.5, -1.4, -0.1}
        };
    }
}
