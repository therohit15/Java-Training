//deletion at any position
import java.util.Scanner;

public class Third {
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
        int[] newArr = new int[n-1];
        
        System.out.println("Enter Index value");
        int pos=sc.nextInt();
        
        if(pos < 0 || pos > n){ //step-4
            System.out.println("Invalid Input");
            sc.close();
            return;

        }
        
        for(int i=0; i<pos; i++){
            newArr[i]= arr[i];
        }
        for(int i=pos+1; i<n; i++){
            newArr[i-1]=arr[i];
        }
        
        System.out.println("New Array after deleting "+pos+"th index");
        for(int i=0;i<newArr.length;i++){
            System.out.printf("%d ",newArr[i]);
        }
        sc.close();
	}
}