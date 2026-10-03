package Basic_Maths;

import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int factorial = 1;
        if(n == 0){
            System.out.println(1);
        }
        else {
            for(int i=1;i<=n;i++){
                factorial = factorial * i;
            }
            System.out.println(factorial);
        }
    }
}

/*
Time Complexity: O(N) – Iterating once from 1 to N.

Space Complexity: O(1) – Using a couple of variables i.e., constant space.
 */
