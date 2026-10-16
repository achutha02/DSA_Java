package Basic_Arrays;

public class Count_of_Odd_Numbers {
    public static int countOdd(int [] arr){
        int count = 0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i] % 2 != 0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,1,1,5,1};
        int result = countOdd(arr);
        System.out.println(result);
    }
}
