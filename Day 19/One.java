// \\Usecase
// Once upon a time, there was a restaurant 🍴 where a chef could cook the same dish in different ways.
// If a customer ordered 2 ingredients (like rice and curry), the chef prepared a simple meal.
// If someone gave 3 ingredients (rice, curry, and chicken), the chef made a special meal 🍗.
// And if a customer gave two special items like juices (double values), the chef blended them into a drink 🥤.
// Although the dish name was always "CookFood", the way it was prepared changed with ingredients.
// This is exactly how method overloading works — same method name but different parameter lists.
// In Java, the method name cookFood() can be written many times but with different arguments.
// The compiler decides at compile-time which version of the method to call.
// So the chef (like the compiler) knows which dish to prepare depending on the input type and number.
// Thus, Method Overloading makes the program (or restaurant 🍽) more flexible and user-friendly.

// Input Format
// First line: Enter two integers (like 5 10 → rice + curry).
// Second line: Enter three integers (like 2 4 6 → rice + curry + chicken).
// Third line: Enter two doubles (like 3.5 2.5 → juice blending).

// Output Format
// Print sum of two integers (represents simple meal).
// Print sum of three integers (represents special meal).
// Print sum of two doubles (represents juice).

// Test Cases 
// Input-1:
// 5 10
// 2 4 6
// 3.5 2.5

// Output-1:
// Simple Meal (2 items): 15
// Special Meal (3 items): 12
// Juice Mix (2 drinks): 6.0

// Input-2:
// 8 12
// 10 20 30
// 4.5 5.5


// Output-2:
// Simple Meal (2 items): 20
// Special Meal (3 items): 60
// Juice Mix (2 drinks): 10.0

import java.util.Scanner;

class Restaurant {
    int cookFood(int a, int b){
        return a+b;
    }
    int cookFood(int a, int b, int c){
        return a+b+c;
    }
    double cookFood(double a, double b){
        return a+b;
    }
}

public class One {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.nextLine();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        sc.nextLine();
        double f = sc.nextDouble();
        double g = sc.nextDouble();
        Restaurant obj = new Restaurant();
        System.out.println("Simple meat (2 items): "+obj.cookFood(a, b));
        System.out.println("Special meat (3 items): "+obj.cookFood(c, d, e));
        System.out.println("Juice Mix (2 drinks): "+obj.cookFood(f, g));
        sc.close();
    }
}