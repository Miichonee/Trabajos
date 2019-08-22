/*Ejercicio 02:
Crear
 una matriz de 3 x 3 con elementos generados de forma aleatoria por medio del método random() de la clase Math.

Una
 vez que se genere el array de array mostrar los elementos cargados utilizando la consola. */
package TP3;

import java.util.Arrays;

public class EjercicioN2
{
    public static void main(String[] args)
    {
        int[][] matriz= new int [3][3];

        for (int x=0;x<matriz.length;x++) {
            for (int y=0;y<matriz.length;y++) {
                matriz[x][y]=(int)(Math.random()*100+1); //Cargado de valores con la funcion math random.
            }
        }
        for (int[] array:matriz) { //For each para imprimir por consola el array
            System.out.println(Arrays.toString(array));
        }
    }
}



