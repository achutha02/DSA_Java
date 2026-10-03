package Basic_Maths;

import java.util.Scanner;
public class Prime_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int count = 0;
        for(int i=1;i<=n;i++){
            if(n % i == 0){
                count++;
            }
        }
        if(count > 2){
            System.out.println("The number is not prime");
        }
        else{
            System.out.println("The number is prime");
        }
    }
}

/*
Time Complexity: O(N) – Looping N times to find the count of all divisors of N.

Space Complexity: O(1) – Using a couple of variables i.e., constant space.
 */
