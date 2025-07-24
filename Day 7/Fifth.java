// Q5)
// A microwave oven manufacturer recommends that when heating two items, add 50% to the heating time, 
// and when heating three items double the heating time. Heating more than three items at once is not 
// recommended. Write a program to find out the recommended heating time.
// Input format:
// The first input containing an integer which denotes the number of items
// The second input containing the floating point number which denotes the single item heating time.
// Output format:
// Print the recommended heating time in floating point with 2 decimal places.
// If the number of items is more than three, print "Number of items is more" 
// Sample Input:
// 2
// 5.0
// Sample Output:
// 7.50
// Input (stdin)
// 3
// 7.0
// Output (stdout)
// 14.00




import java.util.*;

public class Fifth {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        float h = scan.nextFloat();
        scan.nextLine();
        switch (n) {
            case 1:
                System.out.printf("%.2f",n);
                break;
            case 2:
                float per = h/2;
                System.out.printf("%.2f",h+per);
                break;
            case 3:
                
                System.out.printf("%.2f",h*2.0);
                break;
        
            default:
                System.out.println("Number of items is more");
                break;
        }
        scan.close();
    }
}