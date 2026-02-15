public class Programmer extends Employee {

    public Programmer(String nombre, String direction, double salario){
        super(nombre, direction, salario, "Programmer");
    }

    public double calcularBonus(){
        return this.salario * 0.12;
    }

    public void debug(){
        System.out.println(getnombre() + "is debugging the system.");
    }
}
