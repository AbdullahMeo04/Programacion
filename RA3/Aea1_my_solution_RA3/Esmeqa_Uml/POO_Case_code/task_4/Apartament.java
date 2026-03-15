public class Apartament extends Allotjament {
    private int habitacions;
    private boolean teCuina;

    public Apartament(String nom, int capacitat, int habitacions, boolean teCuina) {
        super(nom, capacitat);
        this.habitacions = habitacions;
        this.teCuina = teCuina;
    }

    public boolean isTeCuina() { return teCuina; }

    public double calcularPreuPerNit() {
        return 100.0 + (habitacions * 10.0);
    }

    public String mostrarInformacio() {
        String kitchenStatus;
        if (teCuina == true) {
            kitchenStatus = "Yes";
        } else {
            kitchenStatus = "No";
        }
        return "Apartment: " + getNom() + " (Rooms: " + habitacions + ", Kitchen: " + kitchenStatus + ", Capacity: " + getCapacitat() + ")";
    }
}