package Java_Frameworks;

import java.util.*;
public class Class14_PriorityQueue_MaxHeap {
    public static Comparator<Integer> getComparator(){
        return new Comparator<Integer>() {
            @Override
            public int compare(Integer num1, Integer num2) {
                if(num1 < num2){
                    return 1;
                } else if (num1 > num2) {
                    return -1;
                }
                return 0;
            }
        };
    }
    public static void main(String[] args) {
        // max heap
        // Which returns the max element when you poll
        PriorityQueue<Integer> pq = new PriorityQueue<>(getComparator());
        pq.add(1);
        pq.add(5);
        pq.add(3);
        System.out.println(pq.poll());
    }
}
