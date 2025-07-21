// Q5)
// Inventory Check for Rare Items
// In a warehouse management system, rare items are considered special if their item ID is a Strong Number. 
// A Strong Number is a number in which the sum of the factorial of each digit is equal to the number itself. 
// Your task is to create a program that checks whether the given item ID is a Strong Number or not.
// Imagine a warehouse manager who needs to quickly identify rare items for cataloging. If an item ID is a Strong Number, 
// it should be flagged as "Rare Item," otherwise, it should be marked as "Common Item."
// Input Format
// The first line of input contains an integer N, which represents the item ID.
// Output Format
// Print "Rare Item"." if the item ID is a Strong Number.
// Print "Common Item" if the item ID is not a Strong Number.
// Example 1
// Sample Input 1
// 145
// Sample Output 1
// Rare Item
// Explanation
// The digits of 145 are 1, 4, and 5.
// The factorial of 1 is 1, the factorial of 4 is 24, and the factorial of 5 is 120.
// The sum of factorials: 1 + 24 + 120 = 145, which is equal to the item ID.
// Hence, the item ID 145 is a Strong Number, so the output is "Rare Item."
// Example 2
// Sample Input 2
// 123
// Sample Output 2
// Common Item
// Explanation
// The digits of 123 are 1, 2, and 3.
// The factorial of 1 is 1, the factorial of 2 is 2, and the factorial of 3 is 6.
// The sum of factorials: 1 + 2 + 6 = 9, which is not equal to the item ID.
// Hence, the item ID 123 is not a Strong Number, so the output is "Common Item".




import java.util.*;
public class Fifth{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int init = n;
        int res = 0;
        while(n>0){
            int n1 = n%10;
            int res1 =1;
            for(int i=n1; i>=2; i--){
                res1=res1*i;
            }
            res=res+res1;
            n=n/10;
        }
        System.out.println(init==res?"Rare Item":"Common Item");
        sc.close();
    }
}