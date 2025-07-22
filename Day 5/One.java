// Q1)Write a java program to find count of the digits(5 logics).
// for 
// while
// do while
// String
// if
// recursion



import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Long n = Math.abs(sc.nextLong());
        Long n = sc.nextLong();
        int count = 0;
        if(n!=0){
            n = n<0?n*(-1):n;
            while(n>0){
                    n/=10;
                    count++;
            }
        }else{
            count=1;
        }
        System.out.println(count);
        sc.close();
    }
}
 