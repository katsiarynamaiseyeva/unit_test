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
public class IsNegativeCalcTest extends BaseTest {
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, false},
                {0, false},
                {-1, true}
        });
    }

    private long a;
    private boolean expected;

    public IsNegativeCalcTest(long a, boolean expected) {
        this.a = a;
        this.expected = expected;
    }

    @Test
    public void isNegativeTest() {
        Calculator calculator = new Calculator();
        boolean isNegativeResult = calculator.isNegative(a);
        Assert.assertEquals("Invalid result of negative operation!", expected, isNegativeResult);
    }


}
