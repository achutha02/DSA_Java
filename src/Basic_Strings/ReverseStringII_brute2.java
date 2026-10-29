package Basic_Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseStringII_brute2 {
    public static void reverseString(List<Character> s){
        int n = s.size();

        List<Character> dup = new ArrayList<>(n);

        for(int i=0;i<n;i++){
            dup.add(' ');
        }

        for(int i=0;i<n;i++){
            dup.set(i, s.get(n-i-1));
        }

        for(int i=0;i<n;i++){
            s.set(i,dup.get(i));
        }
    }
    public static void main(String[] args) {
        List<Character> str = new ArrayList<>(Arrays.asList('h','e','l','l','o'));

        reverseString(str);

        for(char c: str){
            System.out.print(c + " ");
        }
    }
}




/*

Time Complexity: O(N) , where N is the length of the string.
The algorithm iterates once over the string to copy characters into the temporary array and then iterates again to copy them back to the original string.

Space Complexity: O(N)
This is due to the usage of the extra data structure (temporary array), which grows linearly with the size of the input string.

*/
