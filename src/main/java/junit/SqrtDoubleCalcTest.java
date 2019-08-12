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
public class SqrtDoubleCalcTest extends BaseTest {
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {4, 2},
                {-16, 4},
                {0, 0}
        });
    }

    private double a;
    private double expected;
    private static final double DELTA = 1e-15;

    public SqrtDoubleCalcTest(double a, double expected) {
        this.a = a;
        this.expected = expected;

    }

    @Test
    public void sqrtDoubleTest() {
        Calculator calculator = new Calculator();
        double sqrtDoubleResult = calculator.sqrt(a);
        Assert.assertEquals("Invalid result of sqrt double operation!", expected, sqrtDoubleResult, DELTA);
    }


}
