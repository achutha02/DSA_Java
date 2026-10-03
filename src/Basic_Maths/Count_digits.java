package Basic_Maths;

import java.util.Scanner;
public class Count_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        if (n == 0){
            System.out.println(1);
        }
        else{
            int count = 0;
            while(n>0){
                n = n / 10;
                count++;
            }
            System.out.println(count);
        }
    }
}

/*
Time Complexity:  O(log10(N)) – In every iteration we are dividing N by 10.

Space Complexity: O(1) – Using a couple of variables i.e., constant space.
 */
