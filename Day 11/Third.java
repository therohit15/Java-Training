// 3)
// Write a program to compute the frequency of each lowercase letter in the string.
// Input Format:
// Input consists of a string. Assume that all characters in the string are lowercase 
// letters and the maximum length of the string is 200.
// Output Format:
// The letters are displayed sorted in ascending order.
// Sample Input:
// anitha
// Sample Output:
// a 2

// h 1

// i 1

// n 1

// t 1
// Input (stdin)
// google
// Output (stdout)
// e1
// g2
// l1
// o2

import java.util.Scanner;

public class Third {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[][] count = new int [26][2];
        int a = 97;
        for(int i=0; i<count.length; i++){
            count[i][0]=a++;
            count[i][1]=0;
        }
        for(char ch: str.toCharArray()){
            for(int i=0;i<count.length;i++){
                if(count[i][0]==(int)ch){
                    count[i][1]+=1;
                    break;
                }
            }
        }
        for (int i = 0; i < count.length; i++) {
            if(count[i][1]>0){
                System.out.println((char)count[i][0]+" "+count[i][1]);
            }
        }
        sc.close();
    }
}