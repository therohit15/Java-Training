// Q6)
// Calculating Plant Growth Stages
// A biologist is studying the growth patterns of a rare plant species, which follows a unique pattern 
// similar to the Fibonacci sequence. The plant's growth stages, in terms of the number of branches, 
// can be predicted using this sequence: 0, 1, 1, 2, 3, 5, 8, 13, and so on. Given the number of months, 
// the biologist wants to know how many branches the plant will have.
// Your task is to write a program that, given the number of months N, computes the number of branches 
// the plant will have using the Fibonacci sequence. The biologist needs this information to understand 
// the plant's future growth and to plan the necessary resources.
// Input Format
// An integer N representing the number of months.
// Output Format
// Print the number of branches as an integer.
// Example 1
// Sample Input 1
// 6
// Sample Output 1
// 0 1 1 2 3 5 8
// Explanation
// The Fibonacci sequence is 0, 1, 1, 2, 3, 5, 8...
// The 6th term in the Fibonacci sequence is 8, so after 6 months, the plant will have 8 branches.
// Example 2
// Sample Input 2
// 9
// Sample Output 2
// 0 1 1 2 3 5 8 13 21 34
// Explanation
// The Fibonacci sequence is 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...
// The 9th term in the Fibonacci sequence is 34, so after 9 months, the plant will have 34 branches




import java.util.*;
public class Sixth{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.print(a+" ");
        while(n>0){
            int temp = b;
            b = b + a;
            a = temp;
            System.out.print(a+" ");
            n--;
        }
        sc.close();
    }
}