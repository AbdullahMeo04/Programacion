import java.util.Scanner;

class Area_Of_Shapes {
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter a shape (triangle, circle, trapezoid, rhombus, parallelogram): ");
		String shape = scn.nextLine();
		
		if(shape.equals("triangle")){
			System.out.print("introdueix la base de triangle: ");
			double base= scn.nextDouble();
			System.out.print("introdueix l'altura: ");
			double altura = scn.nextDouble();
			double Area = 0.5 * base * altura;
			System.out.print("area of triangle: " + Area);
		}
		else if (shape.equals("circle")){
			System.out.print("introdueix la radius: ");
			double radius = scn.nextDouble();
			double Area = 3.14 * radius * radius;
			System.out.print("area of circle es: " + Area);
		}
		else if (shape.equals("trapezoid")) {
			System.out.print("introdueix la base major: ");
			double base_major = scn.nextDouble();
			System.out.print("introdueix la base menor: ");
			double base_menor = scn.nextDouble();
			System.out.print("introdueix l'altura: ");
			double altura = scn.nextDouble();
			double Area = ((base_major + base_menor ) * altura) /2;
			System.out.print("area of the trapezoid es: " + Area);
		}
		else if (shape.equals("rhombus")) {
			System.out.print("introdueix la diagonal_major: ");
			double diagonal_major = scn.nextDouble();
			System.out.print("introdueix la diagonal_menor: ");
			double diagonal_menor = scn.nextDouble();
			double Area = (diagonal_major * diagonal_menor)/2;
			System.out.print("Area of rhombus es: " + Area);			
		}
		else if (shape.equals("parallelogram")) {
			System.out.print("introdueix la base de parallelogram: ");
			double base = scn.nextDouble();
			System.out.print("introdueix l'altura: ");
			double altura = scn.nextDouble();
			double Area = base * altura;
			System.out.print("area of parallelogram es: " + Area);
		}
		else {
			System.out.println("INVALID DATA!!!!!!!   INVALID DATA!!!!!!!    INVALID DATA!!!!!!!");
		}
		scn.close();
	}
}