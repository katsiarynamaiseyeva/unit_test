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
public class SumLongCalcTest extends BaseTest {
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {10, 23, 33},
                {10, -1, 9},
                {0, 0, 0},
                {-1, 10, 9}
        });
    }

    private long a;
    private long b;
    private long expected;
    private static final double DELTA = 1e-15;

    public SumLongCalcTest(long a, long b, long expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Test
    public void sumLongTest() {
        Calculator calculator = new Calculator();
        long sumLongResult = calculator.sum(a, b);
        Assert.assertEquals("Invalid result of sum long operation!", expected, sumLongResult, DELTA);
    }


}
