/*
Print the following pattern
Input Format
Integer

Constraints
Input>0

Output Format
Star pattern

Sample Input 0
4

Sample Output 0
*
**
***
****
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  r;
        int n = sc.nextInt();
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
