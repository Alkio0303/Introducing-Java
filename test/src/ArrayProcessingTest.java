import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayProcessingTest {
    @Test
    public void minElementIndexTest(){
        ArrayProcessing arrayProcessing = new ArrayProcessing();
        int array[] = {1, 2, 3, 534, 23, 54, 322, 543, 432, -1};
        assertEquals(9, arrayProcessing.getMinElementIndex(array));
    }
    @Test
    public void arraySumTest(){
        ArrayProcessing arrayProcessing = new ArrayProcessing();
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertEquals(55, arrayProcessing.sum(array));
    }
    @Test
    public void largestSubArraySumTest(){
        ArrayProcessing arrayProcessing = new ArrayProcessing();
        int array[] = {1, 2, 3, 4, 5, 6, 7};
        assertEquals(28, arrayProcessing.findLargestSumSubarray(array));
    }
}
