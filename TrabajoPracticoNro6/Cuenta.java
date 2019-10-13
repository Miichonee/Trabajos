package TrabajoPracticoNro6;

import java.util.Scanner;

public class Cuenta
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese cuantas contraseñas desea crear: ");
        int x = sc.nextInt();

        System.out.print("Ingrese la longitud de las mismas: ");
        int y = sc.nextInt();

        System.out.println("");

        Contraseñas ListaContraseña[] = new Contraseñas[x];

        for (int i = 0; i < x; i++) {
            ListaContraseña[i] = new Contraseñas(y);
        }

        System.out.println("");

        for (int i = 0; i < x; i++) {
            String z = ListaContraseña[i].getPassword();
            System.out.print("Contraseña " + (i + 1) + ": " + z + "  ");
            ListaContraseña[i].Seguridad();
        }
    }
}
