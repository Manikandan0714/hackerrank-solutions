/*
Alternate rows of 1's and 0's
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
00000
11111
00000
11111
*/
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  
        for (int i = 0; i < n; i++) {
            int value = (i % 2 == 0) ? 1 : 0;  
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println(); 
        }
    }
}
