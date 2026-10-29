package Basic_Strings;

public class ReverseStringII_brute {
    public static void reverseString(char [] nums){
        int n = nums.length;

        char [] dup = new char[n];

        for(int i=0;i<n;i++){
            dup[n-i-1] = nums[i];
        }

        for(int i=0;i<n;i++){
            nums[i] = dup[i];
        }
    }
    public static void main(String[] args) {
        char [] arr = {'h','e','l','l','o'};

        reverseString(arr);

        for(char c : arr){
            System.out.print(c + " ");
        }
    }
}
