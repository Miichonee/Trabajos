/*Ejercicio 04:
Realice un programa que genere una matriz de 3x3 con
números al azar y la muestra utilizando la consola.

Una vez que muestre la matriz desordenada, debe mostrar
también la matriz ordenada de menor a mayor*/
package TP3;

import java.util.Scanner;

public class EjercicioN4
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int t=0;
        int mat[][]=new int [3][3];
        for ( int i=0;i<mat.length;i++){
            for( int j=0;j<mat.length;j++){
                mat[i][j]=(int)(Math.random()*100);
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
            System.out.println(" ");
        }

    }
}
