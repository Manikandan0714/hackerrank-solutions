/*
Little Chris is bored during his physics lessons (too easy), so he has built a toy box to keep himself occupied. The box is special, since it has the ability to change gravity.
There are n columns of toy cubes in the box arranged in a line. The i-th column contains ai cubes. At first, the gravity in the box is pulling the cubes downwards. When Chris switches the gravity, it begins to pull all the cubes to the right side of the box. The figure shows the initial and final configurations of the cubes in the box: the cubes that have changed their position are highlighted with orange.
Input Format
The first line of input contains an integer n (1 ≤ n ≤ 100), the number of the columns in the box. The next line contains n space-separated integer numbers. The i-th number ai (1 ≤ ai ≤ 100) denotes the number of cubes in the i-th column.

Constraints
NULL

Output Format
Output n integer numbers separated by spaces, where the i-th number is the amount of cubes in the i-th column after the gravity switch.

Sample Input 0
4
3 2 1 2
Sample Output 0
1 2 2 3 
Sample Input 1
3
2 3 8
Sample Output 1
2 3 8 
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int [] arr= new int[n];
        for(int i = 0; i<n; i++){
            arr[i]=sc.nextInt();
        }
            Arrays.sort(arr);
        for(int i = 0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}
