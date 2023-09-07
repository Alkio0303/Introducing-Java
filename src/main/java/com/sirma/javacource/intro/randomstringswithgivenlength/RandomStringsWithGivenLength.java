package com.sirma.javacource.intro.randomstringswithgivenlength;

/**
 * This utility class generates a random string with given length
 *
 */
public class RandomStringsWithGivenLength {
    /**
     * This method generates random string.
     *
     * @param length, which will be the length of the new string.
     */
    public static String generateRandomString(int length) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int randomAscii = (int) (Math.random() * 128);
            sb.append((char) randomAscii);
        }
        return sb.toString();
    }
}
