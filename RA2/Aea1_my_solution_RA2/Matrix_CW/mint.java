//import java.util.Scanner;

public class mint {

    public static void main(String[] args) {

        // int[] arrayEnters = {3,12,18,34,7,11,70};
        // int mida = arrayEnters.length;
        int[] mida = new int[6];
        for (int i = 0; i < mida.length; i++) {
            mida[i] = i + 11;
            /*
             * if (mida[i] % 2 != 0){
             * mida[i] = 0;
             * }
             */
            if (i % 2 == 0) {
                mida[i] = -1;
            }
            System.out.println(mida[i]);
        }
        // ..............................................................

        /*
         * int[] arrayEnter = {1,2,3,4,5};
         * int miida = arrayEnter.length;
         * for (int i = 0; i < mida; i++){
         * int suma = arrayEnter[i] + 10;
         * System.out.println("El resultat de suamr 10 + " + arrayEnter[i] + "= "+
         * suma);
         * }
         * //..............................................................
         * 
         * int[] arrayenter = {10,12,14,16,18};
         * int miiida = arrayenter.length;
         * for (int i = 0; i < mida; i++){
         * int sumar = arrayenter[i] + 10;
         * int samar = arrayenter[i] - 1;
         * System.out.println("El resultat de " + arrayenter[i] + "- 1 = "+ sumar);
         * System.out.println("El resultat de suamr 10 + " + arrayenter[i] + "= "+
         * samar);
         * }
         */
    }
}