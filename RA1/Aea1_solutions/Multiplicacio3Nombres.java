package AEA1.Basics_IF.AAPR;

import java.util.Scanner;

public class Multiplicacio3Nombres {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double primerReal = 0, segonReal = 0, tercerReal = 0, resultat = 0;
        System.out.println("Anem a multiplicar tres nombres reals");
        System.out.print("Escriu un nombre i pitja la tecla de retorn: ");

        primerReal = lector.nextDouble();
        System.out.print("Torna a fer−ho: ");
        segonReal = lector.nextDouble();
        System.out.print("I un altre cop: ");
        tercerReal = lector.nextDouble();

        resultat = primerReal * segonReal * tercerReal;
        System.out.println("La multiplicació dels valors és " + resultat + ".");
    }
}
