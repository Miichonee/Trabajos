package programacions;

public class Problema2
{
    public static void main(String[] args)
    {

        int [][] matriz = new int[9][9];

        for(int i=0;i<9;i++)
        {
            for (int j=0; j<9; j++)
            {
                matriz[i][j]=(int)(Math.random()*100);
            }
        }

        for (int [] fila:matriz)
        {for (int elemento:fila)
        {
            System.out.print(elemento+" ");
        }
            System.out.println(" ");
        }

    }

}
