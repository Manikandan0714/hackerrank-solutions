/*
Write a c program to accept an integer from the user and print the number along with its sign.
Input Format
Input will be an integer

Constraints
Nill

Output Format
Display the integer along with its sign

Sample Input 0
20

Sample Output 0
+20

Sample Input 1
-20

Sample Output 1
-20
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        if (a <0)
            System.out.println(a);
        else 
            System.out.println("+"+a);

    }
}
