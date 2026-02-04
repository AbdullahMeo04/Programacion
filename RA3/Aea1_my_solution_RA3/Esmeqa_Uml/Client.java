public class Client {
    private String nom;
    private String adreca;
    private String telefono;
    private String e_mail;

    public Client(String nom, String adreca, String telefon, String e_mail){
        this.nom = nom;
        this.adreca = adreca;
        this.telefon = telefon;
        this.e_mail = e_mail;    
    }
    public String getnom(){return nom;}
    public void setnom(String nom) {this.nom = nom;}
    
    public String getadreca(){return adreca;}
    public void setadreca(String adreca) {this.adreca = adreca;}
    
    public String gettelefon(){return telefon;}
    public void settelefon(String telefon) {this.telefon = telefon;}
    
    public String gete_mail(){return e_mail;}
    public void sete_mail(String e_mail) {this.e_mail = e_mail;}

    public void assingnarEncarrec(Encarrec e){}
    public void anullarEncarrec(Encarrec e){}
}
