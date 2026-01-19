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

        while (true) {
            System.out.print(
                    "Enter a shape (triangle, circle, trapezoid, rhombus, parallelogram) or type FI to finish: ");
            String shape = scn.nextLine().toLowerCase();

            if (shape.equalsIgnoreCase("FI")) {
                System.out.println("Program finished.");
                break;
            }

            switch (shape.toLowerCase()) {
                case "circle":
                    //ask for scaaner function : made by yourself
                    //double area_of_circle = areaOfShapes.areaOfCircle(radius);
                    //area = areaOfShapes.areaOfCircle();
                    double area_of_circle = areaOfShapes.areaOfCircle();
                    System.out.println("Area of the circle is: " + area_of_circle);
                    break;

                case "triangle":
                    double area_of_triangle = areaOfShapes.areaOfTriangle();
                    System.out.println("Area of the trianlge is: " + area_of_triangle);
                    break;

                case "trapezoid":
                    double area_of_trapezoid = areaOfShapes.areaOfTrapezoid();
                    System.out.println("Area of the trapezoid is: " + area_of_trapezoid);
                    break;

                case "rhombus":
                    double area_of_rhumbus = areaOfShapes.areaOfRhombus();
                    System.out.println("Area of the rhumbus is: " + area_of_rhumbus);
                    break;

                case "parallelogram":
                    double area_of_parallelogram = areaOfShapes.areaOfParallelogram();
                    System.out.println("Area of the rhumbus is: " + area_of_parallelogram);
                    break;

                default:
                    System.out.println("Shape not implemented yet.");
            }
            //sout(the area of + shape + is + area)

            System.out.println();
        }
    }
}
