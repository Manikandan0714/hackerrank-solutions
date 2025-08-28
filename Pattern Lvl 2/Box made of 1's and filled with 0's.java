/*
Box made of 1's and filled with 0's
Input Format
Accept an integer as an input

Constraints
NIL

Output Format
MATRIX

Sample Input 0
5
Sample Output 0
11111
10001
10001
10001
11111
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Border condition
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
