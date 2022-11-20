package ex03_more_arrays;

import ex01_arrays.ArrayOfInts;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class findCommmonElementsTest {

    private final ArrayOfInts arrayOfInts = new ArrayOfInts();
    private final ArrayOfInts arrayOfInts2 = new ArrayOfInts();

    @Test
    public void oneNullArray() {
        int[] result = arrayOfInts.findCommonElements(null, new int[]{1,2,3,4});
        assertArrayEquals(new int[0], result);
    }
    @Test
    public void twoNullArray() {
        int[] result = arrayOfInts.findCommonElements(null, null);
        assertArrayEquals(new int[0], result);
    }
    @Test
    public void noDoublesInArray() {
        int[] result = arrayOfInts.findCommonElements(new int[]{1,3,5,7}, new int[]{1,2,3,4});
        assertArrayEquals(new int[]{1,3}, result);
    }
    @Test
    public void doublesInArray() {
        int[] result = arrayOfInts.findCommonElements(new int[]{1,3,5,7}, new int[]{1,1,2,3,3,4});
        assertArrayEquals(new int[]{1,3}, result);
    }
}
