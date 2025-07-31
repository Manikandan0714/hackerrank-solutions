/*
Write a program to check whether the time is valid or not using conditional construct.
Input Format
hh:mm:ss

Constraints
NIL

Output Format
VALID/NOT VALID

Sample Input 0
16:70:45

Sample Output 0
Not Valid

Sample Input 1
11:45:45

Sample Output 1
Valid
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time = sc.nextLine();
       
        String[] parts = time.split(":");
       
        if (parts.length != 3) {
            System.out.println("Not Valid");
            return;
        }

        int hh = Integer.parseInt(parts[0]);
        int mm = Integer.parseInt(parts[1]);
        int ss = Integer.parseInt(parts[2]);

        if (hh >= 0 && hh <= 23 && mm >= 0 && mm <= 59 && ss >= 0 && ss <= 59) {
            System.out.println("Valid");
        } else {
            System.out.println("Not Valid");
        }
    }
}
