import java.util.Scanner;

public class Seventh {
    public static int factorial(int n){
        if(n<0) return -1;
        else if (n==0) return 0;
        else{
            int fact = 1;
            for(int i=1; i<=n; i++){
                fact*=i;
            }
            return fact;
        }
    }
    public static int factrec(int n){
        if (n<0) return -1;
        else if (n==0) return 0;
        if (n==1) return 1;
        return n*factrec(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(factrec(input));
        sc.close();
    }
}
