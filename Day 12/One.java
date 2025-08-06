import java.util.Scanner;

public class One {
    public static int add (int a, int b){
        return a+b;
    }
    public static int sub (int a, int b){
        return a-b;
    }
    public static int mul (int a, int b){
        return a*b;
    }
    public static int square (int a, int b){
        return (int)Math.pow(a, b);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Sum of two numbers: "+add(a, b));
        System.out.println("Subtract of two numbers: "+sub(a, b));
        System.out.println("Multiplication of two numbers: "+mul(a, b));
        System.out.println("Square of two numbers: "+square(a, b));
        sc.close();
    }
}
