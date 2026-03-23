package UF2.Examen_v2;

import java.util.Scanner;
import java.util.Arrays;

public class Examen2 {

    public static double[] notes = new double[50];
    public int MARCA_NOTES = -1;
    public int NUM_NOTES = 0;
    public String MARCA_FI = "fi";
    private boolean fi = false;
    public double max = 0;
    public double min = 10;
    public double mitj = 0;

    private final CalculArrays calculador = new CalculArrays();
    private final CercaDicotomica cerca = new CercaDicotomica();
    private final NotaAText transformar = new NotaAText();

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Examen2 programa = new Examen2();
        programa.inici();
    }

    public void inici(){
        PreguntarNotes();
        ImprimirArrayNotes();

        Arrays.sort(notes, 0, NUM_NOTES);

        while (!fi) {
            MostrarMenu();
            TractarOpcio();
        }
    }

    private void PreguntarNotes() {
        System.out.println("Introdueix notes (0-10). Escriu -1 per acabar:");
        double nota;
        do {
            nota = sc.nextDouble();
            if (nota != MARCA_NOTES) {
                notes[NUM_NOTES] = nota;
                NUM_NOTES++;
            }
        } while (nota != MARCA_NOTES);
    }

    private void MostrarMenu() {
        System.out.println("\nBenvinguda al càlcul de notes de classe.");
        System .out.println("----------------------------------------");
        System.out.println("[MAX] Saber la nota màxima de classe");
        System.out.println("[MIN] Saber la nota mínima de classe");
        System.out.println("[MIT] Saber la nota mitjana de classe");
        System.out.println("[FI] Sortir.");
        System.out.print("Opció: ");
    }

    private void ImprimirArrayNotes() {
        System.out.println("\nNotes introduïdes:");
        for (int i = 0; i < NUM_NOTES; i++) {
            System.out.print(notes[i] + " ");
        }
        System.out.println();
    }

    private void TractarOpcio() {
        String opcio = sc.next();

        switch (opcio.toUpperCase()) {
            case "MAX":
                max = calculador.calcularMaxim(notes);
                ImprimirResultat(max, PrepararSortida(max), "MAX");
                // MirarSiAlgu8();
                break;

            case "MIN":
                min = calculador.calcularMinim(notes);
                ImprimirResultat(min, PrepararSortida(min), "MIN");
                // MirarSiAlgu8();
                break;

            case "MIT":
                mitj = calculador.calcularMitjana(notes, NUM_NOTES);
                ImprimirResultat(mitj, PrepararSortida(mitj), "MIT");
                // MirarSiAlgu8();
                break;

            case "FI":
                fi = true;
                System.out.println("Sortir del programa...");
                break;

            default:
                System.out.println("Opció no vàlida.");
        }
    }

    private String PrepararSortida(double valor) {
        return transformar.notaAText(valor);
    }

    // private boolean MirarSiAlgu8() {
    // }

    private void ImprimirResultat(double valornota, String text, String opcio) {
        String opcioescollida = "";
        if (opcio.equalsIgnoreCase("MAX")){
            opcioescollida = "màxim";
        }
        else if (opcio.equalsIgnoreCase("MIN")){
            opcioescollida = "mínim";
        }
        else {
            opcioescollida = "mitjà";
        }
        System.out.print("\n" +"El valor " + opcioescollida +" de l'array que has escrit és " + valornota);
        System.out.println(" que equival a un " + text + ".\n");
    }
}