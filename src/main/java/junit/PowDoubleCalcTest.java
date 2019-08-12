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
public class PowDoubleCalcTest extends BaseTest {
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {2, 2, 4},
                {-2, 2, 4},
                {3, 0, 1},
                {-4, -1, -0.25}
        });
    }

    private double a;
    private double b;
    private double expected;
    private static final double DELTA = 1e-15;

    public PowDoubleCalcTest(double a, double b, double expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Test
    public void powDoubleTest() {
        Calculator calculator = new Calculator();
        double powDoubleResult = calculator.pow(a, b);
        Assert.assertEquals("Invalid result of pow double operation!", expected, powDoubleResult, DELTA);
    }


}
