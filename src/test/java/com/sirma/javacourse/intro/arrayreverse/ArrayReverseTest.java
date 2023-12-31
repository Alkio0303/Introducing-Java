package com.sirma.javacourse.intro.arrayreverse;

import com.sirma.javacource.intro.arrayreverse.ArrayReverse;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArrayReverseTest {
    @Test
    public void test_reverseAnArray(){
        int[] array = {1, 2, 3, 4, 5, 6};
        int[] expectedOutput = {6, 5, 4, 3, 2, 1};
        ArrayReverse.reverseArray(array);
        assertArrayEquals(array, expectedOutput);
    }
    @Test
    public void testReverseArrayEmptyArray() {
        int[] input = {};
        int[] expected = {};
        ArrayReverse.reverseArray(input);
        assertArrayEquals(expected, input);
    }
}
