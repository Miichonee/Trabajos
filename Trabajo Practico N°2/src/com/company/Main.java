/*Ejercicio 1: Almacenar en Array
Desarrollar un programa que pida al usuario que introduzca 10 números enteros por consola.
Los números introducidos se almacenarán en un array.
El programa imprime en consola cuántos números negativos, positivos y valores 0 hay en el array.*/
package com.company;

import javax.swing.*;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int neg = 0, pos = 0, cero=0;

        for(int i=0; i < numeros.length; i++ )
        {

            numeros [i]= Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero "+(i+1)+" : " ));
            /*numeros[i] = sc.nextInt();*/

            if(numeros[i]<0)
            {
                neg++;
            }
            if(numeros[i]>0)
            {
                pos++;
            }
            if(numeros[i]==0)
            {
                cero++;
            }
        }
        System.out.println("\nLos numeros negativos son : "+neg );
        System.out.println("\nLos numeros positivos son : "+pos );
        System.out.println("\nLos numeros ceros son : "+cero );



    }
}


