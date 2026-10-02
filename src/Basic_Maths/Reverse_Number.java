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
