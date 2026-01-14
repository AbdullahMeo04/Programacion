/*import java.util.Scanner;

public class Matrix_scanner {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int rows = scn.nextInt();
        int cols = scn.nextInt(); 
        int[][] jutt = new int[rows][cols];

        System.out.println("enter the elements of matrix:");
        for(int i=0; i<rows; i++){
            for(int j=0; i<cols; j++){
                System.out.println("matrix ["+i+"]["+j+"]");
                jutt[i][j] = scn.nextInt();
            }
        }

        for(int i=0; i<jutt.length; i++){
            for(int j=0; i<jutt[i].length; j++){
                System.out.println(jutt[i][j]+ " ");
            }
        }
    scn.close();
    }
}
*/
import java.util.Scanner;

public class Matrix_scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Ask the user for the matrix size
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        // Step 2: Create a 2D array (matrix)
        int[][] matrix = new int[rows][cols];

        // Step 3: Fill the matrix with user input
        System.out.println("\nEnter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {           // loop over rows
            for (int j = 0; j < cols; j++) {       // loop over columns
                System.out.print("matrix[" + i + "][" + j + "] = ");
                matrix[i][j] = sc.nextInt();       // read value from user
            }
        }

        // Step 4: Print the matrix
        System.out.println("\nThe matrix is:");
        for (int i = 0; i < matrix.length; i++) {        // number of rows
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
