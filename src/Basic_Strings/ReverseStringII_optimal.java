package Basic_Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseStringII_optimal {
    public static void reverseString(List<Character> s){
        int n = s.size();

        int start = 0;
        int end = n-1;

        while(start<end){
            char ch = s.get(start);
            s.set(start,s.get(end));
            s.set(end,ch);

            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        List<Character> str = new ArrayList<>(Arrays.asList('h','e','l','l','o'));

        reverseString(str);

        for(char ch : str){
            System.out.print(ch + " ");
        }
    }
}




/*

Time Complexity O(N) - Linear time complexity, where n is the length of the string. The algorithm iterates through half of the string.

SpaceComplexity O(1) - Constant space complexity. The algorithm only uses a few extra variables regardless of the input size.

*/
