package Java_Frameworks;

import java.util.*;
public class Class11_Iterator {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(4);
        al.add(6);
        al.add(3);

        for(var num: al){
            System.out.println(num);
        }

        // Using Iterator
        // The iterator points just before the starting index
        Iterator<Integer> iterator = al.iterator();
        while (iterator.hasNext()){
            int num = iterator.next();
            System.out.println(num);
        }
    }
}
