import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int TOTAL_STUDENTS = 5;
        String[] names = new String[TOTAL_STUDENTS];
        double[] grades = new double[TOTAL_STUDENTS];

        // Input
        for (int i = 0; i < TOTAL_STUDENTS; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            names[i] = sc.nextLine();
            do {
                System.out.print("Enter " + names[i] + "'s grade (0–10): ");
                grades[i] = sc.nextDouble();
                sc.nextLine(); // clear buffer
            } while (grades[i] < 0 || grades[i] > 10);
        }

        // Calculations
        double sum = 0, max = grades[0];
        String top = names[0];
        int passed = 0;
        boolean hasTen = false;

        for (int i = 0; i < TOTAL_STUDENTS; i++) {
            double g = grades[i];
            sum += g;
            if (g >= 5) passed++;
            if (g > max) { max = g; top = names[i]; }
            if (g == 10) hasTen = true;
        }

        // Results
        System.out.println("\n--- RESULTS ---");
        System.out.printf("Average grade: %.2f%n", sum / TOTAL_STUDENTS);
        System.out.println("Students passed: " + passed);
        System.out.println("Students failed: " + (TOTAL_STUDENTS - passed));
        System.out.println("Top student: " + top + " (" + max + ")");
        System.out.print("Students with grade 10: ");
        boolean foundTen = false;
        for (int i = 0; i < TOTAL_STUDENTS; i++) {
            if (grades[i] == 10) {
                System.out.print(names[i] + " ");
                foundTen = true;
            }
        }
        if (!foundTen) System.out.print("None");
        System.out.println();

        sc.close();
    }
}
