/*
Write a program to display the following pattern
Input Format
Integer

Constraints
input>0

Output Format
Star pattern

Sample Input 0
4

Sample Output 0
   *
  ***
 *****
*******
*/
import java.util.Scanner;
public class StarPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows= sc.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println(); 
        }
    }
}
