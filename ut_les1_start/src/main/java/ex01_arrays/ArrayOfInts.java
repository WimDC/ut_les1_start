package ex01_arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;

public class ArrayOfInts {
    public int sumOfInts(int[] arrayOfInts) {
        if (arrayOfInts == null) return 0;
        int sum = 0;
        for (int i : arrayOfInts)
            sum += i;
        return sum;
    }

    public int sumOf3SmallestInts(int[] arrayOfInts) {
        if (arrayOfInts == null) return 0;
        int[] copy = Arrays.copyOf(arrayOfInts, arrayOfInts.length);
        Arrays.sort(copy);
        return sumOfInts(Arrays.copyOf(copy, 3));
    }

    public int sumOfEven(int[] arrayOfInts) {
        if (arrayOfInts == null) return 0;
        int[] even = new int[arrayOfInts.length];
        int evenLength = 0;
        for (int i : arrayOfInts)
            if (i % 2 == 0) even[evenLength++] = i;
        return sumOfInts(even);
    }

    public int sumOfXLargest(int[] arrayOfInts, int x) {
        if (arrayOfInts == null) return 0;
        if (x > arrayOfInts.length) {
            x = arrayOfInts.length;
        }
        int[] sumOfXLargest = Arrays.copyOf(arrayOfInts, arrayOfInts.length);
        Arrays.sort(sumOfXLargest);
        int sum = 0;
        for (int i=sumOfXLargest.length;i > sumOfXLargest.length-x;i--) {
            sum += sumOfXLargest[i-1];
        }
        return sum;
    }
    public int countMostPopularNumber(int[] arrayOfInts) {
        if (arrayOfInts == null) return 0;
        HashMap<Integer,Integer> counter = new HashMap<>();
        for (Integer i : arrayOfInts)
            counter.put(i, counter.getOrDefault(i,0)+1);
        Collection<Integer> values = counter.values();
        int max = 0;
        for (Integer v : values)
            if (v > max) max = v;
        return max;
    }

    public static void main(String[] args) {
        ArrayOfInts ex1 = new ArrayOfInts();
        int result = ex1.sumOfInts(new int[]{1, 2, 3, 4});
        int sumXlargest = ex1.sumOfXLargest(new int[]{1, 2, 3, 4},2);
        int popular = ex1.countMostPopularNumber(new int[]{1,2,3,3,3,4,5});
//        System.out.println(result);
//        System.out.println(sumXlargest);
        System.out.println(popular);
    }
}
