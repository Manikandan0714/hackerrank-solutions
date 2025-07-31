/*
Write a c program to accept a character from the user and print the character
Input Format
Input will be a character

Constraints
Nill

Output Format
Display the accepted character

Sample Input 0
a

Sample Output 0
a
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.nextLine().charAt(0);
        System.out.println(a);
    }
}
