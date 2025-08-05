import java.util.*;

public class One {

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{2,4,2},{1,2,3}};
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(matrix);
    }
}