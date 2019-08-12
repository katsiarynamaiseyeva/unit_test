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
public class MultLongCalcTest extends BaseTest {
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {2, 5, 10},
                {10, -1, -10},
                {2, 0, 0},
                {-1, -12, 12}
        });
    }

    private long a;
    private long b;
    private long expected;
    private static final double DELTA = 1e-15;

    public MultLongCalcTest(long a, long b, long expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Test
    public void multLongTest() {
        Calculator calculator = new Calculator();
        long multLongResult = calculator.mult(a, b);
        Assert.assertEquals("Invalid result of mult long operation!", expected, multLongResult, DELTA);
    }


}
