import java.util.Scanner;

public class exercise01 {

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int sumar = 0;
        int even;
        int[] arrayenters = {14,21,32,41,54};
        System.out.print("write doen the Scn number: ");
        int mida = scn.nextInt();
        for (int i = 0; i < mida; i++){
            if(arrayenters[i] % 2 == 0){
                even = arrayenters[i];
                System.out.println("El numero even es : " + even);
                sumar += arrayenters[i];
            }

                System.out.println("El resultat de " + arrayenters[i]);

            System.out.println("La suma dels numeros evens es: " + sumar);    
        }
        scn.close();
    }
}