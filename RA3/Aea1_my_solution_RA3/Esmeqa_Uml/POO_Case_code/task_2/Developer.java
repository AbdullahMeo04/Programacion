public class Developer extends Employee {
    private String lenguajeProgramacion;

    public Developer(String nombre, String direction, double salario, String lenguajeProgramacion){
        super(nombre, direction, salario, "Developer");
        this.lenguajeProgramacion = lenguajeProgramacion;
    }

    public String getlenguajeProgramacion(){
        return lenguajeProgramacion;
    }

    public void setlenguajeProgramacion(String lenguajeProgramacion){
        this.lenguajeProgramacion = lenguajeProgramacion;
    }

    public double calcularBonus(){
        return this.salario * 0.10;
    }

    public void escribirCodigo(){
        System.out.println(getnombre() + " is writing code in " + lenguajeProgramacion);
    }
}
