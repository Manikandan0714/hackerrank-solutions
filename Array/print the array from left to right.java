/*
Write a c program to accept the array from the user and print the array from left to right
Input Format
Number of elements followed by array as input elements

Constraints
NIL

Output Format
Print the array elements

Sample Input 0
10
1 2 3 4 5 6 7 8 9 10

Sample Output 0
1 2 3 4 5 6 7 8 9 10 
*/
import java.util.Scanner;

public class PrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(array[i]);
            if (i < n - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
