/*
Write a C program to check the number is either divisible by 3 or divisible by 5 and display the corresponding message
Input Format
Accept an integer as an input

Constraints
NIL

Output Format
Hi/Hello/HiHello

Sample Input 0
1500

Sample Output 0
HiHello

Sample Input 1
93

Sample Output 1
Hi

Sample Input 2
25

Sample Output 2
Hello
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
        if(a%3==0) System.out.print("Hi");
        if (a%5==0) System.out.println("Hello");    }
}
