package Java_Frameworks;

import java.util.*;
public class Class09_HashMap {
    public static void main(String[] args) {
        // Key, Value
        // rollnumber is the key
        // name is value
        // does not store keys in sorted order
        HashMap<Integer, String> mp = new HashMap<>();
        mp.put(1,"Achyuta");
        mp.put(2, "Bumaraha");
        mp.put(3, "Hardik");
        mp.put(4, "Rohith");
        mp.put(5, "Virat");
        mp.put(6, "Sachin");
        System.out.println(mp);

        System.out.println(mp.get(3));
        System.out.println(mp.size());
//        System.out.println(mp.remove(1)); // Removes key

        // takes O(1) for all operation
    }
}
