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
public class DivDoubleCalcTest extends BaseTest {
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1.8, 1.2, 1.5},
                {1.8, -1.2, -1.5},
                {2.3, 0, 0},
                {-2.7, -1.5, 1.8}
        });
    }

    private double a;
    private double b;
    private double expected;
    private static final double DELTA = 1e-15;

    public DivDoubleCalcTest(double a, double b, double expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Test
    public void divDoubleTest() {
        Calculator calculator = new Calculator();
        double divDoubleResult = calculator.div(a, b);
        Assert.assertEquals("Invalid result of div double operation!", expected, divDoubleResult, DELTA);
    }

}
