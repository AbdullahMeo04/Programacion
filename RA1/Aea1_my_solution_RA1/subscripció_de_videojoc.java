import java.util.Scanner;

class subscripció_de_videojoc {
	public static void main (String[] args) {
		Scanner option = new Scanner(System.in);
		System.out.print("introdueix el tipus de subscripcio (1-4): ");
		
		int Num = option.nextInt();

		switch (Num){
			case(1):
				System.out.println("Has escollit la subcriptio Basica.");
				break;
			case(2):
				System.out.println("Has escollit la subcriptio Estandard.");
				break;
			case(3):
				System.out.println("Has escollit la subcriptio Premium.");
				break;
			case(4):
				System.out.println("Has escollit la subcriptio VIP.");
				break;
			default:
				System.out.println("Opcio no Valida.");
				break;
		}
	}
}

