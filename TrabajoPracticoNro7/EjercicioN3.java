package TrabajoPracticoNro7;

import java.util.Scanner;

public class EjercicioN3
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int numero, control = 0;
        do {
            control = 0;
            System.out.println("Ingrese un número aleatorio ");
            try
            {
                numero = Integer.parseInt(sc.next());
                if (numero % 2 == 0)
                {
                    System.out.println("El número ingresado es par");
                } else
                    {
                    System.out.println("El número ingresado es impar");
                }
            } catch (Exception e)
            {
                System.out.println("Cualquier cosa pusite nae ");
                control = 1;
            }
        } while (control == 1);
    }
}