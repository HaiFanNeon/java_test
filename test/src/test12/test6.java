package test12;

import java.util.Arrays;
import java.util.Comparator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class test6 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        Integer i = new Integer(1);
//        System.out.println(Integer.toBinaryString(100));
        Integer[] a = {1,3,4,9,8,7,6,1,2,10};
//
//        Arrays.sort(a, (a1,a2) -> a1-a2);
//        System.out.println(Arrays.toString(a));
//        System.out.println(Arrays.binarySearch(a, 1));
        Integer[] copy = Arrays.copyOf(a, 10);
        Arrays.fill(copy, -1);
        System.out.println(Arrays.toString(copy));
    }

}
