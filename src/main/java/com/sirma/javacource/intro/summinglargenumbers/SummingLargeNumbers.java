package com.sirma.javacource.intro.summinglargenumbers;

/**
 * This utility class is summing large numbers (larger than int)
 *
 */
public class SummingLargeNumbers {
    /**
     * This method is summing the numbers.
     * @param num1 first input.
     * @param num2 second input.
     */
    public static String sumStrings(String num1, String num2) {
        if (num1.isEmpty() && num2.isEmpty()) {
            return "0";
        }
        char[] num1Digits = new StringBuilder(num1).reverse().toString().toCharArray();
        char[] num2Digits = new StringBuilder(num2).reverse().toString().toCharArray();
        StringBuilder sumResult = new StringBuilder();
        int carry = 0;
        int maxLen = Math.max(num1Digits.length, num2Digits.length);
        for (int i = 0; i < maxLen; i++) {
            int digit1 = (i < num1Digits.length) ? Character.getNumericValue(num1Digits[i]) : 0;
            int digit2 = (i < num2Digits.length) ? Character.getNumericValue(num2Digits[i]) : 0;
            int digitSum = digit1 + digit2 + carry;
            carry = digitSum / 10;
            sumResult.append(digitSum % 10);
        }
        if (carry > 0) {
            sumResult.append(carry);
        }
        return sumResult.reverse().toString();
    }
}
