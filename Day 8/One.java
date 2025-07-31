//Inserting Element at last position

import java.util.*;
public class One {
    public static void main(String[] args) {
        
        //Declaring array size and getting size from the user

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of elements: \n");
        int size = sc.nextInt();
        
        //Getting array elements from the user

        int[] arr = new int[size];
        System.out.println("Enter elements: ");
        for (int i = 0; i < arr.length; i++) {

            arr[i]=sc.nextInt();
        }
        System.err.println("Old Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ",arr[i]);
        }

        //Getting new element to insert at ending
        System.out.println("\nEnter the new element for last postion");
        int val = sc.nextInt();

        //Increase the array size (size+1)

        int[] newArr = new int[size+1];
        for (int i = 0; i < newArr.length-1; i++) {
            newArr[i+1]=arr[i];
        }

        //Insert the last element in last index

        newArr[size] = val;

        //Print new array elements

        System.err.println("New Array: ");
        for (int i = 0; i < newArr.length; i++) {
            System.out.printf("%d ",newArr[i]);
        }
        sc.close();
    }
}
