import java.util.Scanner;

class multiplication_table{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.print("write the number for Multiplication talbe: ");
		int taula = scn.nextInt();

		for (int i=10; i>=1; i--) {
			int multiplication= taula * i;
			System.out.println(taula+ " * " + i+ " = " + multiplication);
		}
		System.out.print("Displayed above Multiplication table of "+taula);
		scn.close();
	}
}