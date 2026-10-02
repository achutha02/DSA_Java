package Java_Frameworks;

import java.util.*;
public class Class08_PriorityQueue {
    public static void main(String[] args) {
        // Also Known as Min Heap
        // Stores elements and whenever ask for peek, it gives you the smallest element
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(1);
        pq.offer(0);
        pq.offer(5);
        pq.offer(4);
        System.out.println(pq);
        System.out.println(pq.peek()); // Returns the smallest element
        pq.poll(); // Removes the smallest element
        System.out.println(pq.peek());

        // Iterating over Priority Queue
        while(pq.isEmpty() == false){
            System.out.println(pq.peek());
            pq.poll();
        }
    }
}
