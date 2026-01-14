package AEA1.Basics_IF.AAPR;

import java.util.Scanner;

public class Descompte15_95 {
    public static void main (String[] args) {
        float DESCOMPTE = 15;
        float COMPRA_MIN = 95;
        Scanner lector = new Scanner(System.in);

        System.out.print("Quin és el preu del producte, en euros? ");
        float preu = lector.nextFloat();
        if (preu > 0){
            if (preu >= COMPRA_MIN) {
                //PAS I
                float descompteFet = preu * DESCOMPTE / 100;
                preu = preu - descompteFet;
            }
            System.out.println("El preu final per pagar és de " + preu + " euros.");
        }
        else {
            System.out.println("Preu incorrecte.");
        }

    }
}
