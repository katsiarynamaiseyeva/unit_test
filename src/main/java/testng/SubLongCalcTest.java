package testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SubLongCalcTest extends BaseTest {
    @Test(dataProvider = "valuesForSubLongTest", groups = "main")
    public void subLongTest(long a, long b, long expectedValue) {

        long subLongResult = calculator.sub(a, b);
        Assert.assertEquals(subLongResult, expectedValue, "Invalid result of long sub operation!");
    }

    @DataProvider(name = "valuesForSubLongTest")
    public Object[][] valuesForSubLong() {
        return new Object[][]{
                {10, 5, 5},
                {10, -1, 11},
                {0, 0, 0},
                {-1, -10, 9}
        };
    }
}
