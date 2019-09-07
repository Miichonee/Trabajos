package trabajoGrupal;

import java.util.Scanner;



public class Estudiantes {
	//atributos
	
	String nombre;
	private int nroEst;
	double notaM;
	private static int countNro;
	
	//constructor
	
	public Estudiantes(String nombre, double notaM) {
		
		this.nombre=nombre;
		this.notaM=notaM;	
		this.nroEst=countNro;
		this.countNro++;
	}
	
	public String getInfo() {
		return "\n------INFORMACION ALUMNO:-------\n"+
	    this.nombre+"\n NOTA MEDIA: "+
		this.notaM+"\nID: "+this.nroEst;
		
	}
	
	
	}

	


