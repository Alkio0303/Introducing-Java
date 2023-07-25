import java.util.Arrays;
import java.util.Scanner;

/**
 * This utility class has methods for processing arrays.
 *
 */
public class ArrayProcessing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = Arrays.stream(scan.nextLine()
                        .split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }

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
     * Prints the array.
     *
     * @param array
     **/
    public static void print(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
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