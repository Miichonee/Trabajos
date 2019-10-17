package ParcialLab;

public class Empleados extends Personas
{
    private double sueldo;
    private String Tip="Empleado";

    public Empleados(String nombre, int edad,double sueldo)
    {
        super(nombre,edad);
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    public String getTipo()
    {
        return this.Tip;
    }
    public String toString()
    {
        return "El sueldo del empleado es "+sueldo+"\nEl nombre del empleado es "+getNombre()+"\nLa edad del empleado es "+getEdad()+" ";
    }
}
