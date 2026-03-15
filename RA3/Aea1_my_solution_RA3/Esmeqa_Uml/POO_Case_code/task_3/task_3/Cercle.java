package task_3;

import java.util.Scanner;

public class Cercle extends Figura {
    private int radi;

    public Cercle() {
        super("cercle");
    }

    public Cercle(int r) {
        super("cercle");
        this.radi = r;
    }

    public int getRadi() {
        return radi;
    }

    public void setRadi(int radi) {
        this.radi = radi;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radi, 2);
    }

    @Override
    public void llegirDades(Scanner sc) {
        System.out.print("Introdueix el radi: ");
        this.radi = sc.nextInt();
    }
}
