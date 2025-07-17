// 1)
//Write a program to get a character as input and print its Unicode
//  value. When a character is entered, the character itself is not 
//  stored. Instead, a numeric value(Unicode value) is stored.
// Sample Input :
// g
// Sample Output:
// 103
// Input (stdin)
// G
// Output (stdout)
// 71

import java.util.*;
public class One{
    public static void main(String[] args){
        char a = new Scanner(System.in).nextLine().charAt(0);
        System.out.println((int)a);
    }
}