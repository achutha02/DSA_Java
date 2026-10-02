package Java_Frameworks;

import java.util.*;
public class Class05_HashSet {
    public static void main(String[] args) {
        // Data Structure that stores unique elements in any random order
        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(1);
        hs.add(4);
        System.out.println(hs);
//        System.out.println(hs.remove(2)); // Removes that element and returns

        // Other way of printing hash set using for each loop
        // var auto converts the data type
        for(var num: hs){
            System.out.println(num);
        }

        // Takes O(1) for all operations
    }
}
