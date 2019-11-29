package TFI02;

public abstract class Persona
{
    private String Nombre;
    private String Apellido;
    private int Legajo;


    public Persona(String Apellido, String Nombre, int Legajo)
    {
        this.Apellido = Apellido;
        this.Legajo = Legajo;
        this.Nombre = Nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public int getLegajo() {
        return Legajo;
    }

    public void setLegajo(int legajo) {
        Legajo = legajo;
    }

    public abstract String toString();
}
