package com.sirma.javacourse.intro.randomstringswithgivenlenght;

import com.sirma.javacource.intro.randomstringswithgivenlength.RandomStringsWithGivenLength;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RandomStringsWithGivenLengthTest {
    @Test
    public void testGeneratedStringLength() {
        int length = 10;
        String randomString = RandomStringsWithGivenLength.generateRandomString(length);
        assertEquals(length, randomString.length());
    }

    @Test
    public void testGeneratedStringWithZeroLength() {
        int length = 0;
        String randomString = RandomStringsWithGivenLength.generateRandomString(length);
        assertEquals(length, randomString.length());
    }

    @Test
    public void testGeneratedStringWithNegativeLength() {
        int length = -5;
        String randomString = RandomStringsWithGivenLength.generateRandomString(length);
        assertEquals(0, randomString.length());
    }
}
