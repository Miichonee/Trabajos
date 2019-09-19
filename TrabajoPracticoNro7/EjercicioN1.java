package TrabajoPracticoNro7;

import java.util.Scanner;

public class EjercicioN1
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub

        Scanner sc=new Scanner (System.in);

        double numero=0;

        System.out.println("Ingrese un número aleatorio ");
        try {

            numero=sc.nextDouble();
            if (numero % 2 == 0) {
                System.out.println("El número ingresado es par");
            }else {
                System.out.println("El número ingresado es impar");
            }

        }catch (Exception e) {
            System.out.println("Cualquier cosa pusite nae");
        }
    }

}