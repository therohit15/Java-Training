//Inserting Element at last position

import java.util.*;
public class Two {
    public static void main(String[] args) {
        
        //Declaring array size and getting size from the user

        Scanner sc = new Scanner(System.in);
        char[] name = sc.nextLine().toCharArray();
        int count = sc.nextInt();
        sc.nextLine();
        char ch = sc.next().charAt(0);
        
        //Getting array elements from the user
        if(ch=='L'){
            while(count>0){
                char letter = name[0];
                for(int n=0; n<name.length-1; n++){
                    name[n]=name[n+1];
                }
                name[name.length-1] = letter;
                count--;
            }
        }else if(ch=='R'){
            while(count>0){
                char letter = name[name.length-1];
                for(int n=name.length-1; n>0; n++){
                    name[n]=name[n-1];
                }
                name[0] = letter;
                count--;
            }
        }
        for (int i = 0; i < name.length; i++) {
                System.out.print(name[i]+"");
        }


        sc.close();
    }
}
