// Q4)
// print multiplication of n till 10 and multiplication of n from 2-10(even numbers)




import java.util.Scanner;

public class Fourth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<n; i++){
            System.out.println(n+"x"+i+"="+(n*i));
        }
        sc.close();
    }
}