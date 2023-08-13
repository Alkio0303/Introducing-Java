import com.sirma.javacource.intro.summinglargenumbers.SummingLargeNumbers;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SummingLargeNumbersTest {
    @Test
    public void testSumZeroWithZero() {
        assertEquals("0", SummingLargeNumbers.sumStrings("0", "0"));
    }

    @Test
    public void testSumZeroWithLargeNumber() {
        assertEquals("123456789012345678901234567890", SummingLargeNumbers.sumStrings("0", "123456789012345678901234567890"));
    }

    @Test
    public void test_SumLargeNumbers() {
        assertEquals("11111111122222222222222222222222", SummingLargeNumbers.sumStrings("11111111111111111111111", "11111111111111111111111111111111"));
    }

    @Test
    public void test_SumWithSingleDigit() {
        assertEquals("1000000000000000000000000000000", SummingLargeNumbers.sumStrings("999999999999999999999999999999", "1"));
    }

    @Test
    public void test_SumWithEmptyStringFirst() {
        assertEquals("99999999999999999999999999999", SummingLargeNumbers.sumStrings("99999999999999999999999999999", ""));
    }

    @Test
    public void test_SumWithEmptyStringSecond() {
        assertEquals("1", SummingLargeNumbers.sumStrings("", "1"));
    }

    @Test
    public void test_SumBothEmptyStrings() {
        assertEquals("0", SummingLargeNumbers.sumStrings("", ""));
    }
}
