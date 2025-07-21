// Q7
// Teaching Digit Positions
// In a mathematics class, a number system is being taught to students. 
// Before teaching them 10's and 100's place, they will be taught the number 
// positions. The positions will be starting from sequence number 1, and the direction will be from left to right.
// So if I want to find the second position of a digit in the number 90876, 
// it will be 0. If the Kth digit exceeds the number position return -1.
// Write a program to find the Kth digit in a given number.
// Input Format
// The first line of input contains an integer N
// The second line of input contains an integer K
// Output Format
// The output prints an integer denoting the Kth digit in a given number
// Example 1
// Sample Input 1
// 956781
// 3
// Sample Output 1
// 6
// Explanation
// The input by the user is 956781, where 9 is the first digit, 5 is the 
// second digit, 6 is the third digit and so on. The user is asking for the 
// third (3rd) digit in the given number, which is 6.
// Example 2
// Sample Input 2
// 12345
// 6
// Sample Output 2
// -1
// Explanation
// The given number is 12345. The number has only 5 digits. Since the user 
// is asking for the sixth digit, which does not exist, the output is -1.




import java.util.*;
public class Seventh{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String len = Integer.toString(a);
        //int res = -1;
        //if(len.length()<b) System.out.println(-1);
        //else{
            // while (b>0) {
            //     res=b%10;
            //     b=b/10;
            //     b--;
            // }
            // System.out.println(res);
            System.out.println(len.charAt(b));
        //}
        sc.close();
    }
}