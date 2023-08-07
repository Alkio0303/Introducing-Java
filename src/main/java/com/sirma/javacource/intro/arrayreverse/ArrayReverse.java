package com.sirma.javacource.intro.arrayreverse;

/**
 * This utility class reverses an array.
 *
 */
public class ArrayReverse {
    /**
     * Reverses the array.
     *
     * @param array
     **/
    public static void reverseArray(int[] array) {
        int length = array.length;
        for (int i = 0; i < length / 2; i++) {
            int temp = array[i];
            array[i] = array[length - i - 1];
            array[length - i - 1] = temp;
        }
    }
}