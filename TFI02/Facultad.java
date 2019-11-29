package TFI02;

import java.util.Iterator;
import java.util.Set;

public class Facultad implements Informacion
{
    private String nombre;
    private Set<Carreras> coleccionCarreras;


    public Facultad(String nombre,Set<Carreras> coleccionCarreras)
    {
        this.setNombre(nombre);
        this.setColeccionCarreras(coleccionCarreras);
    }


    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public Set<Carreras> getColeccionCarreras()
    {
        return coleccionCarreras;
    }

    public void setColeccionCarreras(Set<Carreras> coleccionCarreras)
    {
        this.coleccionCarreras = coleccionCarreras;
    }

    public void agregarCarrera(Carreras carrera)
    {
        coleccionCarreras.add(carrera);
        System.out.println("La Carrera " + carrera.getNombre() + " Se agrego satisfactoriamente.");
    }

    public void eliminarCarrera(String nombreCarrera)
    {
        Iterator<Carreras> iterador = coleccionCarreras.iterator();
        while(iterador.hasNext()) {
            String buscado = iterador.next().getNombre();
            if(buscado.equals(nombre)) {
                iterador.remove();
                System.out.println("La carrera " + nombre + " fue eliminada satisfactoriamente.");
            } else {
                System.out.println("No se encontro la carrera a eliminar");
            }
        }
    }



    @Override
    public int VerCantidad()
    {int cantidad = 0;
        for (Carreras carrera : coleccionCarreras) {
            cantidad++;
        }
        return cantidad;
    }

    @Override
    public void listarContenidos()
    {
        System.out.println("Listado de Carreras");
        for(Carreras carrera :coleccionCarreras){
            System.out.println(carrera.toString());
        }

    }
}