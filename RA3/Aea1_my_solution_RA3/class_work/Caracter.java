public class Caracter {

    public static void inici() {
        character('*', 5);
        character('#', 3);
        character('A', 4);
    }

    public static void character(char c, int num) {
        for (int i = 0; i < num; i++) {
            System.out.print(c);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        inici();
    }
}
