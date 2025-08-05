import java.util.Scanner;

public class Tenth {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < row*col; i++) {
                sum+=sc.nextInt();
        }
        System.out.println(sum);
        
    }
}