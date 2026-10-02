package Java_Frameworks;


import java.util.*;
public class Class12_CommonAlgorithms {
    static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(5);
        al.add(4);
        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);
        System.out.println(Collections.max(al));
        System.out.println(Collections.min(al));
        Collections.reverse(al);
        System.out.println(al);
        System.out.println(Collections.frequency(al,5));

        double num = Math.pow(2,5);
        System.out.println(num);
    }
}
