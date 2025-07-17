// Q7. The college ground is rectangular in shape. Management decides to build 
// a fence around the ground. In order to help the construction workers to 
// build a straight fence, they planned to place a thick rope around the ground. 
// They wanted to buy only the exact length of the rope that is needed. They 
// also wanted to cover the entire ground with a thick carpet during the rainy season.
// They wanted to buy only the exact quantity of carpet that is needed. They 
// requested your help. Can you please help them by writing a program to find 
// the exact length of the rope and the exact quantity of carper that is required?
// Input Format:
// Input consists of 2 integers.
// The first integer corresponds to the length of the ground
// The second integer corresponds to the breadth of the ground.
// Output Format:
// Output consists of 2 integers.
// The first integer corresponds to the exact length of the rope
// The second integer corresponds to the exact quantity of carper.
// Sample Input:
// 50
// 20
// Sample Output:
// 140m
// 1000sqm
// Input (stdin)
// 80
// 20
// Output (stdout)
// 200m
// 1600sqm


import java.util.*;
public class Seven
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.nextLine();
        int b = sc.nextInt();
        int area = a*b;
        int peri = 2*(a+b);
        System.out.println(area+" m");
        System.out.println(peri+" sqm");
        sc.close();
    }
}