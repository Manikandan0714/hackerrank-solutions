/*
Print the following pattern
Input Format
Integer

Constraints
input>0

Output Format
Star pattern

Sample Input 0
5

Sample Output 0
10101
01010
10101
01010
10101

Sample Input 1
6

Sample Output 1
101010
010101
101010
010101
101010
010101
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r,i,j;
        int n= sc.nextInt();
        for (i=1;i<=n;i++){
            for (j= 1; j<=n; j++){
                
                System.out.print((j+i+1)%2);
                }
                System.out.println();
    }
}
}            
