/*
Write a C program to check whether the given year is leap year or not using conditional construct
Input Format
Accept an integer as an input

Constraints
NIL

Output Format
Leap/Not leap

Sample Input 0
1900

Sample Output 0
Not a Leap year

Sample Input 1
2012

Sample Output 1
Leap year
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
        if(a%400==0 || (a%4==0 && a%100!=0)) System.out.println("Leap year");
        else System.out.println("Not a Leap year");    }
}
