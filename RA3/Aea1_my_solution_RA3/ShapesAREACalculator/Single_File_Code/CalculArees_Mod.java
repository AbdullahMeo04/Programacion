import java.util.Scanner;

public class CalculArees_Mod {

    private double area = 0;
    private Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        CalculArees_Mod programa = new CalculArees_Mod();
        programa.inici();
    }

    public void inici() {
        boolean FI = false;

        while (!FI) {
            System.out.print("Enter a shape (triangle, circle, trapezoid, rhombus, parallelogram) ONLY typing FI to finish loop: ");
            String shape = scn.nextLine().toLowerCase();

            if (shape.equalsIgnoreCase("FI")) {
                FI = true;
                System.out.println("Program finished.");
                break;
            }

            boolean validShape = true;

            switch (shape) {
                case "circle":
                    area_of_circle();
                    break;
                case "triangle":
                    area_of_triangle();
                    break;
                case "trapezoid":
                    area_of_trapezoid();
                    break;
                case "rhombus":
                    area_of_rhombus();
                    break;
                case "parallelogram":
                    area_of_parallelogram();
                    break;
                default:
                    System.out.println("Please select from the given shapes!");
                    validShape = false;
            }

            if (validShape) {
                System.out.println("Area of the " + shape + " is: " + area + "\n");
            }
        }
        scn.close();
    }

    public void area_of_circle() {
        System.out.print("Enter the radius: ");
        double radius = scn.nextDouble();
        scn.nextLine();
        area = Math.PI * radius * radius;
    }

    public void area_of_triangle() {
        System.out.print("Enter the base of the triangle: ");
        double base = scn.nextDouble();
        System.out.print("Enter the height: ");
        double height = scn.nextDouble();
        scn.nextLine();
        area = 0.5 * base * height;
    }

    public void area_of_trapezoid() {
        System.out.print("Enter the larger base: ");
        double baseMajor = scn.nextDouble();
        System.out.print("Enter the smaller base: ");
        double baseMinor = scn.nextDouble();
        System.out.print("Enter the height: ");
        double height = scn.nextDouble();
        scn.nextLine();
        area = (baseMajor + baseMinor) * height / 2;
    }

    public void area_of_rhombus() {
        System.out.print("Enter the major diagonal: ");
        double diagonalMajor = scn.nextDouble();
        System.out.print("Enter the minor diagonal: ");
        double diagonalMinor = scn.nextDouble();
        scn.nextLine();
        area = (diagonalMajor * diagonalMinor) / 2;
    }

    public void area_of_parallelogram() {
        System.out.print("Enter the base: ");
        double base = scn.nextDouble();
        System.out.print("Enter the height: ");
        double height = scn.nextDouble();
        scn.nextLine();
        area = base * height;
    }
}
