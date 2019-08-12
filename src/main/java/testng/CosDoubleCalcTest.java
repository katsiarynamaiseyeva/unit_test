package testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CosDoubleCalcTest extends BaseTest {
    @Test(dataProvider = "valuesForCosDoubleTest")
    public void cosDoubleTest(double a, double expectedValue) {

        double cosDoubleResult = calculator.cos(a);
        Assert.assertEquals(cosDoubleResult, expectedValue, "Invalid result of cos double operation!");
    }

    @DataProvider(name = "valuesForCosDoubleTest")
    public Object[][] valuesForCosDouble() {
        return new Object[][]{
                {0, 1},
                {180, -1},
                {90, 0}
        };
    }
}
