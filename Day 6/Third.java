import java.util.Scanner;
public class Third
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    
	    int n=sc.nextInt();



// 5
// * 
// * * 
// * * * 
// * * * * 
// * * * * * 

	    for(int i=1;i<=n;i++)//rows
	    {
	       for(int j=1;j<=i;j++)//collums
	        {
	        System.out.print("* ");
	     
	        }
	        System.out.println();
	    }



// 5
// *       
// * * 
// * * * 
// * * * * 
// * * * * * 
	    for(int i=1;i<=n;i++)//rows
	    {
	       for(int j=n;j>=i;j--)//collums
	        {
	        System.out.print("* ");
	     
	        }
	        System.out.println();
	    }


        for(int i=1;i<=n;i++)//rows
	    {
            System.out.print("  ".repeat(n-i));
	       for(int j=1;j<=i;j++)//collums
	        {
	        System.out.print("* ");
	     
	        }
	        System.out.println();
	    }
	}	

}