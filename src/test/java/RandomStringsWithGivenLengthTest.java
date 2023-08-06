import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RandomStringsWithGivenLengthTest {
    @Test
    public void testGeneratedStringLength() {
        int length = 10;
        String randomString = RandomStringsWithGivenLength.generateRandomString(length);
        assertEquals(length, randomString.length(), "Generated string length should match the specified length");
    }

    @Test
    public void testGeneratedStringWithZeroLength() {
        int length = 0;
        String randomString = RandomStringsWithGivenLength.generateRandomString(length);
        assertEquals(length, randomString.length(), "Generated string with zero length should have zero length");
    }

    @Test
    public void testGeneratedStringWithNegativeLength() {
        int length = -5;
        String randomString = RandomStringsWithGivenLength.generateRandomString(length);
        assertEquals(0, randomString.length(), "Generated string with negative length should have zero length");
    }
}
