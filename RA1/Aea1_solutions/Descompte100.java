package AEA1.Basics_IF.AAPR;

import java.util.Scanner;

public class DescompteControlErrors {
    public static void main (String[] args) {
        Scanner lector = new Scanner(System.in);
        float descompteFet = 0;

        System.out.print("Quin és el preu del producte, en euros? ");
        float preu = lector.nextFloat();

        float DESCOMPTE = 8;
        float COMPRA_MIN = 100;
        float DESC_MAXIM = 10;

        if (preu > 0) {
            if (preu >= COMPRA_MIN) {
                descompteFet = preu * DESCOMPTE / 100;
                if (descompteFet > DESC_MAXIM) {
                    descompteFet = DESC_MAXIM;
                }
                preu = preu - descompteFet;
            }
            System.out.println("El preu és de " + preu + " euros.");

        }
        else {
            System.out.println("Preu incorrecte. És negatiu.");
        }
    }
}
