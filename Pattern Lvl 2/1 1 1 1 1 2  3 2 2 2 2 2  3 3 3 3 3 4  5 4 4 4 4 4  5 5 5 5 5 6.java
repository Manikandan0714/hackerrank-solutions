/*
Print the following pattern
Input Format
Accept an integer as an input

Constraints
NIL

Output Format
Number Format

Sample Input 0
5
Sample Output 0
1 1 1 1 1 2 
3 2 2 2 2 2 
3 3 3 3 3 4 
5 4 4 4 4 4 
5 5 5 5 5 6
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int odd = 1; // current odd number

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) { 
                // Odd row
                for (int j = 1; j <= n; j++) {
                    System.out.print(odd + " ");
                }
                System.out.print((odd + 1) + " ");
                odd += 2;
            } else {
                // Even row
                System.out.print(odd + " ");
                for (int j = 1; j <= n; j++) {
                    System.out.print((odd - 1) + " ");
                }
            }
            System.out.println();
        }
    }
}


