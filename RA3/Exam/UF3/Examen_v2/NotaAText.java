package UF3.Examen_v2;

public class NotaAText {

    // Param. entr: double nota
    // Param. sort: String descriptive grade
    public String notaAText(double nota) {
        if (nota == 10) {
            return "Excel·lent";
        } else if (nota >= 8) {
            return "Notable";
        } else if (nota >= 6) {
            return "Bé";
        } else {
            return "Suspès";
        }
    }
}