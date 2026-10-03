package Basic_Maths;

import java.util.Scanner;
public class Reverse_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int reverseNum = 0;
        while(n > 0){
            int digit = n % 10;
            reverseNum = (reverseNum * 10) + digit;
            n = n / 10;
        }
        System.out.println(reverseNum);
    }
}

/*
Time Complexity: O(log10(N)) – In every iteration, N is divided by 10 (equivalent to the number of digits in N.)

Space Complexity: O(1) – Using a couple of variables i.e., constant space.
 */
