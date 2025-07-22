// pattern described above.
// You are given a number 'n' which represents the number of days (or terms in the series). You need to generate the growth rate for the virus 
// for the first 'n' days. The growth rate starts with a value of 2 on the first day, and the increase on each subsequent day is based on the 
// multiples of 13 as described.
// Input Format
// The input consists of a single integer 'n', which denotes the number of terms (or days) to be printed in the series.
// Constraints
// 'n' is a positive integer (NA for any additional constraints).
// Output Format
// Print the series of virus growth rates for 'n' days, separated by spaces.
// Example 1
// Sample Input 1
// 5
// Sample Output 1
// 2 15 41 80 132
// Explanation
// For n = 5, the series starts at 2 and increases in the following pattern:
// 1st term: 2 (Start)
// 2nd term: 2 + 13 = 15
// 3rd term: 15 + (2 * 13) = 41
// 4th term: 41 + (3 * 13) = 80
// 5th term: 80 + (4 * 13) = 132
// Thus, the output is 2 ,15 ,41, 80 ,132.
// Example 2
// Sample Input 2
// 6
// Sample Output 2
// 2 15 41 80 132 197
// Explanation
// For n = 6, the calculation continues:
// 6th term: 132 + (5 * 13) = 197
// Thus, the output is 2 ,15 ,41, 80 ,132 ,197.



import java.util.*;

public class Eight {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int series = 2;
        for(int i=0; i<n; i++){
            series = series + i * 13;
            System.out.printf("%d ",series);
        }
        sc.close();
    }
}
