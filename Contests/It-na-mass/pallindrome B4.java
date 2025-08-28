/*
Find whether number is palindrome or not. The original number and the reverse of it are equal for a palindrome
Input Format
INT
Constraints
NULL
Output Format
Palindrome / Not a Palindrome

Sample Input 0
1234
Sample Output 0
Not a Palindrome
Explanation 0
1234 != 4321 , so Not a Palindrome

Sample Input 1
1331
Sample Output 1
Palindrome
Explanation 1
1331 == 1331 ,
reverse , so Palindrome
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
        int t;int r=0;int c=n;
        while(n>0){
            t= n%10;
            r = r*10+t;
            n= n/10;                                            //t=1   r=1  n=133    t=3     r=13  n=13

        }
        if(c==r){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
}
