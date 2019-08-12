package testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CtgDoubleCalcTest extends BaseTest {
    @Test(dataProvider = "valuesForCtgDoubleTest")
    public void ctgDoubleTest(double a, double expectedValue) {

        double ctgDoubleResult = calculator.ctg(a);
        Assert.assertEquals(ctgDoubleResult, expectedValue, "Invalid result of ctg double operation!");
    }

    @DataProvider(name = "valuesForCtgDoubleTest")
    public Object[][] valuesForCtgDouble() {
        return new Object[][]{
                {45, 1},
                {135, -1},
                {90, 0}
        };
    }
}
