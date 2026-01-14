public class geo {
    public static void inici() {
        stars(3);
        stars(5);

        System.out.println("->-<->-<->-<->-<->-<->-<->-<->-<-");
        character('*', 5);
        character('#', 3);
        character('A', 4);

        System.out.println("->-<->-<->-<->-<->-<->-<->-<->-<-");
        choloo(10);
        choloo(5);
        choloo(10);
        System.out.println("->-<->-<->-<->-<->-<->-<->-<->-<-");
    }

    public static void stars(int num) {
        for (int i = 0; i < num; i++) {
            System.out.print('*');
        }
        System.out.println();
    }

    public static void character(char c, int num) {
        for (int i = 0; i < num; i++) {
            System.out.print(c);
        }
        System.out.println();
    }

    public static void choloo(int num){
        for (int i = 0; i < num; i++) {
            System.out.print('!');
        }
        System.out.println();
    }

    public static void main(String[] args) {
        inici();
    }
}
