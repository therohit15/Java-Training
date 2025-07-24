// q1)
// print the pattern
// 4
// A B C D 
// E F G H 
// I J K L 
// M N O P 


// P O N M
// L K J I
// H G F E
// D C B A


// A E I M
// B F J N
// C G K O 
// D H L P


// 01
// 01 01
// 01 02 01
// 01 03 02 01


import java.util.*;

public class One {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        //logic 1
        int ch = 65;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print((char)ch++ +" ");
            }
            System.out.println();
        }


        System.out.println();


        //logic 2
        char ch1 = 'A';
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(ch1<='Z' && ch1>='A')
                System.out.print(ch1++ +" ");
            }
            System.out.println();
        }
        scan.close();


        System.out.println();


        //q2
        char ch2 = 'P';
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(ch2<='Z' && ch2>='A')
                System.out.print(ch2-- +" ");
            }
            System.out.println();
        }


        System.out.println();


        //q3
        char ch3 ='A';
        for(int i=1; i<=n; i++){
            char no = ch3;
            for(int j=1; j<=n; j++){
                System.out.print(  no +" ");
                no+=n;
            }
            ch3++;
            System.out.println();
        }


        System.out.println();


        //logic 2
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(((char)('A'+((n*j)+i))) +" ");
            }
            System.out.println();
        }
        

        System.out.println();


        //q4 logic 1
        for(int i=0; i<n; i++){
            int inc = i;
            for(int j=0; j<n; j++){
                if(i>=j){
                    if(j==0){
                        System.out.printf("%02d ",1);
                    }else{
                        System.out.printf("%02d ",inc--);
                    }
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}