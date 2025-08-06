import java.util.Scanner;

public class Sixth {
    public static int add (int a, int b, int c){
        return a+b+c;
    }
    public static int max (int[] arr){
        int max= Integer.MIN_VALUE;
        for(int i: arr){
            if(max<i) max=i;
        }
        return max;
    }
    public static int sum (int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Sum of three numbers: ");
        System.out.println(add(a,b,c));
        System.out.println("Enter no of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter no of elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Max Elements: ");
        System.out.println(max(arr));
        System.out.println("Sum of Elements: ");
        System.out.println(sum(arr));
        sc.close();
    }
}
