// Dora is interested so much in gardening and she plants more trees in her garden.
// She plants trees in a rectangular fashion with the order of rows and columns 
// and numbered the trees in row-wise order. 
// She planted the mango tree only in a 1st row, 
// 1st column and last column. So given the tree number, 
// your task is to find whether the given tree is a mango tree or not?
// Write a program to check whether the given number is a mango tree or not.
// Input format: Input consists of 3 integers 
// The first input denotes the number of rows 
// The second input denotes the number of columns 
// The third input denotes the tree number 
// Output format: If the given number is a mango tree, print "Yes". 
// Otherwise, print "No" Refer the sample output for formatting
// Input (stdin)
// 5
// 5
// 11
// Output (stdout)
// Yes
// Input (stdin)
// 2
// 2
// 4
// Output (stdout)
// Yes

import java.util.Scanner;

public class Eight {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        int treeno = sc.nextInt();
        boolean flag = false;
        int[][] matrix = new int[row][column];
        int n =1;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = n++;
            }
        }
        // for(int i=0; i<row;i++){
        //     for (int j = 0; j < column; j++) {
        //         if((i==0 && (0<=j &&j<column-1))||((0<=i && i<row-1)&&j==0)||(j==column-1 && (0<=i && i<column-1))){
        //             if(matrix[i][j]==treeno){
        //                 flag = true;
        //                 break;
        //             }
        //         }
        //     }
        // }

        // for(int i=0; i<row;i++){
        //     for (int j = 0; j < column; j++) {
        //         if((i==0 || j==0 || j==column-1){
        //             if(matrix[i][j]==treeno){
        //                 flag = true;
        //                 break;
        //             }
        //         }
        //     }
        // }
        if((treeno>=1 && treeno<=column)||(treeno%column==0)||(treeno%column==1)) flag = true;

        System.out.println(flag?"Yes":"No");
        sc.close();
    }
}