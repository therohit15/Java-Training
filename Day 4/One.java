// Q1)
// Write a java program to print the even numbers from the range 1-15 without using the modulus Operator

import java.util.Scanner;
public class One {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i=0; i<=n; i++){
            //(1)
            //if(i==(i/2)*2)
            //(2)
            //if(i==i>>1<<1)
            //(3)
            //if((i-(i/2)*2)==0)
            //(4)
            //if((i&1)==0)
            // (5)
            // int n1 = i;
            // while(n1>=2)
            //     n1=n1-2;
            // if(n1==0)
                System.out.println(i);
        }
        scan.close();
    }
}
