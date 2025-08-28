/*
Print the Following Pattern

Input Format
Accept an integer as an input

Constraints
NIL

Output Format
Star Pattern

Sample Input 0
4
Sample Output 0
*
**
***
****
****
***
**
*
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Increasing part
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Decreasing part
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
