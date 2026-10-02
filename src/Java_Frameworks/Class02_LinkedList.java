package Java_Frameworks;

import java.util.*;

public class Class02_LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(4);
        ll.addFirst(3); // Adds element at first
        ll.addLast(6); // Adds element at last
        System.out.println(ll);
//        System.out.println(ll.removeFirst()); // Removes First element
//        System.out.println(ll.removeLast()); // Removes last element
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());
        System.out.println(ll.size());
        System.out.println(ll.contains(6)); // Returns a boolean value

    }
}
