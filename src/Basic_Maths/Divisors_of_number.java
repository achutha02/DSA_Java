package Basic_Maths;

import java.util.Arrays;
import java.util.Scanner;
public class Divisors_of_number {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int arr[] =new int[n];
        int count = 0;
        for(int i=1;i<=n;i++){
            if(n%i == 0){
                arr[count++] = i;
            }
        }

        int [] ans = Arrays.copyOf(arr, count);
       for(int a:ans){
           System.out.print(a + " ");
       }
    }
}


/*
Time Complexity: O(N) – Iterating N times, and performing constant time operations in each pass.

Space Complexity: O(K), where K is the number of divisors of N.
In the worst case, K is at most O(sqrt(N)), since divisors come in pairs.
*/
