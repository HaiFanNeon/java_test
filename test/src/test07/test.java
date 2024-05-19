package test07;

import java.util.Arrays;
import java.util.Comparator;

public class test {
    public static void main(String[] args) {
        Integer[] a = {5,3,9,1};

//        Arrays.sort(a, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer integer, Integer t1) {
//                return integer - t1;
//            }
//        });

//        Arrays.sort(a, (a1, b)->a1 - b);
//        System.out.println(Arrays.toString(a));
        Arrays.sort(a, test::subtraction);
        System.out.println(Arrays.toString(a));
    }
    public static int subtraction(int n1, int n2) {
        return n1 - n2;
    }
}
