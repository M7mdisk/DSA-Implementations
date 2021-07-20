import java.util.Arrays;
import java.util.LinkedList;

import Algorithms.Sorting.Sorter;

public class Main {

    public static void main(String[] args) {

        DataStructures.LinkedList mylist = new DataStructures.LinkedList<>();
        mylist.append(2);
        mylist.append(5);
        mylist.append(1);
        System.out.println(mylist.toString());
        mylist.reverse();
        System.out.println(mylist.toString());
        

    }
}