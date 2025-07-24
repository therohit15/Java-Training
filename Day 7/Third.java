// Q3)
// A high-security safe lock manufacturer is designing a unique keypad pattern that can act as a multi-layered security code for vaults. 
// The keypad will display a symmetrical number pattern for a given size. The pattern starts from the outer layer with the highest number 
// and decreases toward the center, forming a layered effect that represents security levels. The security engineers want a program to 
// generate this pattern based on the size of the keypad.
// Write a program that takes the size n as input and generates this number pattern for the safe lock design.
// Input Format
// An integer n representing the size of the security keypad pattern. Note: n must be an odd integer greater than or equal to 3.
// Constraints
// NA
// Output Format
// A square-shaped number pattern of size n x n, where numbers decrease from the outer layer to the inner layer, forming a symmetric pattern.
// Sample Input 0
// 4
// Sample Output 0
// 4444444
// 4333334
// 4322234
// 4321234
// 4322234
// 4333334
// 4444444
// Sample Input 1
// 2
// Sample Output 1
// 222
// 212
// 222



import java.util.*;

public class Third {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        //logic 1
        int size = n*2-1;
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                int min_value = Math.min(Math.min(i, j),Math.min(size-1-i, size-1-j));
                System.out.print(n-min_value+" ");
            }
            System.out.println();
        }

        
        scan.close();
    }
}
