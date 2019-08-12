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
public class SubDoubleCalcTest extends BaseTest {
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {2.5, 1.1, 1.4},
                {2.5, -1.1, 3.6},
                {0.2, 0.5, -0.3},
                {-1.5, -1.4, -0.1}
        });
    }

    private double a;
    private double b;
    private double expected;
    private static final double DELTA = 1e-15;

    public SubDoubleCalcTest(double a, double b, double expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Test
    public void subDoubleTest() {
        Calculator calculator = new Calculator();
        double subDoubleResult = calculator.sub(a, b);
        Assert.assertEquals("Invalid result of sub double operation!", expected, subDoubleResult, DELTA);
    }


}
