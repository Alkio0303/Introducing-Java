import com.sirma.javacource.intro.gcd.GreatestCommonDivisorOfTwoIntegers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class GreatestCommonDivisorOfTwoIntegersTest {
    @Test
    public void test_gcd(){
        int a = 5;
        int b = 35;
        Assertions.assertEquals(5, GreatestCommonDivisorOfTwoIntegers.gcd(a, b));
    }

    @Test
    public void test_lcd(){ 
        int a = 5;
        int b = 35;
        Assertions.assertEquals(35, GreatestCommonDivisorOfTwoIntegers.lcd(a, b));
    }
    @Test
    public void test_GcdWithZero() {
        int firstNumber = 0;
        int secondNumber = 5;

        int gcdResult = GreatestCommonDivisorOfTwoIntegers.gcd(firstNumber, secondNumber);

        assertEquals(secondNumber, gcdResult);
    }

    @Test
    public void test_LcdWithZero() {
        int firstNumber = 0;
        int secondNumber = 5;

        int lcdResult = GreatestCommonDivisorOfTwoIntegers.lcd(firstNumber, secondNumber);

        assertEquals(0, lcdResult);
    }
}
