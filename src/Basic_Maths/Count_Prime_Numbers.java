package Basic_Maths;

import java.util.Scanner;
public class Count_Prime_Numbers {
    public static boolean isPrime(int n){
        int count = 0;
        for(int i=1;i<=n;i++){
            if(n % i == 0){
                count++;
            }
        }
        if(count == 2){
            return true;
        }
        else{
            return false;
        }
    }
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.print("Enter a number: ");
       int n = sc.nextInt();
       int count1 = 0;
       for(int i = 1; i<=n;i++){
           if(isPrime(i)){
               count1++;
           }
       }
       System.out.println(count1);
    }
}

/*
Time Complexity:  O(N2) – Checking all numbers from 1 to n for prime and checking if a number is prime or not will take O(n) TC.

Space Complexity: O(1) – Using a couple of variables i.e., constant space.
*/
