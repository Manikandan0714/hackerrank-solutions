/*
Write a program to accept the array and count the number of odd and even numbers in the given array
Input Format
Number of elements followed by array as an input

Constraints
NIL

Output Format
Display the number of Odd and Even numbers in the given array

Sample Input 0
10
77 67 55 44 25 14 87 95 45 92

Sample Output 0
Odd = 7
Even = 3

*/
#include <stdio.h>
int main() {
    int n;
    scanf("%d", &n);
    int arr[n];
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }
    int oddCount = 0, evenCount = 0;
    for (int i = 0; i < n; i++) {
        if (arr[i] % 2 == 0) {
            evenCount++;
        } else {
            oddCount++;
        }
    }
    printf("Odd = %d\n", oddCount);
    printf("Even = %d\n", evenCount);
    return 0;
}
