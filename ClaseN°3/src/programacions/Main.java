package programacions;

import java.util.Scanner;
public class Main
{

    public static void main(String[] args)
    {
	Scanner sc= new Scanner(System.in);

	int [][] matriz = new int[4][3];

        matriz[0][0] =1;
        matriz[0][1] =2;
        matriz[0][2] =3;

        matriz[1][0] =4;
        matriz[1][1] =5;
        matriz[1][2] =6;

        matriz[2][0] = 7;
        matriz[2][1] = 8;
        matriz[2][2] = 9;

        matriz[3][0] =10;
        matriz[3][1] =11;
        matriz[3][2] =12;


        System.out.println("Mostrar de Forma Matricial");

       /* for(int i=0;i<4;i++)
        {
            for(int j=0;j<3;j++)*/
        for (int [] fila:matriz)
        {for (int elemento:fila)
            {
              System.out.print(elemento+" ");
            }
            System.out.println(" ");
        }
    }
}
