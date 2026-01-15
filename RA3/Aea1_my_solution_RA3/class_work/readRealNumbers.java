import java.util.Scanner;

public class readRealNumbers {
    private Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        readRealNumbers programa = new readRealNumbers();
        programa.inici();
    }

    public void inici() {
        System.out.print("Enter a number from keyboard: ");
        double a = numberEntered();
        System.out.println("Entered number is " + a + ".");

        System.out.print("Enter another number from keyboard: ");
        a = numberEntered();
        System.out.println("The other number is " + a + ".");
    }

    public double numberEntered() {
        while (true) {
            if (scn.hasNextDouble()) {
                return scn.nextDouble();
            } else {
                System.out.println("This is not a real number (Double). Try again:");
                scn.next();
            }
        }
    }
}
