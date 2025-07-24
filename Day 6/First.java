// Q1)Print the pattern 2,15,41,80,132 till n

import java.util.*;
public class First{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int series = 2;
        for(int i=0; i<n; i++){
            series = series + (13*i);
            System.out.print(series+" ");
        }
        scan.close();
    }
}