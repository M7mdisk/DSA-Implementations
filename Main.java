import java.util.Arrays;
import java.util.LinkedList;

import Algorithms.Sorting.Sorter;

public class Main {

    public static void main(String[] args) {

        int[] ar = {2,4,99,1,67,34,99,21};
        System.out.println(Arrays.toString(ar));
        Sorter.quickSort(ar);
        System.out.println(Arrays.toString(ar));
    }
}