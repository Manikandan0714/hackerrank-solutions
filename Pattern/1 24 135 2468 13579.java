/*
Write a program to display the following pattern

Input Format
Integer

Constraints
input>0

Output Format
Star Pattern

Sample Input 0
5

Sample Output 0
1
24
135
2468
13579
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(2 * j - 1);
                }
            } else {
                for (int j = 1; j <= i; j++) {
                    System.out.print(2 * j);
                }
            }
            System.out.println();
        }
    }
}
