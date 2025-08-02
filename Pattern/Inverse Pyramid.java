/*
Write a program to display the following pattern.
Input Format
Integer

Constraints
input>0

Output Format
Star pattern

Sample Input 0
4
Sample Output 0
*******
 *****
  ***
   *
*/
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * (n - i) - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
