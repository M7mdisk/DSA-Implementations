package Algorithms.Search;

public class Searcher {

    public static void BFS() {

    }

    /**
     * Classic binary search as in most text books, this implementation is good but
     * it lacks many improvements. The function will return the index of the key if
     * it exists, else return -1
     */
    public static <E extends Comparable<E>> int binarySearch(E[] ar, E key) {
        int low = 0, high = ar.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (ar[mid].compareTo(key) < 0) {
                low = mid + 1;
            } else if (ar[mid].compareTo(key) > 0) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
