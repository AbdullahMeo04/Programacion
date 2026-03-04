package task_3;

import java.util.Scanner;

public class Trapezi extends Figura {
    private int a;
    private int b;
    private int h;

    public Trapezi() {
        super("trapezi");
    }

    public Trapezi(int a, int b, int h) {
        super("trapezi");
        this.a = a;
        this.b = b;
        this.h = h;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
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
        return ((a + b) / 2.0) * h;
    }

    @Override
    public void llegirDades(Scanner sc) {
        System.out.print("Introdueix la base menor (a): ");
        this.a = sc.nextInt();
        System.out.print("Introdueix la base major (b): ");
        this.b = sc.nextInt();
        System.out.print("Introdueix l'altura (h): ");
        this.h = sc.nextInt();
    }
}