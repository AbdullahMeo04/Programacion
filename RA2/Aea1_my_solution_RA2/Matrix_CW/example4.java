import java.util.Scanner;

public class example4 {

    public static void main(String[] args){

        int[] arrayEnters = new int[8];
        System.out.println("entra 8 nombres enters:");
        Scanner s = new Scanner(System.in);

        char j = 0;

        while (j < arrayEnters.length){
            char words = s.next().charAt(0);
            arrayEnters[j] = words;
            System.out.println("Estic escrivint: " + arrayEnters[j] + " i hauria d'escriure: " + words);
            for (char i = 0; i < arrayEnters.length; ++i) {
            if (arrayEnters[i] == 'a' || 
                arrayEnters[i] == 'e' || 
                arrayEnters[i] == 'i' || 
                arrayEnters[i] == 'o' || 
                arrayEnters[i] == 'u') {
                arrayEnters[i] = '0';
                System.out.println(arrayEnters[i]);
            }
            j++;
        }
        s.close();
        }
    }
}


