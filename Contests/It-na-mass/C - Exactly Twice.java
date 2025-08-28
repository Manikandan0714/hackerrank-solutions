/*
Find the number of characters in a string occurs exactly twice in the string

Input Format
string

Constraints
NULL

Output Format
int - count the characters exactly twice repeated

Sample Input 0
pool
Sample Output 0
1
Explanation 0
pool -> o is exactly twice so count = 1 because only o is twice

Sample Input 1
statesmans
Sample Output 1
2
Explanation 1
statesmans = only t and a are exactly twice so count = 2 .

Sample Input 2
additional
Sample Output 2
3
*/
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        Map<Character, Integer> freq = new HashMap<Character, Integer>();

        // Count frequency of each character
        for (char c : s.toCharArray()) {
            if (freq.containsKey(c)) {
                freq.put(c, freq.get(c) + 1);
            } else {
                freq.put(c, 1);
            }
        }

        // Count how many characters appear exactly twice
        int count = 0;
        for (int value : freq.values()) {
            if (value == 2) {
                count++;
            }
        }

        System.out.println(count);
    }
}


