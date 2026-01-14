import java.util.Scanner;
public class AA6_Change_Matrix_Value {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("\nEnter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("matrix[" + i + "][" + j + "] = ");
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nThe matrix is:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                if (i % 2 == 0 && j % 2 == 0) { //i%2==0 --> even
                    matrix[i][j] = 1;
                }
                if (i % 2 == 0 && j % 2 != 0) { //i%2==0 --> even
                    matrix[i][j] = 2;
                }
                if (i % 2 != 0 && j % 2 == 0) { //i%2==0 --> even
                    matrix[i][j] = 3;
                }
                if (i % 2 != 0 && j % 2 != 0) { //i%2==0 --> even
                    matrix[i][j] = 4;
                }
                
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}