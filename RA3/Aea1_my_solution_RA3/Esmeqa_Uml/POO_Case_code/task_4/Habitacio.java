public class Habitacio extends Allotjament {
    private int numLlits;

    public Habitacio(String nom, int numLlits) {
        super(nom, numLlits);
        this.numLlits = numLlits;
    }

    public double calcularPreuPerNit() {
        double price = 50.0;
        if (numLlits > 2) {
            price = price + ((numLlits - 2) * 20.0);
        }
        return price;
    }

    public String mostrarInformacio() {
        return "Room: " + getNom() + " (Beds: " + numLlits + ", Capacity: " + getCapacitat() + ")";
    }
}