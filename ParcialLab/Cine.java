package ParcialLab;

import java.util.Scanner;

public class Cine
{

    public static void main(String[] args) {

        Espectadores espectadores[] = new Espectadores[3];

        for (int i = 0; i < espectadores.length; i++) {
            try {
                Scanner sc = new Scanner(System.in);

                System.out.println("Ingrese nombre del espectador: ");
                String nombre = sc.next();

                System.out.println("Ingrese edad del espectador: ");
                int edad = sc.nextInt();

                System.out.println("Ingrese letra de la fila: ");
                String fila = sc.next();

                System.out.println("Ingrese numero de butaca: ");
                int silla = sc.nextInt();

                espectadores[i] = new Espectadores(nombre, edad, fila, silla);
            } catch (java.util.InputMismatchException e) {
                System.out.println("ERROR EN EL INGRESO DE DATOS");

                return;
            }
        }
        Salas sala = new Salas(3, "Joker", "Sala 01");



        System.out.println(" ");
        System.out.println(" ");





        Empleados emp = new Empleados("Elvago",29,0);
        System.out.println("Es "+emp.getTipo());
        System.out.println(emp.toString());

        System.out.println("\n");

        Acomodadores acm = new Acomodadores("Agustin",21,50000);
        System.out.println("Es "+acm.getTipo());
        System.out.println(acm.toString());
    }
}
