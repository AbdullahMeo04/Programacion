public class Manager extends Employee {
    private int numTrabajadores;

    public Manager(String nombre, String direction, double salario, int numTrabajadores){
        super(nombre, direction, salario, "Manager");
        this.numTrabajadores = numTrabajadores;
    }

    public int getnumTrabajadores(){
        return numTrabajadores;
    }

    public void setnumTrabajadores(int numTrabajadores){
        this.numTrabajadores = numTrabajadores;
    }

    public double calcularBonus(){
        return this.salario * 0.15;
    }

    public void gestionProyesto(){
        System.out.println(getnombre() + " is managing the project.");
    }
}
