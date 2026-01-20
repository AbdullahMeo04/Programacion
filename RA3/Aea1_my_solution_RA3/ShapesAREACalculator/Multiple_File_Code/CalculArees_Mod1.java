import java.util.Scanner;

public class CalculArees_Mod1 {
    Scanner scn = new Scanner(System.in);
    private double area = 0;

    public static void main(String[] args) {
        CalculArees_Mod1 Programa = new CalculArees_Mod1();
        Programa.inici();
    }

    public void inici() {
        bawag areaOfShapes = new bawag();
        boolean FI = false;

        while (!FI) {
            System.out.print("Enter a shape (triangle, circle, trapezoid, rhombus, parallelogram) ONLY typing FI to finish loop: ");
            String shape = scn.nextLine().toLowerCase();

            if (shape.equalsIgnoreCase("FI")) {
                FI = true;
                System.out.println("Program finished.");
                break;
            }

            switch (shape.toLowerCase()) {
                case "circle":
                    area = areaOfShapes.areaOfCircle();
                    break;
                case "triangle":
                    area = areaOfShapes.areaOfTriangle();
                    break;
                case "trapezoid":
                    area = areaOfShapes.areaOfTrapezoid();
                    break;
                case "rhombus":
                    area = areaOfShapes.areaOfRhombus();
                    break;
                case "parallelogram":
                    area = areaOfShapes.areaOfParallelogram();
                    break;
                default:
                    System.out.println("Shape not implemented yet.");
            }

        System.out.println("Area of the " + shape + " is = " + area);
            System.out.println();
        }
    }
}

// ask for scaaner function : made by yourself
// double area_of_circle = areaOfShapes.areaOfCircle(radius);
// area = areaOfShapes.areaOfCircle();
// sout(the area of + shape + is + area)
