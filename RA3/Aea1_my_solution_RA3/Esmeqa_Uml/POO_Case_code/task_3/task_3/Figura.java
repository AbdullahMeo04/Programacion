package task_3;

import java.util.Scanner;

public abstract class Figura {
    protected String figura;
    protected int id;
    protected static int comptadorId = 1;

    public Figura(String figura) {
        this.figura = figura;
        this.id = seguentFigura();
    }

    public Figura() {
        this.figura = "";
        this.id = seguentFigura();
    }

    public String getFigura() {
        return figura;
    }

    public void setFigura(String figura) {
        this.figura = figura;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void imprimirDades() {
        System.out.println("La figura amb id " + id + " és un " + figura + ".");
        System.out.println("L'àrea del " + figura + " és: " + calcularArea());
        System.out.println("--------------------");
    }

    public abstract double calcularArea();

    public abstract void llegirDades(Scanner sc);

    public static int seguentFigura() {
        return comptadorId++;
    }
}