package Algorithms.Sorting;

public class Sorter {

    private static <E> void swap(E[] a, int i, int j) {
        if (i == j)
            return;
        E temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    private static void swap(int[] a, int i, int j) {
        if (i == j)
            return;
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    /*
     * This is the only function that will be extending comparable just to
     * demonstrate how it can be done, the rest will be done using int for
     * simplicity.
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
}
