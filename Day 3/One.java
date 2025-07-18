// Q1
// Temperature Check for Outdoor Activities
// You are organizing an outdoor event and need to decide whether it's safe 
// for participants to go outside based on the current temperature. Temperatures 
// below zero degrees Celsius are considered too cold and unsafe, while temperatures 
// above zero are suitable for outdoor activities. Write a program to check if the 
// given temperature is positive or negative.
// Input Format
// A single integer input representing the current temperature in degrees Celsius.
// Output Format
// If the given temperature is positive, print "Safe for outdoor activities."
// If the temperature is negative or zero, print "Too cold for outdoor activities."
// Constraints
// The temperature can be any integer (positive, negative, or zero).
// Example 1
// Sample Input 1
// 15
// Sample Output 1
// Safe for outdoor activities
// Explanation
// The given temperature is 15 degrees Celsius, which is above zero. Hence, the output 
// is "Safe for outdoor activities."
// Example 2
// Sample Input 2
// -5
// Sample Output 2
// Too cold for outdoor activities
// Explanation
// The given temperature is -5 degrees Celsius, which is below zero. Hence, the output 
// is "Too cold for outdoor activities."
// Example 3
// Sample Input 2
// 0
// Sample Output 3
// Too cold for outdoor activities
// Explanation
// The temperature is zero degrees Celsius, which is not suitable for outdoor activities.
// Hence, the output is "Too cold for outdoor activities."

import java.util.*;
public class One{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tem = sc.nextInt();
        if(tem>0) System.out.println("Safe for outdoor activities");
        else System.out.println("Too cold for outdoor activities");
        sc.close();
    }
}