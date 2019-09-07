package trabajoGrupal;

import java.util.Scanner;

public class Facultad {
	//atributos
	private String nombre;
	private int maxEs;
	private Estudiantes [] lovao;
	private int comp=0;
	
	
	//constructor
	public Facultad(String nombre, int maxEs) {
		// TODO Auto-generated constructor stub
		
		this.nombre=nombre;
		this.maxEs=maxEs;
		this.lovao = new Estudiantes[maxEs];
		
	}
	
	//metodos
	
	public void agregarEstudiantes(){
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<maxEs; i++) {
			System.out.println("ingrese nombre del estudiante "+(i+1));
			String nombre = sc.next();
			System.out.println("ingrese nota media del estudiante "+(i+1));
			double nota= sc.nextDouble();
			lovao [comp]= new Estudiantes (nombre, nota);
			comp++;
		}
	}
		
		public void listarAlumnos() {
			for (int i=0; i<comp; i++) {
			try {	System.out.println(lovao[i].getInfo());
				
			}catch(Exception e) {
				System.out.println("No hay alumnos\n");
				}     
			}
		}
		
		public void buscarAlumnos() {
			Scanner sc = new Scanner(System.in);
			 System.out.println("\n-----------¿A QUÉ ALUMNO DESEA BUSCAR POR NOMBRE?--------------\n");
		        String busqueda=sc.next();
		        for (int i=0; i<maxEs; i++) {
		        	if (lovao[i].nombre.equals(busqueda)) {
		        		System.out.println("\nALUMNO ENCONTRADO!\n"+"\n****EL ALUMNO BUSCADO ES:****\n");
		        		System.out.println(lovao[i].getInfo());
		        	}
		        }
		
	}
		
		
         public void borrarAlumnos() {
        	 Scanner sc = new Scanner (System.in);

        		 for (int i=0; i<maxEs; i++) {
        		 System.out.println("¿CUAL? //NOMBRE//");
        		 String borrar = sc.next();
        		 if (lovao[i].nombre.equals(borrar)) {
        			 lovao[i]=null;
        			 System.out.println("Alumno borrado exitosamente");
        			 
        		 } else {
        		         System.out.println("no se encontró al alumno");
        		         
        		 }
        	 }
        	 
		 }
         
         
		
		
		public void cambiarNota() {
			Scanner sc = new Scanner (System.in);
        	  for (int i=0; i<maxEs; i++) {
       		 System.out.println("¿CUAL? //NOMBRE//");
       		 String borrar = sc.next();
       		if (lovao[i].nombre.equals(borrar)) {
       			 System.out.println("\n¿Cual es la nueva nota?\n");
       			 double notacamb=sc.nextDouble();
       			 lovao[i].notaM=notacamb;
       			 System.out.println("\nCambio de nota exitoso!\n");
       			
       		 }
       	 } 
       		
       	 
		}
		
		
		
		
		
		
		
			
		}

	


