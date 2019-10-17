package ParcialLab;

import java.util.ArrayList;

public class Salas
{
    private int capacidad;
    private String pelicula;
    private String Nombre;
    private ArrayList<Espectadores> espectadores = new ArrayList<>();

    public Salas(int capacidad, String Nombre,String pelicula)
    {
        this.capacidad= capacidad;
        this.Nombre = Nombre;
        this.pelicula = pelicula;
    }

    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public ArrayList<Espectadores> getEspectadores() {
        return espectadores;
    }

    public void setEspectadores(ArrayList<Espectadores> espectadores) {
        this.espectadores = espectadores;
    }
    public String toString()
    {
        return "El nombre de la pelicula es "+pelicula+"\nLa capacidad de la sala es "+capacidad+"\nEl de la sala es "+Nombre+" ";
    }
}
