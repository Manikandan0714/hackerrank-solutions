/*
Write a C program to check the number is divisible by 3 or not using conditional construct.
Input Format
Accept an integer as an input

Constraints
NIL

Output Format
DIVISIBLE/NOT DIVISIBLE

Sample Input 0
363

Sample Output 0
The number is divisible by 3

Sample Input 1
31

Sample Output 1
The number is not divisible by 3 and gives a remainder 1
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
        if(a%3==0) System.out.println("The number is divisible by 3");
        else System.out.println("The number is not divisible by 3 and gives a remainder "+a%3);    }
}
