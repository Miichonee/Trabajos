package TrabajoPracticoNro7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EjercicioN2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner sc=new Scanner (System.in);
        System.out.println("Ingrese un número del 1 al 100");
        try {
            int numero=sc.nextInt();
            checkNumber(numero);
        }catch (InputMismatchException e) {
            System.out.println("No se ingresó un número");
        }
    }


    public static void checkNumber(int numero) throws Malingreso
    {
        if (numero < 0 || numero > 100)
        {
            throw new Malingreso("¡El número ingresado está fuera de rango!");
        }else
            {
            System.out.println("El número ingresado está dentro de los rangos.");
        }
    }
}