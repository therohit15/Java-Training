// 3)Q3. Write a Java program to get 2 numbers from the user and 
// calculate their sum and difference using '+' and '-' operators 
// respectively. Print the corresponding sum and difference of the 
// numbers as output in the console.
// Input format:
// First input: an integer
// Second input: an integer
// Output format:
// First output will be the sum of two integers
// Second output will be the difference of two integers
// Sample Input:
// 55
// 34
// Sample Output:
// 89
// 21
// Input (stdin)
// 20
// 10
// Output (stdout)
// 30
// 10

import java.util.*;
public class Three{
    public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.nextLine();
	    int b = sc.nextInt();
        System.out.printf("%d %d",a+b,a-b);
        sc.close();
    }
}