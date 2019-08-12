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
public class SinDoubleCalcTest extends BaseTest {
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {90, 1},
                {270, -1},
                {0, 0}
        });
    }

    private double a;
    private double expected;
    private static final double DELTA = 1e-15;

    public SinDoubleCalcTest(double a, double expected) {
        this.a = a;
        this.expected = expected;

    }

    @Test
    public void sinDoubleTest() {
        Calculator calculator = new Calculator();
        double sinDoubleResult = calculator.sin(a);
        Assert.assertEquals("Invalid result of sin double operation!", expected, sinDoubleResult, DELTA);
    }

}
