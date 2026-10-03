package Basic_Maths;

import java.util.Scanner;
public class GCD_of_two_Better {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int n = sc.nextInt();
        System.out.print("Enter number 2: ");
        int m = sc.nextInt();

        int gcd = 1;
        for(int i=Math.min(n,m);i>=1;i--){
            if(n%i == 0 && m%i == 0){
                gcd = i;
                break;
            }
        }
        System.out.println(gcd);
    }
}

/*
Time Complexity: O(min(N1, N2)) – where N1 and N2 are given numbers. In the worst case, finding GCD will require iterating from min(N1, N2) till 1 and performing constant time operations in each iteration.

Space Complexity: O(1) – Using a couple of variables i.e., constant space.
*/
