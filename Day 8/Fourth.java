//deletion at end
import java.util.Scanner;

public class Fourth {
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
    

        for(int i=0; i<newArr.length; i++){
            newArr[i]= arr[i];
        }
        
        System.out.println("Array after deleting the last position: ");
        for(int i=0;i<newArr.length;i++){
            System.out.printf("%d ",newArr[i]);
        }
        sc.close();
	}
}