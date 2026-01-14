import java.util.Scanner;

public class AA3_ExcellentCheck {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("How many grades do you want to enter? ");
        int subjects = scn.nextInt();

        double[] grades = new double[subjects];
        boolean hasTen = false;

        for (int i = 0; i < subjects; i++) {
            System.out.print("Enter grade " + (i + 1) + ": ");
            double grade = scn.nextDouble();

            if (grade < 0 || grade > 10) {
                System.out.println("Invalid grade. Please enter a value between 0 and 10.");
                i--;
                continue;
            }

            grades[i] = grade;
            if (grade == 10) {
                hasTen = true;
            }
        }

        if (hasTen) {
            System.out.println("YES, there is at least one student with a 10.");
        } else {
            System.out.println("There is no student with a 10.");
        }

        scn.close();
    }
}
