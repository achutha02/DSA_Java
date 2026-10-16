package Basic_Maths;

import java.util.Scanner;
public class GCD_of_two_Optimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int n = sc.nextInt();
        System.out.print("Enter number 2: ");
        int m = sc.nextInt();
        while(n > 0 && m > 0){
            if(n > m){
                n = n % m;
            }
            else{
                m = m % n;
            }
        }
        if(n == 0){
            System.out.println(m);
        }
        else {
            System.out.println(n);
        }
    }
}

/*
Time Complexity: O(log(min(N1, N2))) – where N1 and N2 are given numbers. Because in every iteration, the algorithm is dividing larger number with the smaller number resulting in time complexity.(approx.)

Space Complexity: O(1) – Using a couple of variables i.e., constant space.
*/
