package ParcialLab;

public class Acomodadores extends Empleados implements ParaAcomodadores
{
    private String Sala;
    private String tipp="Acomodador";

    public Acomodadores(String nombre, int edad,double sueldo) {
        super(nombre, edad,sueldo);

    }
    public String getTipo()
    {
        return this.tipp;
    }

    @Override
    public String getSala() {
        return null;
    }

    @Override
    public void setSala(String Sala)
    {
    this.Sala = Sala;
    }
    public String toString()
    {
        return "El nombre de Acomodador es "+getNombre()+"\nLa edad del Acomoddador es "+getEdad()+"\nEl sueldo es "+getSueldo()+"\nEl sueldo del Acomodador es "+getSueldo()+" ";
    }
}
