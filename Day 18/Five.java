// There are 3 labs in the CSE department. The labs are L1, L2, and L3 with a seating capacity
// of x, y, and z respectively. A single lab needs to be allocated to a class of 'n' students.
// The labs need to be utilized to the maximum i.e the number of systems used should not be minimal.
// Which lab needs to be allocated to this class?


// Input format:

// Input consists of 4 integers

// The first input denotes 'x'

// The second input denotes 'y'

// The third input denotes 'z'

// The fourth input denotes 'n'

 

// Output format:

// Print the lab which is suitable for 'n' number of students

// Refer the Sample output for formatting

 

// Sample Input:

// 30

// 40

// 20

// 25

 

// Sample Output:

// L1

 

// Input (stdin)

// 90
// 50
// 60
// 40


// Output (stdout)

// L2

import java.util.*;

public class Five {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l1 = sc.nextInt();
        int l2 = sc.nextInt();
        int l3 = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = {l1,l2,l3};
        int min = Integer.MAX_VALUE;
        for(int i: arr){
            if(i>=n && min>i)min=i;
        }
        String res;
        if(min==l1)res="L1";
        else if(min==l2)res="L2";
        else res="L3";
        System.out.println(res);
        sc.close();
    }
}