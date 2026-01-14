import java.util.Scanner;

class table_de_n_numbers {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.print("number Multiplication talbe: ");

		if (scn.hasNextInt()) {
			int number = scn.nextInt();
			for (int i=1; i<=number; i++) {
				System.out.println("La Taula del "+i);
				for (int j=10; j>=1; j--) {
					int multiplication= i * j;
					System.out.println(i+ " * " + j+ " = " + multiplication);
				}
			}
		}
		else{
			System.out.print("please put some number.");
		}
	}
}