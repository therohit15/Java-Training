//Print 2d, row wise elements into column elements
import java.util.*;

public class Third {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int[][] matrix = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }
        System.out.println("Transpose matrix: ");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(matrix[j][i]+" ");
            }
            System.out.println();
        }
        scan.close();
    }
}
