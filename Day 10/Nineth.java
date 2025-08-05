import java.util.Scanner;

public class Nineth {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int mangono = sc.nextInt();
        if((1<=mangono && mangono<=row)||(mangono%row==1)||(((row*col)-row)<=mangono&&mangono<=(row*col))){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}