/*
Write a C program to determine the sign of the input using conditional constructs.
Input Format
Accept an integer as an input

Constraints
NIL

Output Format
Positive/Negative/Zero

Sample Input 0
100

Sample Output 0
Positive

Sample Input 1
-45

Sample Output 1
Negative

Sample Input 2
0

Sample Output 2
Zero
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
        if(a<0) System.out.println("Negative");
        else if(a>0) System.out.println("Positive");
        else System.out.println("Zero");
    }
}
