package TrabajoPracticNro8;

public class Auto implements Vehiculo
{
    private double VelBase;

    public Auto(double vel)
    {
        this.VelBase = vel;
    }

    public double getVelBase()
    {
        return this.VelBase;
    }

    @Override
    public String getVehiculo()
    {
        return "AUTO:";
    }

    @Override
    public void Acelerar()
    {
        VelBase += 20;

        if (VelBase > VelMaxima) {
            System.out.println("La velocidad maxima ha sido superada.");
        }
        if (VelBase == VelMaxima) {
            System.out.println("La velocidad maxima ha sido alcanzada.");
        }
    }

    @Override
    public void Frenar(double x) {

    }

    @Override
    public void Frenar(double x, double y)
    {
        if (x == y) {
            VelBase -= x;
        }

        if (VelBase < 0) {
            VelBase = 0;
        }

        if (VelBase == x && VelBase == y && x == y && VelBase >= 60) {
            System.out.println("Te reventaste capo");
        }

        if (VelBase == 0) {
            System.out.println("El vehiculo se ha detenido.");
        }
    }
    @Override
    public String Plazas() {
        return "El vehiculo tiene 5 plazas";
    }
}