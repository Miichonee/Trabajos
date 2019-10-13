package TrabajoPracticNro8;

public interface Vehiculo
{
    int VelMaxima=120;

    String getVehiculo();
    void Acelerar();
    void Frenar(double x);
    void Frenar(double x, double y);
    String Plazas();

}
