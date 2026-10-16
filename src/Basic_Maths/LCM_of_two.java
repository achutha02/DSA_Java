package Basic_Maths;

import java.util.Scanner;
public class LCM_of_two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter number 2: ");
        int n2 = sc.nextInt();
        int max1 = Math.max(n1,n2);
        int i = 1;
        int lcm;
        while(true){
            int mul = max1 * i;
            if(mul % n1 == 0 && mul % n2 == 0){
                lcm = mul;
                break;
            }
            i++;
        }
        System.out.println(lcm);
    }
}

/*
Time Complexity: O(min(N1, N2)) – In the worst-case scenario, when n1 and n2 are coprime, the loop runs for O(n1 * n2 / max(n1, n2)) iterations which is equivalent to O(min(n1, n2)).

Space Complexity: O(1) – Using a couple of variables i.e., constant space.
*/