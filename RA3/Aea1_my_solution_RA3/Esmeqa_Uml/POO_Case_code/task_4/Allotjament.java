public abstract class Allotjament {
    private String nom;
    private int capacitat;
    private boolean disponible;

    public Allotjament(String nom, int capacitat) {
        this.nom = nom;
        this.capacitat = capacitat;
        this.disponible = true;
    }

    public String getNom() { return nom; }
    public int getCapacitat() { return capacitat; }
    public boolean isDisponible() { return disponible; }

    public abstract double calcularPreuPerNit();
    public abstract String mostrarInformacio();

    public boolean reservar() {
        if (disponible == true) {
            disponible = false;
            return true;
        } else {
            return false;
        }
    }

    public void alliberar() {
        disponible = true;
    }
}