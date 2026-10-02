package Java_Frameworks;

import java.util.*;
public class Class10_TreeMap {
    public static void main(String[] args) {
        // Stores sorted order of keys
        // Does not store duplicate
        TreeMap<Integer, String> tm = new TreeMap<>();
        tm.put(1, "Achyuta");
        tm.put(3, "Virat");
        tm.put(2, "Sachin");
        tm.put(4, "Vikram");
        tm.put(5, "Sudeep");

        System.out.println(tm.ceilingKey(2)); // Returns first key which is greater than or equal to given key (>=)
        System.out.println(tm.floorKey(3)); // Returns first key which is lesser than or equal to given key (<=)

        Set<Integer> st = tm.keySet(); // Returns all the keys in set
        System.out.println(st);
    }
}
