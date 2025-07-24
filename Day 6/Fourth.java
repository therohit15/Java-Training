import java.util.Scanner;
public class Fourth{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();

        // 4
        //  1  2  3  4 
        //  5  6  7  8
        //  9 10 11 12
        //  13 14 15 16


        // int a = 1;
	    // for(int i=1;i<=n;i++)//rows
	    // {
	    //    for(int j=1;j<=n;j++)//collums
	    //     {
	    //     System.out.printf("%02d ",a++);
	    //     }
	    //     System.out.println();
	    // }
        // int a =1;
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=n; j++){
        //         if((i+j)<=(n+1))
        //         System.out.printf("%02d ",a++);
        //         else
        //         System.out.print("  ");
        //     }
        //     System.out.println();
        // }


        // a =1;
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=n; j++){
        //         if((i+j)>=(n+1))
        //         System.out.printf("%02d ",a++);
        //         else
        //         System.out.print("   ");
        //     }
        //     System.out.println();
        // }
        // System.out.println();


        // a =1;
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=n; j++){
        //         if(j>=i)
        //         System.out.printf("%02d ",a++);
        //         else
        //         System.out.print("   ");
        //     }
        //     System.out.println();
        // }
        // System.out.println();

        
        // a =1;
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=n; j++){
        //         if(j<=i)
        //         System.out.printf("%02d ",a++);
        //         else
        //         System.out.print("   ");
        //     }
        //     System.out.println();
        // }
        // System.out.println();


        // a =1;
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=n; j++){
        //         if((i+j)>=(n+1))
        //         System.out.printf("%02d ",a++);
        //         else
        //         System.out.print("");
        //     }
        //     System.out.println();
        // }
        // System.out.println();


        // a =1;
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=n; j++){
        //         if(j<=i)
        //         System.out.printf("%02d ",a++);
        //         else
        //         System.out.print("");
        //     }
        //     System.out.println();
        // }
        // System.out.println();



        
        // for(int i=1; i<=n; i++){
        //     int res = i;
        //     for(int j=1; j<=n; j++){
        //         System.out.printf("%02d ",res);
        //         res=res+4;
        //     }
        //     System.out.println();
        // }
        // System.out.println();




        for(int i=1; i<=n; i++){
            int res = i;
            for(int j=1; j<=n; j++){
                System.out.printf("%02d ",res*2);
                res=res+4;
            }
            System.out.println();
        }
        System.out.println();

        sc.close();
    }
}