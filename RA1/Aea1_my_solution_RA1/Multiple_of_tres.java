import java.util.Scanner;

class Multiple_of_tres {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.print("Enter number: ");
		int numero = scn.nextInt();
		int addition = 0;

		for (int i = 0; i <= numero ; i++) {
			if(i % 3 == 0){
				addition += i;
			System.out.println(i);
			}
		}
		System.out.println("print the sum "+ addition);
	}
}