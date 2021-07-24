package Algorithms.Sorting;

import java.util.Arrays;

public class Sorter {

    private static <E> void swap(E[] a, int i, int j) {
        if (i == j)
            return;
        E temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    /**
     * 
     * This is the only algorithm that will be extending comparable just to
     * demonstrate how it can be done, the rest will be done using int for
     * simplicity.
     * 
     */
    public static <T extends Comparable<T>> void bubbleSort(T[] ar) {
        int n = ar.length;
        System.out.println(n);
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if ((ar[j]).compareTo(ar[j + 1]) > 0)
                    swap(ar, j, j + 1);
            }
        }
    }

    private static void swap(int[] a, int i, int j) {
        if (i == j)
            return;
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    /**
     * Bubble sort is considered to be one of the most basic sorting algorithms. It
     * works by going through the array and swapping two elements if they are in the
     * wrong order.
     * 
     * <p>
     * Time Complexity: O(n^2) Space Complexity: O(1)
     * </p>
     */
    public static void bubbleSort(int[] ar) {

        int n = ar.length;
        System.out.println(n);
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (ar[j] > ar[j + 1])
                    swap(ar, j, j + 1);
            }
        }
    }

    /**
     * Selection sort is an in-place algorithm which works by repeatedly finding the
     * mimimum element in the array and putting it in the beginning.
     * 
     * One important thing about this algorithm is that it never makes more than
     * O(n) swaps.
     * 
     * <p>
     * Time Complexity: O(n^2) Space Complexity: O(1)
     * </p>
     */
    public static void selectionSort(int[] ar) {
        int n = ar.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (ar[minIdx] > ar[j]) {
                    minIdx = j;
                }
            }
            swap(ar, minIdx, i);
        }
    }

    public static void insertionSort(int[] ar) {
        int n = ar.length;
        for (int i = 1; i < n; i++) {
            int j = i - 1;
            int key = ar[i];
            while (j >= 0 && key < ar[j]) {
                ar[j + 1] = ar[j];
                j--;
            }
            ar[j + 1] = key;
            System.out.println(Arrays.toString(ar));
        }
    }

    /**
     * This algorithm is O(nlogn)
     * 
     */
    public static void mergeSort(int[] ar) {
        int n = ar.length;
        if (n < 2)
            return;
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];
        for (int i = 0; i < mid; i++) {
            l[i] = ar[i];
        }
        for (int j = mid; j < n; j++) {
            r[j - mid] = ar[j];
        }
        mergeSort(l);
        mergeSort(r);
        merge(ar, l, r, mid, n - mid);
    }

    private static void merge(int[] a, int[] l, int[] r, int left, int right) {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            } else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }
}
