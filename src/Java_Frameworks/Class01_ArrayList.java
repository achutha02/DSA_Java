package Java_Frameworks;

import java.util.*;

public class Class01_ArrayList {
    static void main(String[] args) {
        ArrayList<Integer> aList = new ArrayList<>();
        aList.add(10);
        aList.add(16);
        aList.add(25);
        aList.add(14);
        System.out.println(aList);
        System.out.println(aList.size());
        System.out.println(aList.get(3));
//        System.out.println(aList.remove(2)); // Removes the number at that index
        aList.add(1,15);
        System.out.println(aList);
//        aList.clear(); // Clears the entire list
        System.out.println(aList.contains(15)); // Returns boolean value if the element is present or not

    }
}
