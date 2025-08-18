//Multi level Inheritance


//Single Inheritance
import java.util.Scanner;

class Car {
    String name;
    int year;
    Car(String name, int year){
        this.name = name;
        this.year = year;
    }
    public void display(){
        System.out.println("Car name: "+name);
        System.out.println("Car year: "+year);
    }
    
}

class ElectricCar extends Car{
    int batteryCapacity;
    ElectricCar(String name, int year, int batteryCapacity) {
        super(name, year);
        this.batteryCapacity = batteryCapacity;
    }
    public void display() {
        display();
        System.out.println("Electric capacity: "+batteryCapacity+"kwh");
    }
    
}

class Child extends ElectricCar {
    int autoPilotVersion;
    Child(String name, int year, int batteryCapacity, int autoPilotVersion) {
        super(name, year, batteryCapacity);
        this.autoPilotVersion = autoPilotVersion;
    }
    public void display(){
        display();
        System.out.println("Auto Pilot Version: "+autoPilotVersion+"v");
    }

    
}

public class Two {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int year = sc.nextInt();
        int batteryCapacity = sc.nextInt();
        int autoPilotVersion = sc.nextInt();
        Child c1 = new Child(name,year,batteryCapacity,autoPilotVersion);
        c1.display();
        sc.close();
        
    }
}