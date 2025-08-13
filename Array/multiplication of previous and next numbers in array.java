/*
Write a program in C to update every array element with multiplication of previous and next numbers in array.
Input Format
Number of elements followed by array as an input

Constraints
NIL

Output Format
Display the array elements after modification

Sample Input 0
6
1 2 3 4 5 6

Sample Output 0
2 3 8 15 24 30 
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
        if (n <= 1) {
            if (n == 1) {
                System.out.println(arr[0]);
            }
            sc.close();
            return;
        }
        int[] modifiedArr = new int[n];
        modifiedArr[0] = arr[0] * arr[1];
        for (int i = 1; i < n - 1; i++) {
            modifiedArr[i] = arr[i - 1] * arr[i + 1];
        }
        modifiedArr[n - 1] = arr[n - 2] * arr[n - 1];
        for (int i = 0; i < n; i++) {
            System.out.print(modifiedArr[i] + " ");
        }
        System.out.println();
    }
}
