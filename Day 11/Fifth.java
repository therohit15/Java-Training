// Q5)
// Write a program to determine whether a given string is palindrome or not.
// Input Format :
// Input consist of a String
// Output Format :
// Output consist of a String
// Sample Input :
// Live on time emit no evil
// Sample Output :
// Palindrome
// Input (stdin)
// Doctor
// Output (stdout)
// Not a palindrome

import java.util.Scanner;

public class Fifth {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().trim().toLowerCase();
        str = str.replaceAll(" ", "");
        // int i=0, j=str.length()-1;
        // boolean flag = true;
        // while(i<j){
        //     if(str.charAt(i)!=str.charAt(j)) flag = false;
        //     i++;
        //     j--;
        // }
        StringBuilder newstr = new StringBuilder(str);
        boolean flag = newstr.toString().equals(newstr.reverse().toString());
        System.out.println(flag?"Palindrome":"Not a palindrome");
        sc.close();
    }
}