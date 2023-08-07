package com.sirma.javacource.intro.randomstringswithgivenlength;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

/**
 * This utility class generates a random string with given length
 *
 */
public class RandomStringsWithGivenLength {
    private static final Logger logger = LoggerFactory.getLogger(RandomStringsWithGivenLength.class);
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        logger.info("Enter the length for the string: ");
        int length = scanner.nextInt();

        String randomString = generateRandomString(length);
        logger.info("Generated string: " + randomString);

        scanner.close();
    }

    /**
     * This method generates random string
     *
     * @param length which will be the length of the new string
     */
    public static String generateRandomString(int length) {
        StringBuilder sb = new StringBuilder();
        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        for (int i = 0; i < length; i++) {
            int randomIndex = (int) (Math.random() * characters.length());
            sb.append(characters.charAt(randomIndex));
        }

        return sb.toString();
    }
}
