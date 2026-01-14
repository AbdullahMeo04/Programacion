import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = 0;

            System.out.print("Enter the length of the vector: ");
            if (scn.hasNextInt()) {
                n = scn.nextInt();
                if (n > 0) {
                } else {
                    System.out.println("Length must be a positive integer.");
                }
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                scn.next();
            }

        int[] vector = new int[n];

        System.out.println("Enter the elements of the vector: ");
        for (int i = 0; i < n; i++) {
            while (true) {
                System.out.print("Element " + (i + 1) + ": ");
                if (scn.hasNextInt()) {
                    vector[i] = scn.nextInt();
                    break;
                } else {
                    System.out.println("Invalid input. Please enter an integer.");
                    scn.next();
                }
            }
        }

        int valor;
        while (true) {
            System.out.print("Enter the value to search: ");
            if (scn.hasNextInt()) {
                valor = scn.nextInt();
                break;
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                scn.next();
            }
        }

        boolean encontrado = false;
        for (int i = 0; i < n; i++) {
            if (vector[i] == valor) {
                System.out.println("Value " + valor + " found at position: " + (i+1));
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Value not found in the vector.");
        }

        scn.close();
    }
}
