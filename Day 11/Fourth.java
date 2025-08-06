import java.util.Scanner;

public class Fourth {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().trim();
        str = str.replaceAll(" ", "");
        System.out.println("Total number of characters in a string: "+str.length());
        sc.close();
    }
}