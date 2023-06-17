import java.util.Arrays;
import java.util.Scanner;

public class FindingTheArraysMedian {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = Arrays.stream(scan.nextLine()         /* reading the array elements from the console */
                        .split(", "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
        int medianPosition1 = findMedianPosition(array);
        System.out.println("Median of the array: " + array[medianPosition1]);
    }

    /* Method for finding the position of the median */
    public static int findMedianPosition(int[] array) {
        /* Sort the array */
        Arrays.sort(array);

        /* Determine the length of the array */
        int length = array.length;

        /* Calculate the position of the median */
        int position = (length + 1) / 2;

        /* Return the position of the median */
        return position;
    }
}