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
        super.display();
        System.out.println("Electric capacity: "+batteryCapacity+"kwh");
    }
    
}

public class One {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int year = sc.nextInt();
        int batteryCapacity = sc.nextInt();
        ElectricCar c1 = new ElectricCar(name,year,batteryCapacity);
        c1.display();
        sc.close();
        
    }
}