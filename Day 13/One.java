// Q1
// You are playing the PUBG game and you entered into the Bootcamp. There you viewed the drop box which was filled with guns. 
// you have to choose the biggest gun in the drop box. Find the biggest gun and you will get the chicken dinner.


// Input Format:

// Input consists of n+1 integers.

// The first integer corresponds to ‘n’ , the size of the array.

// The next ‘n’ integers correspond to the elements in the array. Assume that the maximum value of n is 15.

 

// Output Format:

// Refer sample output for details.

 

// Sample Input 1:

// 5

// 2

// 3

// 6

// 8

// 1

 

// Sample Output 1:

// 8 is the maximum element in the array

 

// Input (stdin)

// 4
// 3
// 5
// 9
// 2


// Output (stdout)

// 9 is the maximum element in the array




import java.util.*;

public class One {
    static int max(List<Integer> list){
        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if(max<list.get(i)) max=list.get(i);
        }
        return max;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i=0; i<n; i++){
            list.add(scan.nextInt());
        }
        int max = max(list);
        System.out.println(max+" is the maximum element in the array.");
        scan.close();
    }
}