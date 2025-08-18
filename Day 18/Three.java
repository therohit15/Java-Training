// A fruit seller buys a dozen of banana at Rs.X. He sells 1 banana at Rs.Y.

// Write a program to determine the profit or loss in Rs. for the fruitseller.


// Input format:

// Input consists of 2 floating point numbers

// The first input corresponds to the total cost(X)

// The second input corresponds to the sold cost(Y)

 

// Output format:

// Print "Profit or Loss" with Rupees.

 

// Sample Input:

// 60

// 4

 

// Sample Output:

// Loss : Rs.12.00

// Input (stdin)

// 100.0
// 3


// Output (stdout)

// Loss : Rs.64.00

import java.util.*;

public class Three {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float buy = sc.nextFloat();
        float sellone = sc.nextFloat();
        float sell = sellone*12.00f;
        float porl;
        if(sell>buy) {
            porl = sell - buy;
            System.out.printf("Profit : %.02f",porl);
        }
        else {
            porl = buy - sell;
            System.out.printf("Loss : %.02f",porl);
        }
        sc.close();
    }
}