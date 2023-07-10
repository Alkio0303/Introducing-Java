package test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayMedianTest {
    @Test
    public void test_PositionWithClosestSumWithPositiveNumbers() {
        int[] arr = {1, 2, 3, 4, 5};
        int closestPosition = main.FindingTheArraysMedian.PositionWithClosestSum(arr);
        assertEquals(3, closestPosition);
    }
}
