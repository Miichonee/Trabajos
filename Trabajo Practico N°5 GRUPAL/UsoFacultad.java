package trabajoGrupal;

import java.util.Scanner;

public class UsoFacultad {

	public static void main(String[] args) {
		// Trabajo Practico Grupal Acevedo, Gabriel; Rodriguez, Juan y Kowaleski, Martin.
//--------------------------------------------------------------------------------------------
//Creación de Facultad...
        Scanner sc = new Scanner (System.in);
		System.out.println("ingrese la cantidad máxima de estudiantes");
		int etudiante = sc.nextInt();
		System.out.println("Ingrese nombre de la escuela: ");
	    String nameEsc = sc.next();
	     
	    Facultad escuela = new Facultad (nameEsc,etudiante);
//--------------------------------------------------------------------------------------------
	    
	    
	   escuela.agregarEstudiantes();
	    
	   
	 //--------------------------------------------------------------------------------------------	   
	  
	   int cont=0;
	   do {
	   
	   System.out.println("-----------------------MENU DE OPCIONES------------------------");
	   System.out.println("-----------------------¿Qué desea hacer?------------------------");
	   System.out.println("1: BUSCAR ALUMNO\n"+"2: CAMBIAR ALGUNA NOTA\n"+"3: BORRAR ALUMNO\n"+"4: LISTA DE ALUMNOS\n");
	   int op=sc.nextInt();
	  switch(op){  
	  case 1:escuela.buscarAlumnos(); cont=0;break;
       
	  case 2:escuela.cambiarNota(); cont=0;break;
       
	  case 3:escuela.borrarAlumnos();cont=0;break;
	  
	  case 4:escuela.listarAlumnos();cont=0;break;
       
	  }

	

        }while (cont==0);
	   }
	}
