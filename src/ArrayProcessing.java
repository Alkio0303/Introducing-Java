import java.util.Arrays;
import java.util.Scanner;

public class ArrayProcessing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = Arrays.stream(scan.nextLine()
                .split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int minIndex = getMinElementIndex(array);
        System.out.println("Index of the element with minimum value: " + minIndex);

        int arraySum = sum(array);
        System.out.println("Sum of all elements in the array: " + arraySum);

        System.out.print("Array elements: ");
        print(array);

        int largestSum = findLargestSumSubarray(array);
        System.out.println("Largest sum of a contiguous subarray: " + largestSum);
    }
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
    public static int sum(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return sum;
    }
    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
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
