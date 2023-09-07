package com.sirma.javacourse.intro.findingarraysmedian;

import com.sirma.javacource.intro.findingarraysmedian.FindingTheArraysMedian;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayMedianTest {
    @Test
    public void test_PositionWithClosestSumWithPositiveNumbers() {
        int[] arr = {1, 2, 3, 4, 5};
        int closestPosition = FindingTheArraysMedian.positionWithClosestSum(arr);
        assertEquals(4, closestPosition);
    }
    @Test
    public void test_PositionWithClosestSumNegativeIntegers() {
        int[] arr = {-1, -2, -3, -4, -5};
        assertEquals(4, FindingTheArraysMedian.positionWithClosestSum(arr));
    }
    @Test
    public void test_PositionWithClosestSumWithMixedIntegers() {
        int[] arr = {2, -1, 3, -4, 1};
        assertEquals(5, FindingTheArraysMedian.positionWithClosestSum(arr));
    }
    @Test
    public void testPositionWithClosestSumWithSingleElement() {
        int[] arr = {7};
        assertEquals(1, FindingTheArraysMedian.positionWithClosestSum(arr));
    }
    @Test
    public void testPositionWithClosestSumWithEmptyArray() {
        int[] arr = {};
        assertEquals(0, FindingTheArraysMedian.positionWithClosestSum(arr));
    }
}
