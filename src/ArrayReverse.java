import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

//This utility class reverses an array
public class ArrayReverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = Arrays.stream(scan.nextLine()
                        .split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();
        reverseArray(array);
        String arrayString = Arrays.stream(array)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(", "));

        System.out.println(arrayString);
    }

    /**
     * reverses the array
     * @param array
     **/
    public static void reverseArray(int[] array) {
        int firstElement = 0;
        int lastElement = array.length - 1;
        while (firstElement < lastElement) {
            int temp = array[firstElement];
            array[firstElement] = array[lastElement];
            array[lastElement] = temp;
            firstElement++;
            lastElement--;
        }
    }
}