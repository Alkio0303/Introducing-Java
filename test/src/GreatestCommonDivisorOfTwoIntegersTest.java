import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreatestCommonDivisorOfTwoIntegersTest {
    @Test
    public void gcdTest(){
        GreatestCommonDivisorOfTwoIntegers greatestCommonDivisorOfTwoIntegers = new GreatestCommonDivisorOfTwoIntegers();
        int a = 5;
        int b = 35;
        assertEquals(5, greatestCommonDivisorOfTwoIntegers.gcd(a, b));
    }
    @Test
    public void lcdTest(){
        GreatestCommonDivisorOfTwoIntegers greatestCommonDivisorOfTwoIntegers = new GreatestCommonDivisorOfTwoIntegers();
        int a = 5;
        int b = 35;
        assertEquals(35, greatestCommonDivisorOfTwoIntegers.lcd(a, b));
    }
}
