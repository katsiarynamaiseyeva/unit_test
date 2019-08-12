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
public class TgDoubleCalcTest extends BaseTest {
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {45, 1},
                {135, -1},
                {180, 0}
        });
    }

    private double a;
    private double expected;
    private static final double DELTA = 1e-15;

    public TgDoubleCalcTest(double a, double expected) {
        this.a = a;
        this.expected = expected;

    }

    @Test
    public void tgDoubleTest() {
        Calculator calculator = new Calculator();
        double tgDoubleResult = calculator.tg(a);
        Assert.assertEquals("Invalid result of tg double operation!", expected, tgDoubleResult, DELTA);
    }


}
