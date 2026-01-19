import java.util.Random;
import java.util.Scanner;

public class Guess_Number {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		Random r = new Random();

		int r1 = r.nextInt(10);
		int guess = 0;

		while (guess != r1) {
			System.out.print("Guess the number?");
			guess = scn.nextInt();
			if (guess != r1) {
				System.out.print("YOU FAILED! TRY AGAIN.");				
			}
		}
		System.out.println("CONGRATS!!! YOU GOT IT.");
	}
}







/*		while (guess != r1){
			System.out.print("Guess the value?");
			guess = scn.nextInt();
			}*/	
/*			if (guess < r1) {
				System.out.println("Incorrect!!! TRY AGAIN.");
			}
			else if (guess > r1) {
				System.out.println("Incorrect!!! TRY AGAIN.");
			}
			else {
				System.out.println("CONGRATS!!! YOU GOT IT.");
			}*/
//		scn.close();