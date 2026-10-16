package Basic_Arrays;

public class Sum_of_Array_Elements {
    public static int sum(int [] arr){
        int n = arr.length;
        int sum1 = 0;
        for(int i=0;i<n;i++){
            sum1 += arr[i];
        }
        return sum1;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int result = sum(arr);
        System.out.println(result);
    }
}
