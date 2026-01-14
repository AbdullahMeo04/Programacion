import java.util.Scanner;

class Discount_ep {
	public static void main (String[] args) {
		Scanner precio = new Scanner(System.in);
		
		System.out.println("Enter prices:");
		double price = precio.nextDouble();

		double Final_price;

		if (price >= 95) {
			double discount = (price * 15/100);
			Final_price = (price - discount);
			System.out.println("S'ha aplicat el descompt.");
		}
		else {
			Final_price = price;
			System.out.println("No s'ha aplicat descompte (preu entre 80 i 94).");
		}

		System.out.println("El preu final es: " + Final_price);
		precio.close();
	}
}