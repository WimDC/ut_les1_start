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
    public int[] findCommonElements(int[] arrayOfInts, int[] arrayOfInts2) {
        if (arrayOfInts == null || arrayOfInts2 == null) {
            int[] nullList = new int[0];
            return nullList;
        }
        ArrayList<Integer> commonArrayList = new ArrayList<>();
        for (int i = 0; i < arrayOfInts.length ; i++) {
            for (int x = 0 ; x < arrayOfInts2.length ; x++) {
                if (arrayOfInts[i] == arrayOfInts2[x]) {
                    commonArrayList.add(arrayOfInts[i]);
                }
           }
       }
        int s = 0;
        int[] commonArray = new int[commonArrayList.size()];
        for (int i : commonArrayList) {
            commonArray[s] = i;
            s++;
        }
        return commonArray;
    }
/*    public int[] findDuplicateValues(int[] arrayOfInts) {
        var x = 0;
        if (arrayOfInts == null) {
            int[] nullList = new int[0];
            return nullList;
        }
        for (int v : arrayOfInts) {
            for (int i = 0; i<arrayOfInts.length; i++){
                if (v == arrayOfInts[i]) {
                    if
                }
            }
        }
    } */
//    public static void main(String[] args) {
//        ArrayOfInts ex1 = new ArrayOfInts();
//        int result = ex1.sumOfInts(new int[]{1, 2, 3, 4});
//        int sumXlargest = ex1.sumOfXLargest(new int[]{1, 2, 3, 4},2);
//        int popular = ex1.countMostPopularNumber(new int[]{1,2,3,3,3,4,5});
//        int[] common = ex1.findCommonElements(new int[]{1,2,3,4}, new int[]{1,1,3,5,7});
//        System.out.println(result);
//        System.out.println(sumXlargest);
//        System.out.println(popular);
//        System.out.println(common);
//    }
}
