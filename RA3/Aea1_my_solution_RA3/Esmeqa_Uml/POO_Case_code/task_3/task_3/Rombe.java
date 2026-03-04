package task_3;

import java.util.Scanner;

public class Rombe extends Figura {
    private int dM; 
    private int dm; 

    public Rombe() {
        super("rombe");
    }

    public Rombe(int dM, int dm) {    
        super("rombe");
        this.dM = dM;
        this.dm = dm;
    }

    public int getDM() {
        return dM;
    }

    public void setDM(int dM) {
        this.dM = dM;
    }

    public int getDm() {
        return dm;
    }

    public void setDm(int dm) {
        this.dm = dm;
    }

    @Override
    public double calcularArea() {
        return (dM * dm) / 2.0;
    } 

    @Override
    public void llegirDades(Scanner sc) {
        System.out.print("Introdueix la diagonal major: ");
        this.dM = sc.nextInt();
        System.out.print("Introdueix la diagonal menor: ");
        this.dm = sc.nextInt();
    }
}