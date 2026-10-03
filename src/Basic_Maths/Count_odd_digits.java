package Basic_Maths;

import java.util.Scanner;
public class Count_odd_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int cnt = 0;
        while (n>0){
            int digit = n % 10;
            if(digit % 2 !=0){
                cnt++;
            }
            n = n/10;
        }
        System.out.println(cnt);
    }
}

/*
Time Complexity: O(log10(N)) – In every iteration we are dividing N by 10 (equivalent to the number of digits in N).

Space Complexity: O(1) – Using only couple of variables i.e., constant space.
 */
