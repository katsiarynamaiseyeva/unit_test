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
public class MultDoubleCalcTest extends BaseTest {
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {2.5, 2.5, 6.25},
                {1.2, -1.1, -1.32},
                {2.3, 0, 0},
                {-1.8, -1.2, 2.16}
        });
    }

    private double a;
    private double b;
    private double expected;
    private static final double DELTA = 1e-15;

    public MultDoubleCalcTest(double a, double b, double expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Test
    public void multDoubleTest() {
        Calculator calculator = new Calculator();
        double multDoubleResult = calculator.mult(a, b);
        Assert.assertEquals("Invalid result of mult double operation!", expected, multDoubleResult, DELTA);
    }

}
