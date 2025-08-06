import java.util.Scanner;

public class Main {
    
    public static void cal(int a, int b, char op){
        try{
            switch (op) {
                case '+':
                    System.out.println("Sum: "+(int)(a+b));
                    break;
                case '-':
                    System.out.println("Subtraction: "+(int)(a-b));
                    break;
                case '*':
                    System.out.println("Multiplication: "+(int)(a*b));
                    break;
                case '/':
                    int a1 = (int)a;
                    int b1 = (int)b;
                    System.out.println("Division: "+(a1/b1));
                    break;
                case '%':
                    System.out.println("Remainder: "+(int)(a%b));
                    break;
                case '^':
                    System.out.print("Power: "+(int)Math.pow(a, b));
                    break;
                default:
                    System.out.println("Invalid Operation");
                    break;
            }
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide by zero!");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    public static void cal(float a, float b, char op){
        try{
            switch (op) {
                case '+':
                    System.out.println("Sum: "+(float)(a+b));
                    break;
                case '-':
                    System.out.println("Subtraction: "+(float)(a-b));
                    break;
                case '*':
                    System.out.println("Multiplication: "+(float)(a*b));
                    break;
                case '/':
                    int a1 = (int)a;
                    int b1 = (int)b;
                    System.out.println("Division: "+(a1/b1));
                    break;
                case '%':
                    System.out.println("Remainder: "+(float)(a%b));
                    break;
                case '^':
                    System.out.print("Power: "+(float)Math.pow(a, b));
                    break;
                default:
                    System.out.println("Invalid Operation");
                    break;
            }
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide by zero!");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    public static void cal(boolean a, boolean b, char op){
        try{
            switch (op) {
                case '+':
                    System.out.println("OR: "+(a||b));
                    break;
                case '*':
                    System.out.println("AND: "+(a&&b));
                    break;
                case '^':
                    System.out.print("XOR: "+(a^b));
                    break;
                default:
                    System.out.println("Invalid Operation");
                    break;
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        if (sc.hasNextInt()) {
            int a = sc.nextInt();
            System.out.println("Enter second number: ");
            int b = sc.nextInt();
            char op = sc.next().charAt(0);
            cal(a,b,op);
        } else if (sc.hasNextFloat()){
            float a = sc.nextFloat();
            System.out.println("Enter second number: ");
            float b = sc.nextFloat();
            char op = sc.next().charAt(0);
            cal(a,b,op);
        } else if(sc.hasNextBoolean()){
            boolean a = sc.nextBoolean();
            System.out.println("Enter second number: ");
            boolean b = sc.nextBoolean();
            char op = sc.next().charAt(0);
            cal(a,b,op);
        }
        sc.close();
    }
    
}
