import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = 0;


        while (true) {
            System.out.print("Enter the number of elements (n): ");
            if (scn.hasNextInt()) {
                n = scn.nextInt();
                if (n > 0) {
                    break;
                } else {
                    System.out.println("Number of elements must be positive.");
                }
            } else {
                System.out.println("Invalid input! Please enter an integer.");
                scn.next();
            }
        }

        int[] Vector1 = new int[n];
        int[] Vector2 = new int[n];
        int[] Vector3 = new int[n];


        System.out.println("Enter the elements of Vector1: ");
        for (int i = 0; i < n; i++) {
            while (true) {
                System.out.print("Element " + (i + 1) + ": ");
                if (scn.hasNextInt()) {
                    Vector1[i] = scn.nextInt();
                    break;
                } else {
                    System.out.println("Invalid input! Please enter an integer.");
                    scn.next();
                }
            }
        }


        System.out.println("Enter the elements of Vector2: ");
        for (int i = 0; i < n; i++) {
            while (true) {
                System.out.print("Element " + (i + 1) + ": ");
                if (scn.hasNextInt()) {
                    Vector2[i] = scn.nextInt();
                    break;
                } else {
                    System.out.println("Invalid input! Please enter an integer.");
                    scn.next();
                }
            }
        }


        System.out.println("Sum of Vector1 and Vector2 is: ");
        for (int i = 0; i < n; i++) {
            Vector3[i] = Vector1[i] + Vector2[i];
            System.out.print(Vector3[i] + " ");
        }

        scn.close();
    }
}
