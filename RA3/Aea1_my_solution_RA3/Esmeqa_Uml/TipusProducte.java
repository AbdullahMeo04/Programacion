public class TipusProducte {
    private String nom;
    private int codiIdentificardor;
    private double preu;
    private int estoc;
    private boolean aLaVenda;

    public TipusProducte(String nom, int codiIdentificardor, double preu, int estoc, boolean aLaVenda) {
        this.nom = nom;
        this.codiIdentificardor = codiIdentificardor;
        this.preu = preu;
        this.estoc = estoc;
        this.aLaVenda = aLaVenda;
    }

    public String getnom() { return nom; }
    public void setnom(String nom) { this.nom = nom; }

    public int getcodiIdentificardor() { return codiIdentificardor; }
    public void setcodiIdentificardor(int codiIdentificardor) { this.codiIdentificardor = codiIdentificardor; }

    public double getpreu() { return preu; }
    public void setpreu(double preu) { this.preu = preu; }

    public int getestoc() { return estoc; }
    public void setestoc(int estoc) { this.estoc = estoc; }

    public boolean getaLaVenda() { return aLaVenda; }
    public void setaLaVenda(boolean aLaVenda) { this.aLaVenda = aLaVenda; }
}
