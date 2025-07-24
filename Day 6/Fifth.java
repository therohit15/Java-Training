import java.util.*;
public class Fifth{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // int n = scan.nextInt();
        // int num = 1;
        // for(int i=1; i<=n; i++){
        //     int res = num;
        //     for(int j=i; j<=n; j++){
        //         System.out.printf("%02d ",res);
        //         res+=2;
        //     }
        //     System.out.println();
        //     num+=2;
        // }













int n = scan.nextInt();


   for(int i=0;i<=n;i++){
    for(int j=0;j<=i;j++){
        if((i+j)<=(n+1)){
       System.out.print(n);
        }
        else{
            System.out.println(" ");
        }
    }
    System.out.println();
   }
        
        scan.close();
    }
}
