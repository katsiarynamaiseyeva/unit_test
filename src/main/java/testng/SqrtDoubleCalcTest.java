package testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SqrtDoubleCalcTest extends BaseTest {
    @Test(dataProvider = "valuesForSqrtDoubleTest", groups = "main")
    public void sqrtDoubleTest(double a, double expectedValue) {

        double sqrtDoubleResult = calculator.sqrt(a);
        Assert.assertEquals(sqrtDoubleResult, expectedValue, "Invalid result of sqrt double operation!");
    }

    @DataProvider(name = "valuesForSqrtDoubleTest")
    public Object[][] valuesForSqrtDouble() {
        return new Object[][]{
                {4, 2},
                {-16, 4},
                {0, 0}
        };
    }
}
