package Basic_Maths;

import java.util.Arrays;
import java.util.Scanner;
public class Divisors_of_number_Optimal {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int temp[] = new int[n];
        int count = 0;

        int sqrt = (int)Math.sqrt(n);

        for(int i=1;i<=sqrt;i++){
            if(n%i == 0){
                temp[count++] = i;

                if(i != n/i){
                    temp[count++] = n/i;
                }
            }
        }

        int [] ans = Arrays.copyOf(temp,count);
        Arrays.sort(ans);
        for (int a:ans){
            System.out.print(a + " ");
        }
    }
}

/*
Time Complexity: O(sqrt(N)) + O(K*Log(K)) – Iterating sqrt(N) times, and performing constant time operations in each pass to get all the divisors in the list. Sorting the list of divisors takes O(K*Log(K)) time where K is the number of divisors of the number.

Space Complexity: O(sqrt(N)) – A number N can have at max 2*sqrt(N) divisors, which are stored in the array.
*/
