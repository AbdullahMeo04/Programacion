import java.util.Scanner;

public class AA2_Mitjana_Valors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quants valors vols introduir? ");
        int n = sc.nextInt();
        double s = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            s += sc.nextDouble();
        }
        System.out.printf("La mitjana és: %.2f%n", s / n);
        sc.close();
    }
}