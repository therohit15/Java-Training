//Find the next perfect squares
//Input Format: Single integer (9),25,77,-100
//Output Format: Single integer (16),36,-1,-1
import java.util.*;
public class Third {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double no = sc.nextDouble();
        if(no<0 || no%!=0){
            System.out.println("-1");
            sc.close();
            return;
        }else{
            int newno = (int)Math.sqrt(no)+1;
            int res = newno*newno;
            System.out.println(res);
        }
        sc.close();
    }
}
