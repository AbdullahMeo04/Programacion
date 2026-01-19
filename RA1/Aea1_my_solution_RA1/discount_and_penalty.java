import java.util.Scanner;

class Discount_and_penalty {
	public static void main (String[] args) {
		Scanner raw = new Scanner(System.in);

		System.out.println("Enter price: ");
		double price = raw.nextDouble();

		double Final_price;

		if (price >= 100) {
			double discount = price * 8/100;
			Final_price = price - discount;
			System.out.println("S'ha aplicat un descompte del 8%.");
		}
		else if (price <= 30) {
			double  penalty	= price * 2/100;
			Final_price = price + penalty;
			System.out.println("S'ha aplicat un penalització del 2%.");			
		}
		else {
			Final_price = price;
			System.out.println("No hi ha descompte ni penalització.");
		}

		System.out.println("El preu final es: " + Final_price);
		raw.close();
	}
}
