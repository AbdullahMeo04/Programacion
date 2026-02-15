public class Persona{
    private String Id;
    private int Edat;
    private String Nom;
    private String Cognom;
    private String Adreca;

    public Persona(String Id, int Edat, String Nom, String Cognom, String Adreca){
        this.Id = Id;
        this.Edat = Edat;
        this.Nom = Nom;
        this.Cognom = Cognom;
        this.Adreca = Adreca;
    }
    
    public Persona(String Id, int Edat, String Nom, String Cognom){
        this.Id = Id;
        this.Edat = Edat;
        this.Nom = Nom;
        this.Cognom = Cognom;
    }
    
    public Persona(String Id, int Edat, String Nom){
        this.Id = Id;
        this.Edat = Edat;
        this.Nom = Nom;
    }
    
    public Persona(String Id, int Edat){
        this.Id = Id;
        this.Edat = Edat;
    }

    public Persona(String Id){
        this.Id = Id;
    }

    public String getId(){return Id;}
    public void setId(String Id){ this.Id = Id;}

    public int getEdat(){return Edat;}
    public void setEdat(int Edat){this.Edat = Edat;}

    public String getNom(){return Nom;}
    public void setNom(String Nom){this.Nom = Nom;}

    public String getCognom(){return Cognom;}
    public void setCognom(String Cognom){this.Cognom = Cognom;}

    public String getAdreca(){return Adreca;}
    public void setAdreca(String Adreca){this.Adreca = Adreca;}

}