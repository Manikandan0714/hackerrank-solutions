/*
Write a program to find given a specific date ,check whether the date is valid or not. Year will be in range 1900 to 9999
Input Format
dd/mm/yy

Constraints
NIL

Output Format
VALID/INVALID

Sample Input 0
08/16/2000

Sample Output 0

Invalid
Sample Input 1
17/10/1994

Sample Output 
Valid
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        if (!input.matches("\\d{2}/\\d{2}/\\d{4}")) {
            System.out.println("Invalid");
            return;
        }

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false); 

        try {
            Date date = sdf.parse(input);

            String[] parts = input.split("/");
            int year = Integer.parseInt(parts[2]);
            if (year >= 1900 && year <= 9999) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        } catch (ParseException e) {
            System.out.println("Invalid");
        }
    }
}

