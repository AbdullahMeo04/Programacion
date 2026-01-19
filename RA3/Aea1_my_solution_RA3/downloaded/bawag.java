import java.util.Scanner;

public class bawag {
    Scanner scn = new Scanner(System.in);
    private double area = 0;

    public double areaOfCircle(){
        System.out.print("introdueix la radius: ");
        double radius = scn.nextDouble();
        area = 3.14 * radius * radius;
        return area;
    }
    public double areaOfTriangle() {
        System.out.print("introdueix la base de triangle: ");
        double base = scn.nextDouble();
        System.out.print("introdueix l'altura: ");
        double altura = scn.nextDouble();
        area = 0.5 * base * altura;
        return area;
    }

    public double areaOfTrapezoid() {
        System.out.print("introdueix la base major: ");
        double base_major = scn.nextDouble();
        System.out.print("introdueix la base menor: ");
        double base_menor = scn.nextDouble();
        System.out.print("introdueix l'altura: ");
        double altura = scn.nextDouble();
        area = ((base_major + base_menor) * altura)/2;
        return area;
    }

    public double areaOfRhombus() {
        System.out.print("introdueix la diagonal_major: ");
        double diagonal_major = scn.nextDouble();
        System.out.print("introdueix la diagonal_menor: ");
        double diagonal_menor = scn.nextDouble();
        area = (diagonal_major * diagonal_menor) / 2;
        return area;
    }

    public double areaOfParallelogram() {
        System.out.print("introdueix la base de parallelogram: ");
        double base = scn.nextDouble();
        System.out.print("introdueix l'altura: ");
        double altura = scn.nextDouble();
        area = base * altura;
        return area;
    }

}
