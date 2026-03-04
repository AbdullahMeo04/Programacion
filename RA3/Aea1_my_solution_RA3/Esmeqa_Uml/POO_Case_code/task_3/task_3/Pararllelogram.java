package task_3;

import java.util.Scanner;

public class Pararllelogram extends Figura {
    private int b;
    private int h;

    public Pararllelogram() {
        super("paral·lelogram");
    }

    public Pararllelogram(int b, int h) {
        super("paral·lelogram");
        this.b = b;
        this.h = h;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    @Override
    public double calcularArea() {
        return b * h;
    }

    @Override
    public void llegirDades(Scanner sc) {
        System.out.print("Introdueix la base: ");
        this.b = sc.nextInt();
        System.out.print("Introdueix l'altura: ");
        this.h = sc.nextInt();
    }
}