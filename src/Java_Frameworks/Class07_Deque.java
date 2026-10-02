package Java_Frameworks;

import java.util.*;
public class Class07_Deque {
    public static void main(String[] args) {
        // FIFO
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        ad.offer(2);
        ad.offer(4);
        ad.offer(6);
        ad.offer(10);
        ad.offer(8);
        System.out.println(ad);
        System.out.println(ad.peek()); // Returns first element of the deque
        System.out.println(ad.poll()); // Removes the first entered element
        ad.offerFirst(45);
        ad.offerLast(50);
        System.out.println(ad.size());
    }
}
