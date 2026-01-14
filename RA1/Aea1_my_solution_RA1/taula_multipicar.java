import java.util.Scanner;

class taula_multipicar {
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		System.out.print("Quina taula de multipicar vols? ");
		int i = scn.nextInt();
		int j = 1;
		while(j<=10){
			System.out.println(j * i);
			j++;
		}
	}
}