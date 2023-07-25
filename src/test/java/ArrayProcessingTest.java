import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayProcessingTest {
    @Test
    public void test_minElementIndex(){
        int[] array = {1, 2, 3, 534, 23, 54, 322, 543, 432, -1};
        assertEquals(9, ArrayProcessing.getMinElementIndex(array));
    }
    @Test
    public void test_arraySum(){
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertEquals(55, ArrayProcessing.sum(array));
    }
    @Test
    public void test_largestSubArraySum(){
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        assertEquals(28, ArrayProcessing.findLargestSumSubarray(array));
    }
}
