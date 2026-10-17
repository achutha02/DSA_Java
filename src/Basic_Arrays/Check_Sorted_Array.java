package Basic_Arrays;


public class Check_Sorted_Array {
    public static boolean isSorted(int [] arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        boolean issorted = isSorted(arr);
        System.out.println(issorted);
    }
}


/*
Time Complexity: O(n) in the worst case, because the single loop checks each of the n - 1 adjacent pairs once.

Space Complexity: O(1) auxiliary space, because the function uses only one loop index and creates no additional array.
*/
