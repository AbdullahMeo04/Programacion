import java.util.Scanner;

class find_the_number {
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		System.out.print("get the number:");
		int number = scn.nextInt();

		int i = 1;
		while (i <= number){
			System.out.println(i);
			i = i * i;
			i++;

		}
	}
}