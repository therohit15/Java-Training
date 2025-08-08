import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static int balance = 0;

    static void deposit(){
        System.out.print("Enter amount to deposit: ");
        int amount = scan.nextInt();
        if(amount<0){
            System.out.println("Invalid amount");
            return;
        }
        balance+=amount;
        System.out.println("Amount deposited successfully!");
    }

    static void withdraw(){
        System.out.print("Enter amount to withdraw: ");
        int amount = scan.nextInt();
        if(amount>balance || amount<0){
            System.out.println("Invalid amount or insufficient balance");
            return;
        }
        balance-=amount;
        System.out.println("Amount withdrawn successfully!");
    }

    static void getBalance(){
        System.out.println("Current Balance:Rs"+balance);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to simple bank");
        System.out.print("Enter your name: ");
        String name = scan.nextLine();
        System.out.print("Enter account number: ");
        long accno = scan.nextLong();
        System.out.println("Account created successfully!");
        boolean flag = true;
        while (flag) {
            System.out.println("=========MENU=========");
            System.out.println("1.Deposit\n2.Withdraw\n3.Check Balance\n4.Exit");
            System.out.print("Enter your choice: ");
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    deposit();
                    break;
                case 2:
                    withdraw();
                    break;
                case 3:
                    getBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using the bank application");
                    flag=false;
                    break;
                default:
                    System.out.println("Invalid choice. Kindly choose between 1-4.");
                    break;
            }
        }
        scan.close();
    }
}