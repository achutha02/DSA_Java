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
