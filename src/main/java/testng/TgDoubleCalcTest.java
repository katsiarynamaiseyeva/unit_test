package testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TgDoubleCalcTest extends BaseTest {
    @Test(dataProvider = "valuesForTgDoubleTest")
    public void tgDoubleTest(double a, double expectedValue) {

        double tgDoubleResult = calculator.tg(a);
        Assert.assertEquals(tgDoubleResult, expectedValue, "Invalid result of tg double operation!");
    }

    @DataProvider(name = "valuesForTgDoubleTest")
    public Object[][] valuesForTgDouble() {
        return new Object[][]{
                {45, 1},
                {135, -1},
                {180, 0}
        };
    }
}
