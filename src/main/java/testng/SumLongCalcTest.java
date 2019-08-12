package testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumLongCalcTest extends BaseTest {
    @Test(dataProvider = "valuesForSumLongTest")
    public void sumLongTest(long a, long b, long expectedValue) {
        long sumLongResult = calculator.sum(a, b);
        Assert.assertEquals(sumLongResult, expectedValue, "Invalid result of long sum operation!");
    }

    @DataProvider(name = "valuesForSumLongTest")
    public Object[][] valuesForSumLong() {
        return new Object[][]{
                {10, 23, 33},
                {10, -1, 9},
                {0, 0, 0},
                {-1, 10, 9}
        };
    }
}
