/*
Write a program to accept the elements into an array and display the array from right to left
Input Format
Number of elements followed by array as an input

Constraints
NIL

Output Format
Print the array elements after modification

Sample Input 0
10
1 2 3 4 5 6 7 8 9 10

Sample Output 0
10 9 8 7 6 5 4 3 2 1 
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        scanner.close();
    }
}
