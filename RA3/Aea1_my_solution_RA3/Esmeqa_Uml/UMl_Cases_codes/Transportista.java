public class Transportista {
    private String nom;
    private String telefon;
    private int numLlincencia;

    public Transportista(String nom, String telefon, int numLlincencia) {
        this.nom = nom;
        this.telefon = telefon;
        this.numLlincencia = numLlincencia;
    }

    public String getnom() { return nom; }
    public void setnom(String nom) { this.nom = nom; }

    public String gettelefon() { return telefon; }
    public void settelefon(String telefon) { this.telefon = telefon; }

    public int getnumLlincencia() { return numLlincencia; }
    public void setnumLlincencia(int numLlincencia) { this.numLlincencia = numLlincencia; }

    public void assignarEncarrec(Encarrec e) {}
    public void anulLarEncarrec(Encarrec e) {}
}
