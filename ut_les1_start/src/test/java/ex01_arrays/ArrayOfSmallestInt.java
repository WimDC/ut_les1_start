package ex01_arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOfSmallestInt {

    private final ArrayOfInts arrayOfInts = new ArrayOfInts();

    @Test
    void exactlyX() {
       int result = arrayOfInts.sumOf3SmallestInts(new int[]{2, 4,5});
       assertEquals(11, result);
    }
}
