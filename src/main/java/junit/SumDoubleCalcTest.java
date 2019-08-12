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
public class SumDoubleCalcTest extends BaseTest {
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {2.5, 1.3, 3.8},
                {1.5, -1.2, 0.3},
                {0.1, 0, 0.1},
                {-1.3, -1.2, -2.5}
        });
    }

    private double a;
    private double b;
    private double expected;
    private static final double DELTA = 1e-15;

    public SumDoubleCalcTest(double a, double b, double expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Test
    public void sumDoubleTest() {
        Calculator calculator = new Calculator();
        double sumDoubleResult = calculator.sum(a, b);
        Assert.assertEquals("Invalid result of sum double operation!", expected, sumDoubleResult, DELTA);
    }


}