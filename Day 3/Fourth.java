// Q4.
// Car Rental Charges for a Travel Agency
// Imagine you're organizing a trip for a group of tourists, and you've partnered with a local travel agency to provide car rentals 
// for the journey. The travel agency has a pricing policy where they charge differently for the first few hours of travel and then 
// increase the hourly rate after a specified number of hours.
// Your task is to calculate the total cost for a given travel time in minutes. The travel agency charges:
// R1 rupees per hour for the first N hours of travel.
// R2 rupees per hour for any additional time after the first N hours.
// You need to compute the total cost based on the total travel time (in minutes) provided as input.
// Input Format
// The first line contains an integer R1, representing the charge (in rupees) per hour for the first N hours.
// The second line contains an integer N, representing the number of hours for which the first rate R1 applies.
// The third line contains an integer R2, representing the charge (in rupees) per hour for additional hours after the first N hours.
// The fourth line contains an integer X, representing the total travel time in minutes.
// Output Format
// Output the total traveling cost in rupees.
// Example 1
// Sample Input 1
// 20
// 4
// 40
// 300
// Sample Output 1
// 120
// Explanation
// Total travelling hours = 300÷60=5 hours (since we convert 300 minutes to hours).
// Rupees 20/hour for the first 4 hours: 20×4=80 rupees.
// Rupees 40/hour for the remaining 1 hour: 40×1=40 rupees.
// Total cost = 80+40=120rupees.
// Example 2
// Sample Input 2
// 30
// 5
// 35
// 500
// Sample Output 2
// 290
// Explanation
// Total travelling hours = 500÷60=8.33 hours. The ceiling of 8.33 is 9 hours.
// Rupees 30/hour for the first 5 hours: 30×5=150 rupees.
// Rupees 35/hour for the remaining 4 hours: 35×4=140 rupees.
// Total cost = 150+140=290 rupees.

import java.util.*;
import java.lang.Math;
public class Fourth{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        sc.nextLine();
        int n = sc.nextInt();
        sc.nextLine();
        int r2 = sc.nextInt();
        sc.nextLine();
        int x = sc.nextInt();
        int add = (int)Math.ceil(x/60) - n;
        System.out.println((r1 * n)+(r2 * add));
        sc.close();
    }
}