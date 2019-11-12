package TrabajoPracticoN9;

public class Complejos extends Numero implements Numeros
{
    private double valor;
    private double valor2;

    public Complejos(double a, double b) {
        this.valor = a;
        this.valor2 = b;
        this.tipo = "Complejo";
    }

    public double getValor() {
        return valor;
    }

    public double getValor2() {
        return valor2;
    }

    @Override
    public void Suma(Numero n1) {

    }

    @Override
    public void Resta(Numero n1) {

    }

    @Override
    public void Division(Numero n1) {

    }

    @Override
    public void Multiplicar(Numero n1) {

    }
}
