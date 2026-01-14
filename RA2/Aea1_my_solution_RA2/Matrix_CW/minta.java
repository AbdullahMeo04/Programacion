//import java.util.Scanner;

public class minta {

    public static void main(String[] args) {

        // int[] arrayEnters = {3,12,18,34,7,11,70};
        // int mida = arrayEnters.length;
        /*
         * if (mida[i] % 2 != 0){
         * mida[i] = 0;
         * }
         */
        int[] mida = new int[6];
        for (int i = 0; i < mida.length; i++) {
            mida[i] = i + 11;
            if (i % 2 == 0) {
                mida[i] = -1;
            }
            System.out.println(mida[i]);
        }
    }
}