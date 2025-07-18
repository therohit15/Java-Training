// Q3
// Joey's Quest for the Trendy Meatball Sandwich
// Joey Tribbiani, a huge fan of sandwiches, spots an irresistible offer at his favorite sandwich shop. 
// The shop promises free sandwiches for life to anyone who can identify whether a given number is a "Trendy Number." 
// Joey, excited at the prospect, wants to check various numbers to see if they qualify. A "Trendy Number" is defined 
// as a 3-digit number where the middle digit is divisible by 3. Can you help Joey write a program that determines 
// whether a given number is a "Trendy Number"?
// Write a program that takes an integer n as input and checks the following:
// If the number is not a 3-digit number, it should print "Invalid Number".
// If the number is a 3-digit number and its middle digit is divisible by 3, it should print "Trendy Number".
// If the number is a 3-digit number but its middle digit is not divisible by 3, it should print "Not a Trendy Number".
// Input Format
// A single integer, n, representing the given number.
// Output Format
// Print "Trendy Number" if the input satisfies the trendy number conditions.
// Print "Not a Trendy Number" if it’s a 3-digit number but doesn’t satisfy the middle-digit divisibility rule.
// Print "Invalid Number" if the input number is not a 3-digit number.
// Example 1
// Sample Input 1
// 791
// Sample Output 1
// Trendy Number
// Explanation
// The input number 791 is a 3-digit number, and its middle digit 9 is divisible by 3, making it a "Trendy Number."
// Example 2
// Sample Input 2
// 275
// Sample Output 2
// Not a Trendy Number
// Explanation
// The input number 275 is a 3-digit number, but its middle digit 7 is not divisible by 3, so it’s "Not a Trendy Number".
// Example 3
// Sample Input 3
// 45
// Sample Output 3
// Invalid Number
// Explanation
// The input number 45 is not a 3-digit number, so the output is "Invalid Number".

import java.util.*;
public class Third{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tem = sc.nextInt();
        if(tem<100 && tem>999) System.out.println("Invalid number");
        else{
            if(((tem%100)/10)%3==0) System.out.println("Trendy number");
            else System.out.println("Not a trendy number");
        }
        sc.close();
    }
}