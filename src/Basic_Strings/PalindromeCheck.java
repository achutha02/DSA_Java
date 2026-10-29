package Basic_Strings;

public class PalindromeCheck {
    public static boolean palindrome(String s){
        int n = s.length();

        int left = 0;
        int right = n-1;

        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "racecar";

        if(palindrome(str)){
            System.out.println("String is palindrome");
        }
        else {
            System.out.println("String is not palindrome");
        }
    }
}




/*

Time Complexity: O(N), where n is the length of the string.

Space Complexity: O(1), as no extra space is required.

*/
