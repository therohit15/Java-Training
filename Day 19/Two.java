
//Method Overriding
import java.util.*;

class Animal{
    void sound(){
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dog barks \uD83D\uDC36");
    }
}

class Cat extends Animal{
    @Override
    void sound(){
        System.out.println("Cat meows 😺");
    }
}

class Lion extends Animal{
    @Override
    void sound(){
        System.out.println("Lion roars 🦁");
    }
}


public class Two
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
        List<Animal> list = new ArrayList<>();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String animal=sc.nextLine();
            Animal a;
            if(animal.equalsIgnoreCase("dog")){
                a=new Dog();
                list.add(a);
            }else if(animal.equalsIgnoreCase("cat")){
                a=new Cat();
                list.add(a);
            }else if(animal.equalsIgnoreCase("lion")){
                a=new Lion();
                list.add(a);
            }else if(animal.equalsIgnoreCase("animal")){
                a=new Animal();
                list.add(a);
            }else{
                list.add(null);
            }
        }
        for(Animal a: list){
            if(a==null){
                System.out.println("Invalid animal input");
                continue;
            }
            a.sound();
        }
	    
        sc.close();
		
	}
}