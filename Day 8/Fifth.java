//updation at nth position
import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt(); //step-1

        int[] arr = new int[n]; //step-2 orginal array

        System.out.println("Enter elements: "); //step-2
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        //new array-step-3
        System.out.println("Enter the position: ");
        int pos = sc.nextInt();
        System.out.println("Enter the value");
        int val=sc.nextInt();
        
        if(pos < 0 || pos > n){ //step-4
            System.out.println("Invalid Input");
            sc.close();
            return;

        }
        
        //arr[pos]=val;

        int[] newArr = new int[arr.length];
        for(int i=0; i<pos; i++){
            newArr[i]=arr[i];
        }
        newArr[pos]=val;
        for(int i=pos+1; i<arr.length; i++){
            newArr[i]=arr[i];
        }
        
        System.out.println("New Array: ");
        for(int i=0;i<newArr.length;i++){
            System.out.printf("%d ",newArr[i]);
        }
        sc.close();
	}
} 
    

