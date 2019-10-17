package ParcialLab;

public class Espectadores extends Personas
{
    private String fila;
    private int silla;
    private String tipo="Espectadores";

    public Espectadores(String nombre,int edad,String fila, int silla)
    {
        super(nombre,edad);
        this.fila = fila;
        this.silla= silla;
    }

    public String getFila() {
        return fila;
    }

    public void setFila(String fila) {
        this.fila = fila;
    }

    public int getSilla() {
        return silla;
    }

    public void setSilla(int silla) {
        this.silla = silla;
    }
    public String getButaca()
    {
        return "La silla del espectador es"+silla+"\n Y la fila es"+fila+" ";
    }

    @Override
    public String getTipo()
    {
        return this.tipo;
    }

    public String toString()
    {
        return "El nombre del espectador es "+getNombre()+"\nLa edad del espectador es "+getEdad()+"\nLa fila del Espectador es "+fila+"\nLa silla del espectador es "+silla+"";
    }
}
