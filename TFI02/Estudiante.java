package TFI02;

public class Estudiante extends Persona
{
    public Estudiante(String Apellido, String Nombre, int Legajo)
    {
        super(Apellido, Nombre, Legajo);
    }


    @Override
    public String toString()
    {
        return "El nombre del estudiante es"+getNombre()+"El Apellido del etudiante es "+getApellido()+"El legajo del estudiante es "+getLegajo()+" ";
    }
}
