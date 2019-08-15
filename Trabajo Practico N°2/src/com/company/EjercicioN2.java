/*Ejercicio 2. Media en posiciones pares del Array
En este ejercicio, se pide al usuario que introduzca 10 números enteros por consola.
Los números se almacenarán en un array y el programa calculará la media de los números introducidos en las posiciones pares del array. (Debes utilizar el operador módulo “%”).
*/package com.company;

import javax.swing.*;

public class EjercicioN2
{
    public static void main(String[] args)
    {
    int [] numeros = new int[10];
    int media = 0;
    int par=0;

    for (int i=0;i<numeros.length;i++)
    {
    numeros [i] =Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero "+(i+1)+" : "));
        if(i%2==0)
        {
            par++;
            media = media + numeros[i];
        }
    }
   
    System.out.println("La media de el arreglo es :\n" +media/par);

    }
}
