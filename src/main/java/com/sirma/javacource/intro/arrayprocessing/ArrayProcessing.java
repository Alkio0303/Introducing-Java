package com.sirma.javacource.intro.arrayprocessing;

/**
 * This utility class has methods for processing arrays.
 *
 */
public class ArrayProcessing {
    /**
     * Gets the index of the minimal element in an array.
     *
     * @param array
     **/
    public static int getMinElementIndex(int[] array) {
        int minIndex = 0;
        int minValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    /**
     * Sums the elements of an array.
     *
     * @param array
     */
    public static int sum(int[] array) {
        int sum = 0;
        for (int j : array) {
            sum += j;
        }
        return sum;
    }

    /**
     * Finds the largest sub array.
     *
     * @param array
     **/
    public static int findLargestSumSubarray(int[] array) {
        int maxSum = array[0];
        int currentSum = array[0];
        for (int i = 1; i < array.length; i++) {
            currentSum = Math.max(array[i], currentSum + array[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}