public class Main {
    public static void main(String[] args) {

        // Estudiant estudian1 = new Estudiant("01", 22,"AAAAA", "BBBBBB", "CCCCCCC", "DDDDDDD", 5);
        Estudiant estudian2 = new Estudiant("01", 22,"AAAAA", "BBBBBB");

        // System.out.println(estudian1.getNom());
        System.out.println(estudian2.getId());
        System.out.println(estudian2.getEdat());
        System.out.println(estudian2.getNom());
        System.out.println(estudian2.getAssignatures());


        estudian2.setAdreca("May000");
        System.out.println(estudian2.getAdreca());

        System.out.println("---------------------------------------------------------------------------------");
        Persona persona1 = new Persona("4", 45, "Mayo", "Rajpoot", "Besos");
        System.out.println(persona1.getId());
        System.out.println(persona1.getEdat());
        System.out.println(persona1.getNom());
        System.out.println(persona1.getAdreca());
        System.out.println(estudian2.getAssignatures());
        System.out.println(estudian2.getAdreca());
        


    }

    @Override
    public String toString() {
        return "Main []";
    }
}