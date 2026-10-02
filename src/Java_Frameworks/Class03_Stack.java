package Java_Frameworks;

import java.util.*;

public class Class03_Stack {
    public static void main(String[] args) {
        // LIFO --> Last In First Out
        Stack<Integer> st = new Stack<>();
        st.push(2);
        st.push(4);
        st.push(6);
        st.push(8);
        System.out.println(st);
        System.out.println(st.peek()); // Returns the last element that was pushed
        System.out.println(st.pop()); // Removes the last element
        System.out.println(st.isEmpty());
        // Others are same as it implements List Interface

    }
}
