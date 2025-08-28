/*
Given a number, check whether it is an abundant or deficient or perfect number N number 6 , find the factors and add it eg 6 = 1 , 2 , 3

the given number and sum , if both are same = Perfect Number

the given number lesser than sum = Abundant Number

the given number greater than sum = Deficient Number

Input Format

Integer

Constraints

1 < n < 100000

Output Format

Abundant/Decient/Perfect Number

Sample Input 0

6
Sample Output 0

Perfect Number
Explanation 0

6 = sum of the factor 1 + 2 + 3 = 6

Sample Input 1

7
Sample Output 1

Deficient Number

*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = 0;
        for (int i = 1; i < n; i++) { 
            if (n % i == 0) { 
                s += i;
            }
        }
        if (s == n) {
            System.out.println("Perfect Number"); 
        } else if (s > n) {
            System.out.println("Abundant Number");
        } else { 
            System.out.println("Deficient Number"); 
        }
    }
}
