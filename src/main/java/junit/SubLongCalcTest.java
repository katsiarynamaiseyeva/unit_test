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
public class SubLongCalcTest extends BaseTest {
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {10, 5, 5},
                {10, -1, 11},
                {0, 0, 0},
                {-1, -10, 9}
        });
    }

    private long a;
    private long b;
    private long expected;
    private static final double DELTA = 1e-15;

    public SubLongCalcTest(long a, long b, long expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Test
    public void subLongTest() {
        Calculator calculator = new Calculator();
        long subLongResult = calculator.sub(a, b);
        Assert.assertEquals("Invalid result of sub long operation!", expected, subLongResult, DELTA);
    }


}
