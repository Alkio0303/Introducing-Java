package com.sirma.javacource.intro.findingthearraysmedian;

/**
 * This utility class finds the median of an array.
 *
 */

public class FindingTheArraysMedian {

    /**
     * Finds the position with the closest sum.
     *
     * @param arr
     */
    public static int positionWithClosestSum(int[] arr) {
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }

        int leftSum = 0;
        int minDifference = Integer.MAX_VALUE;
        int closestIndex = -1;

        for (int i = 0; i < arr.length; i++) {
            int sumBefore = leftSum;
            int sumAfter = totalSum - leftSum - arr[i];
            int difference = Math.abs(sumBefore - sumAfter);

            if (difference < minDifference) {
                minDifference = difference;
                closestIndex = i;
            }

            leftSum += arr[i];
        }

        return closestIndex + 1;
    }
}