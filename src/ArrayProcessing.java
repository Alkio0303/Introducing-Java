import java.util.Arrays;
import java.util.Scanner;

public class ArrayProcessing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = Arrays.stream(scan.nextLine()
                .split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();                             /* reading array from the console */

        System.out.println("Index of the element with minimum value: " + getMinElementIndex(array));

        System.out.println("Sum of all elements in the array: " + sum(array));

        System.out.print("Array elements: ");
        print(array);

        System.out.println("Largest sum of a contiguous subarray: " + findLargestSumSubarray(array));
    }
    /* method for the index of minimal element */
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
    /* method for the sum of every element in the array*/
    public static int sum(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return sum;
    }
    /* prints the elements of the array */
    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    /* finds the largest sum of subarrays in the array */
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