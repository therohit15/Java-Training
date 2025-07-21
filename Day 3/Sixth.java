import java.util.*;
public class Sixth{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1=1900+n;
        int n2=2000+n;
        int c = sc.nextInt();
        int c1=1900+c;
        int c2=2000+c;
        if(c2-n2>0){
            System.out.println(c2-n2);
        }else if(c2-n1>0)System.out.println(c2-n1);
        else if(c1-n2>0)System.out.print(c1-n2);
        sc.close();
    }
}