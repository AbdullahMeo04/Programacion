import java.util.Scanner;

public class AA4_FailedCheck {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("How many grades do you want to enter? ");
        int subjects = scn.nextInt();

        double[] grades = new double[subjects];
        boolean hasFailed = false;

        for (int i = 0; i < subjects; i++) {
            System.out.print("Enter grade " + (i + 1) + ": ");
            double grade = scn.nextDouble();

            if (grade < 0 || grade > 10) {
                System.out.println("Invalid grade. Please enter a value between 0 and 10.");
                i--;
                continue;
            }

            grades[i] = grade;

            if (grade < 5) {
                hasFailed = true;
                break;
            }
        }

        if (hasFailed) {
            System.out.println("At least one student has failed.");
        } else {
            System.out.println("No student has failed.");
        }

        scn.close();
    }
}
