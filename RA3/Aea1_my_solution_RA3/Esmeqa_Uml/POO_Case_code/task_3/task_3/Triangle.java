package task_3;

import java.util.Scanner;

public class Triangle extends Figura {
    private int base;
    private int a;

    public Triangle() {
        super("triangle");
    }

    public Triangle(int base, int a) {    
        super("triangle");
        this.base = base;
        this.a = a;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public double calcularArea() {
        return (base * a) / 2.0;
    }

    @Override
    public void llegirDades(Scanner sc) {
        System.out.print("Introdueix la base del triangle: ");
        this.base = sc.nextInt();
        System.out.print("Introdueix l'altura del triangle: ");
        this.a = sc.nextInt();
    }
}