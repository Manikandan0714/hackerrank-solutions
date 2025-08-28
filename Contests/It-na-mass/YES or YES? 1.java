/*
There is a string s of length 3, consisting of uppercase and lowercase English letters. Check if it is equal to "YES" (without quotes), where each letter can be in any case. For example, "yES", "Yes", "yes" are all allowable.
Input Format
The first line of the input contains an integer t (1≤t≤10^3) — the number of testcases. The description of each test consists of one line containing one string s consisting of three characters. Each character of s is either an uppercase or lowercase English letter.

Constraints
NULL

Output Format
For each test case, output "YES" (without quotes) if s satisfies the condition, and "NO" (without quotes) otherwise.You can output "YES" and "NO" in any case (for example, strings "yES", "yes" and "Yes" will be recognized as a positive response).

Sample Input 0
10
YES
yES
yes
Yes
YeS
Noo
orZ
yEz
Yas
XES
Sample Output 0
YES
YES
YES
YES
YES
NO
NO
NO
NO
NO
Explanation 0

NOTE :
The first five test cases contain the strings "YES", "yES", "yes", "Yes", "YeS". All of these are equal to "YES", where each character is either uppercase or lowercase.
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();  // number of test cases
        while (t-- > 0) {
            String s = sc.next();  // read the string
            if (s.equalsIgnoreCase("YES")) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        sc.close();
    }
}
