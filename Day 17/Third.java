// USECASE
// Grandfather Raman was a wealthy man who owned fertile agricultural land.
// He worked hard all his life to grow crops and maintain the land.
// When he grew old, the property was passed on to his son Suresh.
// Suresh expanded the land by building a beautiful farmhouse.
// He also planted fruit orchards, making the land more valuable.
// Years later, Suresh handed over the property to his son Arjun.
// Arjun, being tech-savvy, built a modern villa on the land.
// He also installed solar panels to make the property eco-friendly.
// This way, each generation added something valuable to the inheritance.
// The family’s legacy continued to grow through three generations.

// Test Case 1
// Input:
// Raman's Land
// Green Farmhouse
// Modern Villa with Solar Panels

// Output:
// Grandfather's Property: Raman's Land
// Father's Addition: Green Farmhouse
// Son's Addition: Modern Villa with Solar Panels

// Test Case 2
// Input:
// Shiv's Mango Orchard
// Luxury Farmhouse
// Glass Villa with Wind Turbines

// Output:
// Grandfather's Property: Shiv's Mango Orchard
// Father's Addition: Luxury Farmhouse
// Son's Addition: Glass Villa with Wind Turbines

import java.util.Scanner;

class Grandfather {
    String fertileAgriculturalLand;
    void displayGrandFatherProperty(){
        System.out.println("Grandfather's Property: "+fertileAgriculturalLand);
    }
}

class Father extends Grandfather{
    String farmhouse;
    void displayFatherProperty(){
    displayGrandFatherProperty();
        System.out.println("Father's Addition: "+farmhouse);
    }
}

class Son extends Father{
    String villa;
    void displaySonProperty(){
        displayFatherProperty();
        System.out.println("Son's Addition: "+villa);
    }
    
}


public class Third {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Son obj = new Son();
        obj.fertileAgriculturalLand = sc.nextLine();
        obj.farmhouse = sc.nextLine();
        obj.villa = sc.nextLine();
        obj.displaySonProperty();
        sc.close();
    }
}
