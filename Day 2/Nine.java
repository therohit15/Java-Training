// Q9. Each Sunday, a newspaper agency sells x copies of a certain newspaper for Rs.a per copy.
// The cost to the agency of each newspaper is Rs.b. The agency pays a fixed cost for storage,
// delivery and so on of Rs.100 per Sunday. The newspaper agency wants to calculate the profit
// obtained on Sundays. Can you please help them out by writing a program to compute the 
// profit given x, a and b.
// Input Format:
// Input consists of 3 integers --- x, a and b.
// X is the number of copies sold, a is the cost per copy and b is the cost the agency spends 
// per copy.
// Output Format:
// Refer Sample Input and Output for exact formatting specifications.
// Sample Input:
// 1000
// 2
// 1
// Sample Output:
// The profit obtained is Rs.900
// Input (stdin)
// 300
// 2
// 1
// Output (stdout)
// The profit obtained is Rs.200


import java.util.*;
public class Nine
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.nextLine();
        int b = sc.nextInt();
        sc.nextLine();
        int c = sc.nextInt();
        int sell = a*b;
        int spend = a*c;
        int profit= (sell-spend)-100;
        System.out.printf("The profit obtained is %d",profit);
        sc.close();
    }
}