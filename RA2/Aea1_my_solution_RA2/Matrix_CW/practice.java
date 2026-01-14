import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] numbers = new int[rows][cols];

        System.out.println("Enter the numbers in the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        int min = numbers[0][0];
        int max = numbers[0][0];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (numbers[i][j] < min)
                    min = numbers[i][j];
                if (numbers[i][j] > max)
                    max = numbers[i][j];
            }
        }

        System.out.println("The maximum value in this matrix is: " + max);
        System.out.println("The minimum value in this matrix is: " + min);

        sc.close();
    }
}
