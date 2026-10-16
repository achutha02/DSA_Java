package Basic_Maths;

import java.util.Scanner;
public class LCM_of_two_optimal {
    public static int gcd(int n1, int n2){
        while(n1 > 0 && n2 > 0){
            if(n1 > n2){
                n1 = n1 % n2;
            }
            else{
                n2 = n2 % n1;
            }
        }
        if(n1 == 0){
            return n2;
        }
        else{
            return n1;
        }
    }

    public static int lcm(int n1, int n2){
        int gcd1 = gcd(n1, n2);

        int lcm = (n1 * n2) / gcd1;

        return lcm;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter number 2: ");
        int n2 = sc.nextInt();

        System.out.println(lcm(n1, n2));
    }
}


/*
Time Complexity: O(log(min(N1, N2))) – Finding GCD of two numbers, along with some constant time operations

Space Complexity: O(1) – Using a couple of variables i.e., constant space.
*/
