package Basic_Maths;

import java.util.Scanner;
public class Armstrong_Number1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int count = (int)(Math.log10(n)+1);
        int copy = n;
        int sum = 0;
        while (n > 0){
            int digit = n % 10;
            sum = sum + (int)Math.pow(digit,count);
            n = n / 10;
        }
        if(sum == copy){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not Armstrong");
        }
    }
}

/*
Time Complexity: O(log10(N)) – N is being divided by 10 until it becomes zero resulting in log10(N) iterations and in each iteration constant time operations are performed.

Space Complexity: O(1) – Using a couple of variables i.e., constant space, regardless of the size of the input.
 */
