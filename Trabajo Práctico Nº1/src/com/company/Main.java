package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        String nombre;
        int edad = 0;

        System.out.println("Ingrese su Nombre porfavor");
        nombre =sc.nextLine();
        System.out.println("Ingrese Edad del usuario porfavor");
        edad =sc.nextInt();

        do {


            if (edad <= 18) {
                System.out.println("\n" + nombre + " Es MENOR de edad.");
            } else {
                System.out.println("\n" + nombre + " Es MAYOR de edad.");
            }
        }while(edad == 0);
    }
}
