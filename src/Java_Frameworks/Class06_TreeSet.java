package Java_Frameworks;

import java.util.*;
public class Class06_TreeSet {
    public static void main(String[] args) {
        // Data Structure that stores unique element in sorted order
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(1);
        ts.add(2);
        ts.add(0);
        ts.add(-1);
        ts.add(8);
        ts.add(9);
        ts.add(12);
        ts.add(4);
        System.out.println(ts);
        for(var num: ts){
            System.out.println(num);
        }
        System.out.println(ts.floor(8)); // Returns the element that is lesser than 8 in the set. It is <= (Lesser than or equal)
        System.out.println(ts.ceiling(8)); // Returns the element that is greater than 8 in the set. It is >= (Greater than or equal)

        // takes O(Log N) for all operations
    }
}
