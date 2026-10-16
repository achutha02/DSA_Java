package Basic_Maths;

import java.util.Scanner;
public class Perfect_Number_Optimal {
    public static boolean isPerfect(int n){
        int sum = 0;

        for(int i=1;i<=Math.sqrt(n);i++){
            if(n % i == 0){
                sum += i;

                if(n/i != n && i != n/i){
                    sum += (n/i);
                }
            }
        }
        if(sum == n){
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        boolean prefectNum = isPerfect(n);
        System.out.println(prefectNum);
    }
}

/*
Time Complexity: O(sqrt(N)) – Running a loop from 1 to square root of N.

Space Complexity: O(1) – Using a couple of variables i.e., constant space, regardless of the size of input.
*/
