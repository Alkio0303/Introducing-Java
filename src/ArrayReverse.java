import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ArrayReverse {
    public static void main(String[] args) {
        /* reading the array */
        Scanner scan = new Scanner(System.in);
        int[] array = Arrays.stream(scan.nextLine()         /* reading the array elements from the console */
                        .split(", "))
                        .mapToInt(Integer::parseInt)
                        .toArray();

        /* reversing the array */
        reverseArray(array);

        String arrayString = Arrays.stream(array)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(", "));

        /* printing the array */
        System.out.println(arrayString);
    }
    /* method for reversing the array */
    public static void reverseArray(int[] array) {
        int firstElement = 0;                  /* temporary variable indexing the start of the array */
        int lastElement = array.length - 1;    /* temporary variable indexing the end of the array */

        while (firstElement < lastElement) {
            /* Swap elements */
            int temp = array[firstElement];
            array[firstElement] = array[lastElement];
            array[lastElement] = temp;

            /* Moving the indices towards the center of the array */
            firstElement++;
            lastElement--;
        }
    }
}
