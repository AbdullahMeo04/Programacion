package task_3;

import java.util.Scanner;

public class Quadrat extends Figura {
    private int costat;

    public Quadrat() {
        super("quadrat");
    }

    public Quadrat(int r) {
        super("quadrat");
        this.costat = r;
    }

    public int getCostat() {
        return costat;
    }

    public void setCostat(int costat) {
        this.costat = costat;
    }

    @Override
    public double calcularArea() {
        return costat * costat;
    } 

    @Override
    public void llegirDades(Scanner sc) {
        System.out.print("Introdueix el costat del quadrat: ");
        this.costat = sc.nextInt();
    }
}