package TrabajoPracticoN9;

public class Naturales extends Numero implements Numeros
{
    private double valor;

    public Naturales(double valor) {
        this.valor = valor;
        this.tipo = "Natural";
    }

    public double getValor() {
        return this.valor;
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
