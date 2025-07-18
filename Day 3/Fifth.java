// Q5.
// Write a java program to print the given number is even or odd without using % Operator

import java.util.*;
public class Fifth{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //First way
        System.out.println((n==(n/2)*2)?"Even":"Odd");
        //Second Way
        System.out.println(((n&1)==1?"Odd":"Even"));
        //Third way
        System.out.println((n-(n/2)*2)==0?"Even":"Odd");
        //Fourth way
        System.out.println((n==n>>1<<1)?"Even":"Odd");
        //Fifth way
        while(n>=2){
            n=n-2;
        }
        System.out.println(n==0?"Even":"Odd");
        sc.close();
    }
}