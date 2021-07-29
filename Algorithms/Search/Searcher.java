package Algorithms.Search;

public class Searcher {

    // returns the first occurance of the key, if key is not present returns -1.
    public static <E extends Comparable<E>> int linearSearch(E[] ar, E key) {
        int idx = -1;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i].compareTo(key) == 0) {
                idx = i;
                break; // remove this statement if you want to return the last occureance of the
                       // elment.
            }
        }
        return idx;
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

    // return the index of the key or the largest element smaller than it.
    public static <E extends Comparable<E>> int binarySearchOrLower(E[] ar, E key) {
        int low = -1, high = ar.length;
        while (low + 1 < high) {
            int mid = (low + high) / 2;
            if (ar[mid].compareTo(key) <= 0) {
                low = mid;
            } else {
                high = mid;
            }
        }
        return low;
    }

    // return the index of the key or the smallest element larger than it.
    public static <E extends Comparable<E>> int binarySearchOrHigher(E[] ar, E key) {
        int low = -1, high = ar.length;
        while (low + 1 < high) {
            int mid = (low + high) / 2;
            if (ar[mid].compareTo(key) > 0) {
                low = mid;
            } else {
                high = mid;
            }
        }
        return high == ar.length ? -1 : high;
    }

}
