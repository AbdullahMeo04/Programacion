import java.util.Scanner;

public class dinamica{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		double discount;
		double max_discount = 15;
		double actual_price;
		double sum = 0;

		System.out.println("put the value of the product.");
		for (int i=1;i<6 ;i++ ) {
			double user_price = scn.nextDouble();
			if (user_price > 50) {
				discount = user_price * 0.06;
				System.out.println("precio discount" + discount);
					if (discount>15) {
						discount = max_discount;
					}
				actual_price = user_price - discount;
				System.out.println("Actual price -> discount: "+ actual_price);
			} else {
				actual_price = user_price;
				System.out.println("print price -> without discount "+ actual_price);
			}
//	System.out.println("Price for item "+i+" es "+ user_price);
			sum = sum + actual_price;
		}
		System.out.print("\nprint sum; "+ sum);
		scn.close();
	}
}



















/*		Scanner scn  = new scanner(System.in);
		double price;
		double final_prize;
		double discount;
		double sum = 0;
		double discount_maxima = 15;
		Int i = 1;

If (price > 0){	
	While(i < 6){
		System.out.println(“Put the price of the product: ”);
			price = Scn.Nextint();
	If(price > 50) {
			    System.out.println(“discount apply: ”);
			    discount = price * 0.06;
			        If (discount>15){
			            discount =  discount_maxima;
			        }
			}
		price = price + discount;
		System.out.print(“price of product ”+ i +” es: ”);
		System.out.println(price);
		sum = sum + price;
		i++;
}
}

	System.out.println(“the final price: ”);
	final_price = sum;
	System.out.println(final_price);
	}
}
*/