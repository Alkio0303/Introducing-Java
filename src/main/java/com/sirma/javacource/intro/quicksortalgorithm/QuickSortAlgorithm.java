package com.sirma.javacource.intro.quicksortalgorithm;

/**
 * This utility class sorts an array.
 *
 */
public class QuickSortAlgorithm {
    /**
     * Divides the array of two parts and then sorts them.
     *
     * @param arr, this is the array which is divided.
     * @param low, smallest element in the array.
     * @param high, highest element in the array.
     */
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    /**
     * Decides if an element of the array is bigger or smaller than the pivot and puts the element in its appropriate place.
     *
     * @param arr, elements from the array are used.
     * @param low, smallest element in the array.
     * @param high, biggest element in the array.
     */
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    /**
     * Swaps the elements of the array.
     *
     * @param arr, the array which will swap.
     * @param i, position of an element which we want to swap.
     * @param j, position of an element which we want to swap.
     */
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}