/*Ejercicio 05:
Realice un programa que genere una matriz de 3x3 con
números ingresados por el usuario por medio de la consola.

Una vez terminada la carga de los elementos se debe mostrar
primero la matriz cargada con los datos iniciales y luego la matriz con los datos ordenados de mayor a menor.*/
package TP3;

import java.util.Scanner;

public class EjercicioN5
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int t=0;
        int mat[][]=new int [3][3];
        for ( int i=0;i<mat.length;i++){
            for( int j=0;j<mat.length;j++){
                System.out.println("Introduce el numero en la posicion "+i+"  "+j);
                mat[i][j] =sc.nextInt();
            }
            System.out.println("\n");
        } System.out.println("********************** MATRIZ CON DATOS INICIALES ********************************");

        for ( int i=0;i<mat.length;i++){
            for( int j=0;j<mat.length;j++){

                System.out.print(mat[i][j]+"	");
            }
            System.out.println(" ");
        }
        for( int i=0; i < mat.length; i++){
            for( int j=0;j< mat.length; j++){
                for(int x=0; x < mat.length; x++){
                    for(int y=0; y <mat.length; y++){
                        if(mat[i][j] > mat[x][y]){
                            t = mat[i][j];
                            mat[i][j] = mat[x][y];
                            mat[x][y] = t;
                        }
                    }
                }
            }
        }System.out.println("********************** MATRIZ ORDENADA ********************************");
        for ( int i=mat.length-1;i>=0;i--){
            for( int j=mat.length-1;j>=0;j--){
                System.out.print(mat[i][j]+"	");
            }
            System.out.println("");
        }
    }
}
