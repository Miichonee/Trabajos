package TrabajoPracticoN9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Operaciones
{
    public static void SumaN(ArrayList<Numero> n) {
        double x = 0;
        Numero num[] = n.toArray(new Numero[n.size()]);
        Naturales nat;

        Iterator<Numero> iterator = n.iterator();

        for (int i = 0; i < num.length; i++) {
            if (num[i].tipo.equals("Natural")) {
                nat = (Naturales)num[i];

                x+=nat.getValor();
            }
        }

        System.out.println ("La suma de todos los Naturales es: " +x);
    }

    public static void SumaC(ArrayList<Numero> n) {
        double x = 0;
        double y = 0;
        Numero num[] = n.toArray(new Numero[n.size()]);
        Complejos comp;

        for (int i = 0; i < num.length; i++) {
            if (num[i].tipo.equals("Complejo")){
                comp = (Complejos) num[i];

                x+=comp.getValor();
                y+=comp.getValor2();
            }
        }

        System.out.println ("La suma de todos los Naturales es: " +x +" " +y +"i");
    }

    public static void ListadoN(ArrayList<Numero> n, int cont) {
        Naturales nat[] = new Naturales[cont];
        Numero num[] = n.toArray(new Numero[n.size()]);
        double naturales[] = new double[cont];
        int j = 0;

        for (int i = 0; i < num.length; i++) {
            if (num[i].tipo.equals("Natural")){
                nat[j] = (Naturales)num[i];

                naturales[j]=nat[j].getValor();

                j++;
            }
        }

        Arrays.sort(naturales);

        for (int i = 0; i < naturales.length ; i++) {
            if (i==naturales.length) {
                return;
            }

            System.out.print (naturales[i] +", ");
        }
    }

    public static void ListadoC(ArrayList<Numero> n, int cont) {
        Complejos comp[] = new Complejos[cont];
        Numero num[] = n.toArray(new Numero[n.size()]);
        double complejos[] = new double[cont];
        double complejos2[] = new double[cont];
        int j = 0;

        for (int i = 0; i < num.length; i++) {
            if (num[i].tipo.equals("Complejo")){
                comp[j] = (Complejos) num[i];

                complejos[j]=comp[j].getValor();
                complejos2[j]=comp[j].getValor2();

                j++;
            }
        }

        Arrays.sort(complejos);

        for (int i = 0; i < complejos.length ; i++) {
            if (i==complejos.length) {
                return;
            }

            System.out.print (complejos[i] +" " +complejos2[i] +", ");
        }
    }
}
