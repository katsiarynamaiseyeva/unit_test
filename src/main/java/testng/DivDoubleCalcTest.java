package testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DivDoubleCalcTest extends BaseTest {
    @Test(dataProvider = "valuesForDivDoubleTest")
    public void divDoubleTest(double a, double b, double expectedValue) {

        double divDoubleResult = calculator.div(a, b);
        Assert.assertEquals(divDoubleResult, expectedValue, "Invalid result of div double operation!");
    }

    @DataProvider(name = "valuesForDivDoubleTest")
    public Object[][] valuesForDivDouble() {
        return new Object[][]{
                {1.8, 1.2, 1.5},
                {1.8, -1.2, -1.5},
                {2.3, 0, 0},
                {-2.7, -1.5, 1.8}
        };
    }
}
