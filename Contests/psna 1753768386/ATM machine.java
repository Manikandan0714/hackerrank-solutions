/*
Write a C program to input amount from user and print minimum number of notes (Rs.500,100,50,20,10,5,2,1) required for the given amount in c

Input Format

Integer

Constraints

1 < n < 1000000

Output Format

Integer

Sample Input 0

750
Sample Output 0

Total number of notes:
500 : 1
100 : 2
50 : 1
20 : 0
10 : 0
5 : 0
2 : 0
1 : 0
Sample Input 1

1257
Sample Output 1

Total number of notes:
500 : 2
100 : 2
50 : 1
20 : 0
10 : 0
5 : 1
2 : 1
1 : 0

*/
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Total number of notes:");
        int n500 = a / 500;
        a %= 500;
        int n100 = a / 100;
        a %= 100;
        int n50 = a / 50;
        a %= 50;
        int n20 = a / 20;
        a %= 20;
        int n10 = a / 10;
        a %= 10;
        int n5 = a / 5;
        a %= 5;
        int n2 = a / 2;
        a %= 2;
        int n1 = a; 
        System.out.println("500 : " + n500);
        System.out.println("100 : " + n100);
        System.out.println("50 : " + n50);
        System.out.println("20 : " + n20);
        System.out.println("10 : " + n10);
        System.out.println("5 : " + n5);
        System.out.println("2 : " + n2);
        System.out.println("1 : " + n1);

    }
}
