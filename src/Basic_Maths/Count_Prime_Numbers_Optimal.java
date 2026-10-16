package Basic_Maths;


import java.util.Scanner;
public class Count_Prime_Numbers_Optimal {
    public static boolean isPrime(int n){
        int count = 0;

        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i == 0){
                count++;

                if(n/i != i){
                    count++;
                }
            }
        }
        if(count == 2){
            return true;
        }
        else {
            return false;
        }
    }

    public static int primeUptoN(int n){
        int count1 = 0;
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                count1++;
            }
        }
        return count1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        int numberOfPrimes = primeUptoN(a);
        System.out.println(numberOfPrimes);
    }
}


/*
Time Complexity: O(N3/2) – Checking all numbers from 1 to N for prime and checking if a number is prime or not will take O(N1/2) TC.

Space Complexity: O(1) – Using a couple of variables i.e., constant space
*/
