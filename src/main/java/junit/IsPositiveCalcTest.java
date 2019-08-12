package junit;

import com.epam.tat.module4.Calculator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class IsPositiveCalcTest extends BaseTest {
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, true},
                {0, false},
                {-1, false}
        });
    }

    private long a;
    private boolean expected;

    public IsPositiveCalcTest(long a, boolean expected) {
        this.a = a;
        this.expected = expected;
    }

    @Test
    public void isPositiveTest() {
        Calculator calculator = new Calculator();
        boolean isPositiveResult = calculator.isPositive(a);
        Assert.assertEquals("Invalid result of positive operation!", expected, isPositiveResult);
    }
}

