

/**
 * This utility class finds the median of an array.
 *
 */
public class FindingTheArraysMedian {
    public static void main(String[] args) {
        int[] arr = {4,5,99,-1,5,6};
        int closestPosition = PositionWithClosestSum(arr);
        System.out.println("Position of closest element: " + closestPosition);
    }

    /**
     * Finds the position with the closest sum.
     *
     * @param arr
     */
    public static int PositionWithClosestSum(int[] arr) {
        int closestIndex = -1;
        int minDifference = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int sumBefore = arraySum(arr, 0, i);
            int sumAfter = arraySum(arr, i + 1, arr.length);
            int difference = Math.abs(sumBefore - sumAfter);
            if (difference < minDifference) {
                minDifference = difference;
                closestIndex = i;
            }
        }
        return closestIndex + 1;
    }

    /**
     * Calculates the total sum of an array.
     *
     * @param arr, start, end
     */
    private static int arraySum(int[] arr, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += arr[i];
        }
        return sum;
    }
}