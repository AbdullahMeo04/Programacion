public class Employee {
    private String nombre;
    private String direction;
    protected double salario;
    private String puestoTrabajo;

    public Employee(String nombre, String direction, double salario, String puestoTrabajo) {
        this.nombre = nombre;
        this.direction = direction;
        this.salario = salario;
        this.puestoTrabajo = puestoTrabajo;
    }

    public String getnombre() {
        return nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public String getdirection() {
        return direction;
    }

    public void setdirection(String direction) {
        this.direction = direction;
    }

    public double getsalario() {
        return salario;
    }

    public void setsalario(double salario) {
        this.salario = salario;
    }

    public String getpuestoTrabajo() {
        return puestoTrabajo;
    }

    public void setpuestoTrabajo(String puestoTrabajo) {
        this.puestoTrabajo = puestoTrabajo;
    }

    public double calcularBonus() {
        return 0;
    }

    public String generarReport() {
        return "Performance Report for " + nombre + "\n" +
                "Post: " + puestoTrabajo + "\n" +
                "Salary: " + salario + "\n" +
                "Bonus: " + calcularBonus();
    }
}
