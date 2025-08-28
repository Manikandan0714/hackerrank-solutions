/*
Box pattern made of center as 0 and remaining filled in 1's
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
11111
11011
11111
11111
Sample Input 1
6
Sample Output 1
111111
111111
110011
110011
111111
111111

*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (n % 2 == 1) {
                    int mid = n / 2;
                    if (i == mid && j == mid) {
                        System.out.print("0");
                    } else {
                        System.out.print("1");
                    }
                } else {
                    int mid1 = n / 2 - 1;
                    int mid2 = n / 2;
                    if ((i == mid1 || i == mid2) && (j == mid1 || j == mid2)) {
                        System.out.print("0");
                    } else {
                        System.out.print("1");
                    }
                }
            }
            System.out.println();
        }
    }
}
