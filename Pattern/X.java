/*
Write a program to display the following pattern
Input Format
Integer

Constraints
Input>0

Output Format
Star pattern

Sample Input 0

4
Sample Output 0
*     *
 *   * 
  * *  
   *   
  * *  
 *   * 
*     *

*/
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        
        int size = 2 * n - 1;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j == i || j == size - i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
