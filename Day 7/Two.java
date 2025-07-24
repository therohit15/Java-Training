// Q2)
// A construction company is tasked with designing a safety fence around a playground in such a way that the height of each fence section follows a unique pattern 
// for strength and aesthetic purposes. The engineers decide to use Pascal's Triangle to determine the height of each section of the fence.
// The requirement is to build a triangle-shaped structure of heights, where each height corresponds to a value in Pascal’s Triangle. The number of rows in the 
// triangle must be determined by the user.
// Write a program that takes the number of rows as input and outputs Pascal's Triangle, representing the heights of each fence section.
// Input Format
// An integer n representing the number of rows in Pascal’s Triangle.
// Constraints
// NA
// Output Format
// A triangle-shaped pattern of integers, where each number represents the height of a fence section. Ensure there are no trailing spaces at the end of each line.
// Sample Input 0
// 5
// Sample Output 0
// 1
// 1 1
// 1 2 1
// 1 3 3 1
// 1 4 6 4 1
// Sample Input 1
// 2
// Sample Output 1
// 1
// 1 1


import java.util.*;

public class Two {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        //logic 1
        int ch = 65;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print((char)ch++ +" ");
            }
            System.out.println();
        }
        scan.close();
    }
}