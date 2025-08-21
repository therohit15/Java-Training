// Usecase
// The parent class Car had a method called race(), which simply said "Car is racing" 🚗.
// Different car companies joined the race with their own unique racing styles.
// A Ferrari  overrode the race() method to say "Ferrari races with blazing speed" 🏎.
// A Lamborghini  overrode it to say "Lamborghini races with roaring power" 🔥.
// A Tesla ⚡ overrode it to say "Tesla races silently with electric power" 🔋.
// Even though the method name was always race(), the behavior changed at runtime.
// The race announcer (like the JVM) didn’t know in advance which car’s style would appear.
// When the cars came on track, the JVM decided at runtime which race() to execute.
// Thus, Method Overriding allowed each car to show its own racing personality, while still following the same rule: race() .

// Input Format
// First line: Enter the number of cars (n).
// Next n lines: Each line contains a car name (Ferrari, Lamborghini, Tesla, or Car).

// Output Format
// For each car entered, print its racing style using the race() method.

// Test Case 1
// Input:
// 3
// Ferrari
// Lamborghini
// Tesla

// Output:
// Ferrari races with blazing speed 
// Lamborghini races with roaring power 
// Tesla races silently with electric power 

// Test Case 2
// Input:
// 2
// Car
// Ferrari

// Output:
// Car is racing 
// Ferrari races with blazing speed

import java.util.ArrayList;
import java.util.Scanner;

class Car {
    void race(){
        System.out.println("Car is racing");
    }
}

class Ferrari extends Car {
    void race(){
        System.out.println("Ferrari races with blazing speed");
    }
}
class Lamborghini extends Car {
    void race(){
        System.out.println("Lamborghini races with roaring power");
    }
}
class Tesla extends Car {
    void race(){
        System.out.println("Tesla races silently with electric power");
    }
}

public class Three {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        while(n<0){
            System.out.println("Enter positive number(Enter -99 to exit): ");
            n=sc.nextInt();
            if(n==-99)break;
        }
        if(n==-99){
            sc.close();
            return;
        }
        sc.nextLine();
        ArrayList<Car> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Car car;
            String name = sc.nextLine();
            if(name.equalsIgnoreCase("Ferrari")){
                car = new Ferrari();
                list.add(car);

            }else if(name.equalsIgnoreCase("Lamborghini")){
                car = new Lamborghini();
                list.add(car);
            }else if(name.equalsIgnoreCase("Tesla")){
                car = new Tesla();
                list.add(car);
            }else if(name.equalsIgnoreCase("Car")){
                car = new Car();
                list.add(car);
            }else{
                list.add(null);
            }
        }
        for(Car car: list){
            if(car== null){
                System.out.println("Invalid Car");
                continue;
            }
            car.race();
        }
        sc.close();
    }
}