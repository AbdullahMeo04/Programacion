public class Main {

    public static void main(String[] args) {
        Programmer prg = new Programmer("mike", "mike@MC.gmail.com", 2100);
        Manager mgr = new Manager("Sarah", "sarah@gmail.com", 3500, 10);
        Developer dev = new Developer("Alex", "alex@gmail.com", 2000, "Java");

        prg.debug();
        mgr.gestionProyesto();
        dev.escribirCodigo();

        System.out.println("\n" + prg.generarReport());
        System.out.println("\n" + mgr.generarReport());
        System.out.println("\n" + dev.generarReport());
    }
}
