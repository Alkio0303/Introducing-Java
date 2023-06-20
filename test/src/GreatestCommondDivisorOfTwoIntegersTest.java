import org.junit.jupiter.api.Test;

public class GreatestCommonDivisorOfTwoIntegersTest {
    @Test
    public void GreatestCommonDivisorTest(){
        GreatestCommonDivisorOfTwoIntegers gcd = new GreatestCommonDivisorOfTwoIntegers();
        int a = 35;
        int b = 5;
        String expectedOutput = gcd.GCD(35, 5);
        assertEqual(5, expectedOutput);
    }
}
