import java.util.Arrays;
import java.util.Scanner;

//This utility class finds the median of an array
public class FindingTheArraysMedian {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = Arrays.stream(scan.nextLine()
                        .split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int medianPosition1 = findMedianPosition(array);
        System.out.println("Median of the array: " + array[medianPosition1]);
    }

    /**
     * finds the position of the median
     * @param array
     **/
    public static int findMedianPosition(int[] array) {
        Arrays.sort(array);
        int length = array.length;
        int position = (length + 1) / 2;
        return position;
    }
}