import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayMedianTest {
    @Test
    public void test_PositionWithClosestSumWithPositiveNumbers() {
        int[] arr = {1, 2, 3, 4, 5};
        int closestPosition = FindingTheArraysMedian.positionWithClosestSum(arr);
        assertEquals(4, closestPosition);
    }
}
