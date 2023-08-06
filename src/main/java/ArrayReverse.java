/**
 * This utility class reverses an array.
 *
 */
public class ArrayReverse {
    /**
     * Reverses the array.
     *
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