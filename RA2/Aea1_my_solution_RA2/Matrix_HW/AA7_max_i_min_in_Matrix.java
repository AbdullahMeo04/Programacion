import java.util.Scanner;

public class AA7_max_i_min_in_Matrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] numbers = new int[rows][cols];
        
        System.out.println("\nEnter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("matrix[" + i + "][" + j + "] = ");
                numbers[i][j] = sc.nextInt();
            }
        }
        System.out.println("The matrix is: ");

        int max = numbers[0][0];
        int min = numbers[0][0];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
                if (numbers[i][j] < min) {
                    min = numbers[i][j];
                }
                if (numbers[i][j] > max) {
                    max = numbers[i][j];
                }
            }
            System.out.println();
        }
        System.out.println("The maximum vlaue in this matrix es: " + max);
        System.out.println("The minimum vlaue in this matrix es: " + min);

        sc.close();
    }
}