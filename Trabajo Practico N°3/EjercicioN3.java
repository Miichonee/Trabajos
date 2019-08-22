/*Ejercicio03:
Los datos para rellenar la matriz deben ser proporcionados
 por el usuario.
Una vez que se llene todo el arreglo de arreglos se debe
mostrar la información en la consola de una forma clara.
BONUS:
Ordenar alfabéticamente el arreglo.*/
package TP3;

import java.util.Scanner;

public class EjercicioN3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese la cantidad de personas que ingresar");
        int p=sc.nextInt();
        String[][] personas = new String[3][p];
        String res;

        for (int x=0;x<personas[0].length;x++) {
            System.out.println("Ingrese el nombre de la persona "+(x+1));
            personas[0][x]=sc.next();
            System.out.println("Ingrese el DNI de la persona "+(x+1));
            personas[1][x]=sc.next();
            System.out.println("Ingrese la edad de la persona "+(x+1));
            personas[2][x]=sc.next();
            System.out.println("");
        }//Bonus
        for (int x=0;x<(personas[0].length)-1;x++) {
            if (personas[0][x].compareTo(personas[0][x+1]) > 0 ) {
                for (int y=0;y<personas.length;y++) {
                    res=personas[y][x];
                    personas[y][x]=personas[y][x+1];
                    personas[y][x+1]=res;
                }
            }
        }
        for (String[] array: personas) {
            for (String elemento: array) {
                System.out.print(elemento+"\t");
            }
            System.out.println(" ");
        }
    }
}
