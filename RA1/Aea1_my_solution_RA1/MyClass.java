import java.util.Scanner;

class MyClass {
	public static void main (String[] args) {
		Scanner num1 = new Scanner(System.in);
		Scanner num2  = new Scanner(System.in);
		Scanner num3 = new Scanner(System.in);
		System.out.println("Enter Numbers:");
		int userNum1 = num1.nextInt();
		int userNum2 = num2.nextInt();
		int userNum3 = num3.nextInt();
		System.out.println("result is: " +  userNum1 * userNum2 * userNum3);
	}
}