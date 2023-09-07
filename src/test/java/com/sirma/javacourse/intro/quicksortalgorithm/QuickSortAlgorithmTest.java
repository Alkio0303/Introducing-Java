package com.sirma.javacourse.intro.quicksortalgorithm;

import com.sirma.javacource.intro.quicksortalgorithm.QuickSortAlgorithm;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class QuickSortAlgorithmTest {
    @Test
    public void test_swapTest(){
        int[] array = {4, 2, 1, 3, 5};
        int a = 1;
        int b = 3;
        int[] expectedOutput = {4, 3, 1, 2, 5};
        QuickSortAlgorithm.swap(array, a, b);
        assertArrayEquals(expectedOutput, array);
    }
    @Test
    public void test_partitionTest(){
        int[] arr = {4, 9, 2, 5, 1};
        int low = 0;
        int high = arr.length - 1;
        int partitionIndex = QuickSortAlgorithm.partition(arr, low, high);
        assertEquals(0, partitionIndex);
    }
    @Test
    public void test_PartitionWithSortedArray() {
        int[] arr = {1, 2, 3, 4, 5};
        int low = 0;
        int high = arr.length - 1;
        int partitionIndex = QuickSortAlgorithm.partition(arr, low, high);
        assertEquals(4, partitionIndex);
    }
    @Test
    public void test_PartitionWithReverseSortedArray() {
        int[] arr = {5, 4, 3, 2, 1};
        int low = 0;
        int high = arr.length - 1;
        int partitionIndex = QuickSortAlgorithm.partition(arr, low, high);
        assertEquals(0, partitionIndex);
    }
}
