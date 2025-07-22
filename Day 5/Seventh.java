// Q7)
// Cricket Run Rate Tracker
// During a high-stakes cricket match, the team's management is closely monitoring the run rate, which is a key factor in determining 
// the team's performance. Initially, the run rate starts at 95.0 runs per over. For each subsequent over, the run rate increases by 
// a fixed amount. The team manager needs to track how the run rate progresses over several overs based on the rate of increase.
// Your task is to help the team management by generating and printing the run rate series for a given number of overs. The initial 
// run rate is 95.0, and for each over, the run rate increases by a fixed value of 20.5.
// Write a program that generates the run rate series starting from 95.0 and increases by 20.5 for each subsequent over. 
// The program should generate the series for n overs, where n is the number of terms (overs) in the series.
// Input Format
// The input consists of a single integer n which denotes the number of overs to be considered (number of terms in the series).
// Constraints
// n will be a positive integer.
// Output Format
// The output should be the series of run rates for the first n overs, printed as space-separated floating-point numbers with one decimal place.
// Example 1
// Sample Input 1
// 5
// Sample Output 1
// 95.0 115.5 136.0 156.5 177.0
// Explanation
// Over 1: 95.0
// Over 2: 95.0 + 20.5 = 115.5
// Over 3: 115.5 + 20.5 = 136.0
// Over 4: 136.0 + 20.5 = 156.5
// Over 5: 156.5 + 20.5 = 177.0
// Output: [95.0, 115.5, 136.0, 156.5, 177.0]
// Example 2
// Sample Input 2
// 3
// Sample Output 2
// 95.0 115.5 136.0
// Explanation
// Over 1: 95.0
// Over 2: 95.0 + 20.5 = 115.5
// Over 3: 115.5 + 20.5 = 136.0
// Output: [95.0, 115.5, 136.0]



import java.util.*;

public class Seventh {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double series = 95.0;
        for(int i=1; i<=n; i++){
            System.out.printf("%.1f ",series);
            series = series + 20.5;
        }
        sc.close();
    }
}
