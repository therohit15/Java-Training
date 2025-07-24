// Q4)

// In an emergency situation, it is crucial to display safety instructions in a clear and attention-grabbing 
// way. A security system at a busy train station is designed to flash emergency instructions on a large screen 
// in the shape of an "X" pattern using a given instruction string. This unique design ensures visibility from 
// different angles and grabs the attention of people in the area.
// Your task is to write a program that takes an instruction string as input and generates an 
// "X" pattern using characters from the string. The size of the pattern will be determined by the length of 
// the string.
// Input Format
// A string s representing the emergency instruction message. Note: The length of the string n 
// must be an odd integer greater than or equal to 3.
// Constraints
// NA
// Output Format
// An "X" pattern printed on a grid of size n x n, where n is the length of the string s.
// Sample Input 0
// EMERGENCY
// Sample Output 0
// E       Y
//  M     C 
//   E   N  
//    R E   
//     G    
//    R E   
//   E   N  
//  M     C 
// E       Y
// Sample Input 1
// ATTENTION
// Sample Output 1
// A       N
//  T     O 
//   T   I  
//    E T   
//     N    
//    E T   
//   T   I  
//  T     O 
// A       N




import java.util.*;

public class Fourth {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        //logic 1
        int last = s.length()-1;
        for(int i=0, k=last;i<s.length();i++,k--){
            for(int j=0; j<s.length();j++){
                if(i==j){
                    System.out.print(s.charAt(i));
                }else if(j==last){
                    System.out.print(s.charAt(k));
                }
                else{
                    System.out.print(" ");
                }
            }
            last--;
            System.out.println();
        }

        System.out.println();
        //logic 2
        
        int n = s.length();
        for(int i =0;i<n;i++){
            for(int j =0;j<n;j++){ 
                if(i==j||i + j == n - 1){
                    System.out.print(s.charAt(i));
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


        System.out.println();

	    //logic 3
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                
                if (j == i) {
                    System.out.print(s.charAt(i));
                } else if (j == n - 1 - i) {
                    System.out.print(s.charAt(n - 1 - i));
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); 
        }

        System.out.println();




        //logic 4
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                
                if (j == i) {
                    System.out.print(s.charAt(i));
                } else if (j == n - 1 - i) {
                    System.out.print(s.charAt(i));
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); 
        }

        System.out.println();
   
        
        scan.close();
    }
}
