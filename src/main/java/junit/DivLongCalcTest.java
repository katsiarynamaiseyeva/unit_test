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
public class DivLongCalcTest extends BaseTest {
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {10, 5, 2},
                {10, -2, -5},
                {2, 0, 0},
                {-10, -5, 2}
        });
    }

    private long a;
    private long b;
    private long expected;
    private static final double DELTA = 1e-15;

    public DivLongCalcTest(long a, long b, long expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }


    @Test
    public void divLongTest() {
        Calculator calculator = new Calculator();
        long divLongResult = calculator.div(a, b);
        Assert.assertEquals("Invalid result of div long operation!", expected, divLongResult, DELTA);
    }


}
