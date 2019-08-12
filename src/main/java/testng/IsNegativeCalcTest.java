package testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class IsNegativeCalcTest extends BaseTest {
    @Test(dataProvider = "valuesForIsNegativeTest")
    public void isNegativeTest(long a, boolean expectedValue) {
        boolean isNegativeResult = calculator.isNegative(a);
        Assert.assertEquals(isNegativeResult, expectedValue, "Invalid result of negative operation!");
    }

    @DataProvider(name = "valuesForIsNegativeTest")
    public Object[][] valuesForIsNegative() {
        return new Object[][]{
                {1, false},
                {0, false},
                {-1, true}
        };
    }
}
