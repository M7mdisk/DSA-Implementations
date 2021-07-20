import java.util.Arrays;

import Algorithms.Sorting.Sorter;

public class Main {

    public static void main(String[] args) {

        int[] s = { 5, 67, 7, 3, 2, 5, 98 };
        System.out.println(s[0]);
        System.out.println(Arrays.toString(s));
        Sorter.bubbleSort(s);
        System.out.println(Arrays.toString(s));

    }
}