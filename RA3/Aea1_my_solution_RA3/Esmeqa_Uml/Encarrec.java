public class Encarrec {
    private int dia;
    private int mes;
    private int hora;
    private int minuts;

    public Encarrec(int dia, int mes, int hora, int minuts) {
        this.dia = dia;
        this.mes = mes;
        this.hora = hora;
        this.minuts = minuts;
    }

    public int getdia() { return dia; }
    public void setdia(int dia) { this.dia = dia; }

    public int getmes() { return mes; }
    public void setmes(int mes) { this.mes = mes; }

    public int gethora() { return hora; }
    public void sethora(int hora) { this.hora = hora; }

    public int getminuts() { return minuts; }
    public void setminuts(int minuts) { this.minuts = minuts; }

    public void afegirProducte(Peticio p) {}
    public void eliminarProducte(Peticio p) {}
}
