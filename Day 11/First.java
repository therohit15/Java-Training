import java.util.Scanner;

public class First {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String newstr = "";
        int val ;
        // String newstr = "";
        // int val ;
        // for(char ch : str.toCharArray()){
        //     if(('A'<=ch && ch<='Z') || ('a'<=ch && ch<='z') ){
        //         if('a'<=ch && ch<='z'){
        //             val =(int)ch - 32;
        //             newstr += (char)val;
        //         }else if('A'<=ch && ch<='Z'){
        //             val =(int)ch + 32;
        //             newstr += (char)val;
        //         }
        //     }else{
        //         break;
        //     }
        // }  
        // System.out.println(newstr);
        for(char ch : str.toCharArray()){
            if('a'<=ch && ch<='z'){
                val =(int)ch - 32;
                newstr += (char)val;
            }else if('A'<=ch && ch<='Z'){
                val =(int)ch + 32;
                newstr += (char)val;
            }else{
                System.out.println("Invalid");
                return;
            }
        }  
        System.out.println(newstr);
        sc.close();
    }
}
