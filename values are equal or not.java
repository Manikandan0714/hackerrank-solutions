/*
Write a C program to check the values are equal or not
Input Format
Accept two integer as input

Constraints
NIL

Output Format
EQUAL/NOT EQUAL

Sample Input 0
10 10

Sample Output 0
EQUAL

Sample Input 1
-109   83839

Sample Output 1
NOT EQUAL
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a==b) System.out.println("EQUAL");
        else System.out.println("NOT EQUAL");
    }
}
