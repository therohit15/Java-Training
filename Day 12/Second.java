import java.util.Scanner;

public class Second {
    
    static Scanner sc = new Scanner(System.in);

    public static int[] intarr(int n){
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        return arr;
    }

    public static int findmax(int[] arr){
        int max= Integer.MIN_VALUE;
        for(int i=0; i<arr.length;i++){
            if(max<arr[i])max=arr[i];
        }
        return max;
    }

    public static int findmin(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length;i++){
            if(min>arr[i])min=arr[i];
        }
        return min;
    }

    public static int sumwithoutminmax(int[] arr, int min, int max){
        int sum=0;
        for(int i: arr){
            sum+=i;
        }
        return sum-min-max;
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] arr = intarr(n);
        int min = findmin(arr);
        int max = findmax(arr);
        int res = sumwithoutminmax(arr, min, max);
        System.out.println("Sum of the elements in array without min and max: "+res);
        sc.close();
    }
}
    