import java.util.Random;
import java.util.Scanner;

public class Guess_Number_3 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		Random r = new Random();

		int r1 = r.nextInt(10);
		int guess = 0;
		int max_tries = 3;
		int tries = 0;



		while (guess != r1 && tries < max_tries) {
			System.out.print("Guess the number?");
			guess = scn.nextInt();
			if (guess != r1) {
		//		int remainings = max_tries - tries;
				System.out.println("YOU FAILED! TRY AGAIN." );
				tries = tries + 1;			
			}
		}
		if(guess == r1){
			System.out.println("CONGRATS!!! YOU GOT IT.");
		}
	}
}