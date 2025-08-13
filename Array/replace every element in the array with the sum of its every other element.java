/*
Write a program to accept the element into an array and replace every element in the array with the sum of its every other element
Input Format
Number of elements followed by array as input elements

Constraints
NIL

Output Format
Print the Array elements after modification

Sample Input 0
10
10 20 30 40 50 60 70 80 90 100

Sample Output 0
540 530 520 510 500 490 480 470 460 450
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        long totalSum = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            totalSum += arr[i];
        }

        for (int i = 0; i < n; i++) {
            System.out.print((totalSum - arr[i]) + " ");
        }
        System.out.println();
        sc.close();
    }
}
