package TFI02;

public class Profesor extends Persona
{
    private double basico;
    private int antiguedad;

    public Profesor(String Apellido, String Nombre, int Legajo)
    {
        super(Apellido, Nombre, Legajo);
    }
    //(10*b/100*ant)+b

    public double calcularSueldo()
    {
        double resultado=0;

        resultado = ((10*basico)/100)*(antiguedad)+basico;

        return resultado;
    }

    @Override
    public String toString() {
        return "El sueldo del profesor es: "+calcularSueldo();
    }
}
