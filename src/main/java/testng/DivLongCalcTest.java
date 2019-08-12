package testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DivLongCalcTest extends BaseTest {
    @Test(dataProvider = "valuesForDivLongTest")
    public void divLongTest(long a, long b, long expectedValue) {

        long divLongResult = calculator.div(a, b);
        Assert.assertEquals(divLongResult, expectedValue, "Invalid result of long div operation!");
    }

    @DataProvider(name = "valuesForDivLongTest")
    public Object[][] valuesForDivLong() {
        return new Object[][]{
                {10, 5, 2},
                {10, -2, -5},
                {2, 0, 0},
                {-10, -5, 2}
        };
    }
}
