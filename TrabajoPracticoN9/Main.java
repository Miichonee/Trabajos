package TrabajoPracticoN9;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        ArrayList<Numero> numeros = new ArrayList<>();

        int cont = 0;
        double x = 0;
        double y = 0;
        String a;
        int b = 0;
        int contN = 0;
        int contC = 0;
        String seleccion;

        do {

            System.out.println("Elija el numero a crear (Ingrese 'e' para inicializar operaciones):");
            System.out.println("\n1.Natural.\n");
            System.out.println("2.Complejo.");
            System.out.println("\nIngrese opcion :"); a = sc.next();

            if (a.equals("e")) {
                break;
            }

            b = Integer.parseInt(a);

            switch (b) {
                case 1: {
                    System.out.print("Ingrese un numero: ");
                    x = sc.nextDouble();

                    numeros.add(new Naturales(x));
                    contN++;

                    break;
                }
                case 2: {
                    System.out.print("Ingrese primer valor: ");
                    x = sc.nextDouble();
                    System.out.print("Ingrese segundo valor: ");
                    y = sc.nextDouble();

                    numeros.add(new Complejos(x, y));
                    contC++;

                    break;
                }
                default: {
                    break;
                }
            }
        } while (b != 5);

        do {
            System.out.println ("\nQue operacion desea realizar: ");
            System.out.println ("\n1.Sumar Naturales");
            System.out.println ("2.Listar Naturales");
            System.out.println ("\n3.Sumar Complejos");
            System.out.println ("4.Listar Complejos");
            b=sc.nextInt();

            switch (b) {
                case 1: {
                    Operaciones.SumaN(numeros);

                    break;
                }
                case 3: {
                    Operaciones.SumaC(numeros);

                    break;
                }
                case 2: {
                    Operaciones.ListadoN(numeros, contN);

                    break;
                }
                case 4: {
                    Operaciones.ListadoC(numeros, contC);

                    break;
                }
                default: {
                    break;
                }
            }

            System.out.println("\nDesea elegir otra operacion ? (Y/N)");
            seleccion=sc.next();

        } while (seleccion.equals("y"));

        return;
    }
}
