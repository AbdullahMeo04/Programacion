import java.util.Scanner;

public class readRealNumbers {
    public static void main(String[] args) {
        readRealNumbers programa = new readRealNumbers();
        programa.inici();
    }

    public void inici() {
        System.out.print("enter the number with kerboard:");
        double a = numberEntered();
        System.out.println("entered number is " + a + ".");
        System.out.print("Enter another number from keyboeard: ");
        a = numberEntered();
    System.out.println("the other number is " + a + ".");
    }

    public double numberEntered() {
        Scanner scn = new Scanner(System.in);
        double numberEntered = 0;
        boolean read = false;
        while (!read) {
            read = scn.hasNextDouble();
            if (read) {
                numberEntered = scn.nextDouble();
            } else {
                System.out.println("This is not an Real number(Double).");
                scn.next();
            }
        }

        while (!scn.hasNextDouble()) {
                System.out.println("This is not an Real number(Double).");
                scn.next();
        }

        scn.nextLine();
        numberEntered=scn.nextDouble();
        return numberEntered;
    }
}
