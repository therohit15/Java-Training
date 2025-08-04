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


        //Direct brute force way


        // Arrays.sort(arr);
        // int num = arr[0];
        // int count = 1;
        // System.out.println("Frequency:");
        // for (int i = 1; i < arr.length; i++) {
        //     if(num==arr[i]){
        //         count++;
        //     }else{
        //         System.out.println(num+": "+count);
        //         count = 1;
        //         num = arr[i];
        //     }
        // }
        // System.out.println(num+": "+count);

        //traditional way

        int[] freq = new int[size];

        int visited = -1;

        for (int i = 0; i < arr.length; i++) {
            int count =1;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    count++;
                    freq[j]=visited;
                }
            }
            if(freq[i]!=visited) freq[i]=count;
        }
        for (int i = 0; i < arr.length; i++) {
            if(freq[i]!=visited){
                System.out.println(arr[i]+" count: "+freq[i]);
            }
        }

        sc.close();
    }
}
