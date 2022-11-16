package ex01_arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class sumOfEven {

    private final ArrayOfInts arrayOfInts = new ArrayOfInts();

    @Test
    void allEven() {
        int result = arrayOfInts.sumOfEven(new int[]{2, 4,6});
        assertEquals(12, result);
    }

    @Test
    void evenUneven() {
        int result = arrayOfInts.sumOfEven(new int[]{2, 4,5,7});
        assertEquals(6, result);
    }

    @Test
    void allUneven() {
        int result = arrayOfInts.sumOfEven(new int[]{1, 1, 3, 5, 5, 7});
        assertEquals(0, result);
    }

    @Test
    void equalNumbers() {
        int result = arrayOfInts.sumOfEven(new int[]{2, 4, 2, 1, 5});
        assertEquals(11, result);
    }

    @Test
    void xIs0() {
        int result = arrayOfInts.sumOfEven(new int[]{2, 3, 8});
        assertEquals(0, result);
    }

    @Test
    void emptyArray() {
        int result = arrayOfInts.sumOfEven(new int[]{});
        assertEquals(0, result);
    }

    @Test
    void nullArray() {
        int result = arrayOfInts.sumOfEven(null);
        assertEquals(0, result);
    }
}
