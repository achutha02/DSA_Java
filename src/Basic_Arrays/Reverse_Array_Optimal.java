package Basic_Arrays;

public class Reverse_Array_Optimal {
    public static void reverse(int [] arr){
        int n = arr.length;

        int p1 = 0;
        int p2 = n-1;

        while (p1 < p2){
            int temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;

            p1++;
            p2--;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int [] arr = {1,2,1,1,5,1};

        reverse(arr);
    }
}

/*
Time Complexity: O(N), A single-pass of the array with N elements is being done to reverse the array.

Space Complexity: O(N), for the extra array of the same size used.
*/
