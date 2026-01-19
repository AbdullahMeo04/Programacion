import java.util.Scanner;

public class Switch_case {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("put the dia:");
		int dia = s.nextInt();

		switch (dia) {
			case 1:
				System.out.println("Dilluns");
				break;
			case 2:
				System.out.println("Dimarts");
				break;

			case 3:
				System.out.println("Dimecres");
				break;

			case 4:
				System.out.println("Dijous");
				break;

			case 5:
				System.out.println("Divendres");
				break;

			case 6:
				System.out.println("Dissabte");
				break;

			case 7:
				System.out.println("Diumenge");
				break;
			default:
				System.out.println("Numero de dia incorrecte");
		}
	}
}