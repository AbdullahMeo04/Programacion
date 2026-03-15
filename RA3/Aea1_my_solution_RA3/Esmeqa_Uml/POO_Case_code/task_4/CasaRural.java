public class CasaRural extends Allotjament {
    private boolean teJardi;
    private boolean tePiscina;

    public CasaRural(String nom, int capacitat, boolean teJardi, boolean tePiscina) {
        super(nom, capacitat);
        this.teJardi = teJardi;
        this.tePiscina = tePiscina;
    }

    public boolean isTePiscina() { return tePiscina; }

    public double calcularPreuPerNit() {
        double price = 150.0;
        if (tePiscina == true) {
            price = price + 50.0;
        }
        return price;
    }

    public String mostrarInformacio() {
        String gardenStatus;
        if (teJardi == true) {
            gardenStatus = "Yes";
        } else {
            gardenStatus = "No";
        }

        String poolStatus;
        if (tePiscina == true) {
            poolStatus = "Yes";
        } else {
            poolStatus = "No";
        }

        return "Rural House: " + getNom() + " (Garden: " + gardenStatus + ", Pool: " + poolStatus + ", Capacity: " + getCapacitat() + ")";
    }
}