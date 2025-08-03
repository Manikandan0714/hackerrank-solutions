/*
Box filled with 1's and 0's forming a plus sign
Input Format
Accept an integer as an input

Constraints
NIL

Output Format
MATRIX

Sample Input 0
5

Sample Output 0
11011
11011
00000
11011
11011

Sample Input 1
8

Sample Output 1
11100111
11100111
11100111
00000000
00000000
11100111
11100111
11100111
*/

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int centerStart = n / 2;
        int centerEnd = (n % 2 == 0) ? centerStart - 1 : centerStart;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i >= centerEnd && i <= centerStart) || (j >= centerEnd && j <= centerStart)) {
                    System.out.print("0");
                } else {
                    System.out.print("1");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
