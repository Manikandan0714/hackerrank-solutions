/*
Write a program to accept the elements into an array and replace every element in the array with the sum of left side element
Input Format
Number of elements followed by array as an input

Constraints
NIL

Output Format
Print array elements after modification

Sample Input 0
10
1 2 3 4 5 6 7 8 9 10

Sample Output 0
0 1 3 6 10 15 21 28 36 45
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
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int currentSum = 0;
        for (int i = 0; i < n; i++) {
            int temp = arr[i];
            arr[i] = currentSum;
            currentSum += temp;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        sc.close();
    }
}
