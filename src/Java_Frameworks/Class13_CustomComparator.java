package Java_Frameworks;

import java.util.*;
public class Class13_CustomComparator {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(5);
        al.add(4);
        // sort it in descending order
        Collections.sort(al, new Comparator<Integer>() {
            @Override
            public int compare(Integer num1, Integer num2) {
                if(num1 < num2){
                    return 1;
                }
                else if(num1 > num2){
                    return -1;
                }
                return 0;
            }
        });
        System.out.println(al);

        // Using Lambda Functions
        //num1 < num2 -> wrong order
        Collections.sort(al, (num1, num2) -> num2 - num1);
        System.out.println(al);
    }
}
