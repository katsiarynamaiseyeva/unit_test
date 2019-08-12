package junit;

import testng.BaseTest;
import com.epam.tat.module4.Calculator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)
public class CosDoubleCalcTest extends BaseTest {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {0, 1},
                {180, -1},
                {90, 0}
        });
    }

    private double a;
    private double expected;
    private static final double DELTA = 1e-15;

    public CosDoubleCalcTest(double a, double expected) {
        this.a = a;
        this.expected = expected;

    }

    @Test
    public void cosDoubleTest() {
        Calculator calculator = new Calculator();
        double cosDoubleResult = calculator.cos(a);
        Assert.assertEquals("Invalid result of cos double operation!", expected, cosDoubleResult, DELTA);
    }


}
