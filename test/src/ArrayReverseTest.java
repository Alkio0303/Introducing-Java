import org.junit.jupiter.api.Test;

public class ArrayReverseTest {
    @Test
    public void ReverseAnArray(){
        ArrayReverse arrayReverse = new ArrayReverse();
        int[] array = {1, 2, 3, 4, 5, 6};
        int[] expectedOutput = {6, 5, 4, 3, 2, 1};
        arrayReverse.reverseArray(array);
        assertArrayEquals(array, expectedOutput);

    }
}
