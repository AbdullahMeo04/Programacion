// import java.util.Scanner;

// public class CalculArees_Mod {
//     Scanner scn = new Scanner(System.in);
//     private double area = 0;

//     public static void main(String[] args) {
//         CalculArees_Mod Programa = new CalculArees_Mod();
//         Programa.inici();
//     }

//     public void inici() {
//         System.out.print("Enter a shape (triangle, circle, trapezoid, rhombus, parallelogram): ");
//         String shape = scn.nextLine();

//         if (shape.equalsIgnoreCase("circle")) {
//             area_of_circle();
//             System.out.println("Area of the cicle is: " + area);
//         } else if (shape.equalsIgnoreCase("triangle")) {
//             area_of_triangle();
//             System.out.println("Area of the triangle is: " + area);
//         } else if (shape.equalsIgnoreCase("trapezoid")) {
//             area_of_trapezoid();
//             System.out.println("Area of the trapezoid is: " + area);
//         } else if (shape.equalsIgnoreCase("rhombus")) {
//             area_of_rhombus();
//             System.out.println("Area of the rhombus is: " + area);
//         } else if (shape.equalsIgnoreCase("parallelogram")) {
//             area_of_parallelogram();
//             System.out.println("Area of the parallelogram is: " + area);
//         } else {
//             System.out.println("Pease select from the given shapes!");
//         }
//     }
//     public void area_of_triangle() {
//         System.out.print("introdueix la base de triangle: ");
//         double base = scn.nextDouble();
//         System.out.print("introdueix l'altura: ");
//         double altura = scn.nextDouble();
//         area = 0.5 * base * altura;
//     }

//     public void area_of_circle() {
//         System.out.print("introdueix la radius: ");
//         double radius = scn.nextDouble();
//         area = 3.14 * radius * radius;
//     }

//     public void area_of_trapezoid() {
//         System.out.print("introdueix la base major: ");
//         double base_major = scn.nextDouble();
//         System.out.print("introdueix la base menor: ");
//         double base_menor = scn.nextDouble();
//         System.out.print("introdueix l'altura: ");
//         double altura = scn.nextDouble();
//         area = ((base_major + base_menor) * altura)/2;
//     }

//     public void area_of_rhombus() {
//         System.out.print("introdueix la diagonal_major: ");
//         double diagonal_major = scn.nextDouble();
//         System.out.print("introdueix la diagonal_menor: ");
//         double diagonal_menor = scn.nextDouble();
//         area = (diagonal_major * diagonal_menor) / 2;
//     }

//     public void area_of_parallelogram() {
//         System.out.print("introdueix la base de parallelogram: ");
//         double base = scn.nextDouble();
//         System.out.print("introdueix l'altura: ");
//         double altura = scn.nextDouble();
//         area = base * altura;
//     }
// }



import java.util.Scanner;

public class CalculArees_Mod {

    private boolean fi = false;

    Scanner scn = new Scanner(System.in);
    private double area = 0;

    public static void main(String[] args) {
        CalculArees_Mod programa = new CalculArees_Mod();
        programa.inici();
    }

    public void inici() {
        while (true) { //need to change it --> fi
            System.out.print("Enter a shape (triangle, circle, trapezoid, rhombus, parallelogram) or 'fi' to exit: ");
            String shape = scn.nextLine().toLowerCase();

            switch (shape) {
                case "circle":
                    area_of_circle();
                    System.out.println("Area of the circle is: " + area);
                    break;

                case "triangle":
                    area_of_triangle();
                    System.out.println("Area of the triangle is: " + area);
                    break;

                case "trapezoid":
                    area_of_trapezoid();
                    System.out.println("Area of the trapezoid is: " + area);
                    break;

                case "rhombus":
                    area_of_rhombus();
                    System.out.println("Area of the rhombus is: " + area);
                    break;

                case "parallelogram":
                    area_of_parallelogram();
                    System.out.println("Area of the parallelogram is: " + area);
                    break;

                case "fi":
                    fi = true;
                    System.out.println("Program finished.");
                    scn.close();
                    return;

                default:
                    System.out.println("Please select from the given shapes!");
            }

            scn.nextLine();
            System.out.println();
        }
    }

    public void area_of_circle() {
        System.out.print("Enter the radius: ");
        double radius = scn.nextDouble();
        area = Math.PI * radius * radius;
    }

    public void area_of_triangle() {
        System.out.print("Enter the base of the triangle: ");
        double base = scn.nextDouble();
        System.out.print("Enter the height: ");
        double height = scn.nextDouble();
        area = 0.5 * base * height;
    }


    public void area_of_trapezoid() {
        System.out.print("Enter the larger base: ");
        double baseMajor = scn.nextDouble();
        System.out.print("Enter the smaller base: ");
        double baseMinor = scn.nextDouble();
        System.out.print("Enter the height: ");
        double height = scn.nextDouble();
        area = (baseMajor + baseMinor) * height / 2;
    }

    public void area_of_rhombus() {
        System.out.print("Enter the major diagonal: ");
        double diagonalMajor = scn.nextDouble();
        System.out.print("Enter the minor diagonal: ");
        double diagonalMinor = scn.nextDouble();
        area = (diagonalMajor * diagonalMinor) / 2;
    }

    public void area_of_parallelogram() {
        System.out.print("Enter the base: ");
        double base = scn.nextDouble();
        System.out.print("Enter the height: ");
        double height = scn.nextDouble();
        area = base * height;
    }
}
