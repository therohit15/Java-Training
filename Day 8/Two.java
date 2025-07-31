//inserting at any position
import java.util.Scanner;

public class Two {
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
        int[] newArr = new int[n+1];
        
        System.out.println("Enter Index value");
        int pos=sc.nextInt();
        System.out.println("Enter element value");
        int ele=sc.nextInt();
        
        if(pos < 0 || pos > n){ //step-4
            System.out.println("Invalid Input");
            sc.close();
            return;

        }
        newArr[pos]=ele;//-1st half  step-5
        
        //copying old elements into new Array   step-6
        for(int i=0;i<pos;i++){  //2nd half
            newArr[i]=arr[i];
        }
        
        for(int i=pos;i<n;i++){  //step-7
            newArr[i+1]=arr[i];
        }
        
        for(int i=0;i<newArr.length;i++){//step-8  (i<=n or i<n+1 or i<newArr.length)
            System.out.printf("%d ",newArr[i]);
        }
        sc.close();
	}
}