/**
 * This utility class sorts an array.
 *
 */
public class QuickSortAlgorithm {

    /**
     * Divides the array of two parts and then sorts them.
     *
     * @param arr, low, high
     */
    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    /**
     * Decides if an element of the array is bigger or smaller than the pivot and puts the element in its appropriate place.
     *
     * @param arr, low, high
     */
    static int partition(int[] arr, int low, int high) {
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
     * @param arr, int i, int j
     */
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * Prints the array.
     *
     * @param arr
     */
    public static void printArr(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}