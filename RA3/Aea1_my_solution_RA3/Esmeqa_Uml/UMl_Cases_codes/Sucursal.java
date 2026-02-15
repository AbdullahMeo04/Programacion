public class Sucursal {
    private String nom;
    private String adreca;
    private String telefon;
    private String e_mail;

public Sucursal(String nom, String adreca, String telefon, String e_mail){
    this.nom = nom;
    this.adreca = adreca;
    this.telefon = telefon;
    this.e_mail = e_mail;
}
public String getnom(){
    return nom;
}
    public void setname(String nom){
        this.nom = nom;
    }
public String getadreca(){
    return adreca;
}
    public void setadreca(string adreca){
        this.adreca = adreca;
    }
public String gettelefon(){
    return telefon;
}
    public void settelefon(string telefon){
        this.telefon = telefon;
    }
public String getne_mail(){
    return e_mail;
}
    public void sete_mail(string e_mail){
        this.e_mail = e_mail;
    }
    public void descansa(Transportista t){}
    public void treballa(Transportista t){}
    public void altaClient(Client c){}
    public void baixaClient(Client c){}
    public void altaEncarrec(Client c, Transportista t, Encarrec e){}
    public void anulLaEncarrac(Encarrec e){}
}
