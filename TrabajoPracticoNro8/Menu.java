package TrabajoPracticNro8;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        ArrayList<Vehiculo> vehiculos = new ArrayList<>();

        System.out.println("¿Cuantos vehiculos desea crear?");
        int x = sc.nextInt();
        System.out.println(" ");

        int a;
        double y = 0;
        for (int i = 0; i < x; i++) {
            System.out.println("Elija el vehiculo numero "+(i+1)+" a crear.");
            System.out.println("\n1.AUTO \t2.MOTO\n:");
            a = sc.nextInt();
            System.out.println(" ");

            switch (a) {
                case 1: {
                    do {
                        System.out.println("Ingrese velocidad inicial: ");
                        y = sc.nextDouble();
                    } while (y < 0);

                    vehiculos.add(new Auto(y));

                    if (y > 120) {
                        System.out.println("La velocidad maxima ha sido superada.");
                    }
                    if (y == 120) {
                        System.out.println("La velocidad maxima ha sido alcanzada.");
                    }

                    System.out.println(" ");

                    break;
                }
                case 2: {
                    do {
                        System.out.println("\nIngrese velocidad inicial: ");
                        y = sc.nextDouble();
                    } while (y < 0);

                    vehiculos.add(new Moto(y));

                    if (y > 120) {
                        System.out.println("La velocidad maxima ha sido superada.");
                    }
                    if (y == 120) {
                        System.out.println("La velocidad maxima ha sido alcanzada.");
                    }

                    System.out.println(" ");

                    break;
                }
                default: {
                    System.out.println("Error.");
                    System.out.println(" ");
                    break;
                }
            }
        }
        System.out.println(" ");

        System.out.println("¿Desea listar los vehiculos creados?(Y/N)");
        String eleccion = sc.next();
        System.out.println(" ");
        switch (eleccion) {
            case "y": {
                for (int i = 0; i < x; i++) {
                    System.out.println(vehiculos.get(i).getVehiculo());
                    System.out.println("Velocidad inicial: " + y);
                    System.out.println(vehiculos.get(i).Plazas());
                    System.out.println(" ");
                }
                break;
            }
            case "n": {
                break;
            }
            default: {
                break;
            }
        }
    }
}

