package testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultLongCalcTest extends BaseTest {
    @Test(dataProvider = "valuesForMultLongTest")
    public void multLongTest(long a, long b, long expectedValue) {

        long multLongResult = calculator.mult(a, b);
        Assert.assertEquals(multLongResult, expectedValue, "Invalid result of long mult operation!");
    }

    @DataProvider(name = "valuesForMultLongTest")
    public Object[][] valuesForMultLong() {
        return new Object[][]{
                {2, 5, 10},
                {10, -1, -10},
                {2, 0, 0},
                {-1, -12, 12}
        };
    }
}
