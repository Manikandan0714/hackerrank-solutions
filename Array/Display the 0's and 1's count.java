/*Write a program to count the number of zeros and ones in an array

Input Format
Number of elements followed by array with 0/1 as input elements

Constraints
NIL

Output Format
Display the 0's and 1's count

Sample Input 0
10
0 0 0 0 0 1 1 1 1 1

Sample Output 0
zc = 5
oc = 5

*/
 
import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt(); 
        int zeroCount = 0;
        int oneCount = 0;
        for (int i = 0; i < n; i++) { 
            int element = sc.nextInt(); 
            if (element == 0) {
                zeroCount++; 
            } else if (element == 1) {
                oneCount++; 
            }
        }
        System.out.println("zc = " + zeroCount); 
        System.out.println("oc = " + oneCount);   
    }
}

​
