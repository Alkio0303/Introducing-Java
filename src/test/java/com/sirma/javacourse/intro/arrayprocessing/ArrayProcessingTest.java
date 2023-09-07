package com.sirma.javacourse.intro.arrayprocessing;

import com.sirma.javacource.intro.arrayprocessing.ArrayProcessing;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayProcessingTest {
    @Test
    public void test_minElementIndex(){
        int[] array = {1, 2, 3, 534, 23, 54, 322, 543, 432, -1};
        Assertions.assertEquals(9, ArrayProcessing.getMinElementIndex(array));
    }
    @Test
    public void test_arraySum(){
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Assertions.assertEquals(55, ArrayProcessing.sum(array));
    }
    @Test
    public void test_largestSubArraySum(){
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        Assertions.assertEquals(28, ArrayProcessing.findLargestSumSubarray(array));
    }
}
