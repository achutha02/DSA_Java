package Basic_Arrays;

public class Reverse_Array {
    public static void reverse(int [] arr){
        int n = arr.length;
        int [] ans = new int[n];

        for(int i=0;i<n;i++){
            ans[n-i-1] = arr[i];
        }

        for(int i=0;i<n;i++){
            arr[i] = ans[i];
        }
    }
    public static void main(String[] args) {
        int [] arr = {1,2,1,1,5,1};

        reverse(arr);

        for(int n: arr){
            System.out.print(n + " ");
        }
    }
}


/*
Time Complexity: O(N), A single-pass of the array with N elements is being done to reverse the array.

Space Complexity: O(N), for the extra array of the same size used.
*/
