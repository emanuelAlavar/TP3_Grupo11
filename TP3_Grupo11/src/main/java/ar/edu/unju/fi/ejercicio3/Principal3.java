package ar.edu.unju.fi.ejercicio3;

import java.util.Scanner;

public class Principal3 {

	public static void main(String[] args) {
		Alumno alumno = new Alumno(); 
		Scanner sc = new Scanner(System.in);
		int notas[]= new int[5];
		
		System.out.println("Ingrese su nombre: ");
		alumno.setNombre(sc.nextLine());
		System.out.println("Ingrese su apellido: ");
		alumno.setApellido(sc.nextLine());
		System.out.println("Ingrese su Libreta Universitaria: ");
		alumno.setLu(sc.nextInt());
		System.out.println("Ingrese 5 notas: ");
		for(int i=0;i<=4;i++) {			
			notas[i]=sc.nextInt();
		}
		alumno.setNotas(notas);
		sc.close();
		
		System.out.println(alumno.getNombre());
		System.out.println(alumno.getApellido());
		for(int i=0;i<=4;i++) {			
			System.out.print(alumno.getNotas()[i]+"|"); 
		}
		System.out.println("");
		System.out.println("Promedio de notas: "+alumno.calcularPromedio());
		System.out.println("Nota mas alta: "+alumno.obtenerNotaMaxima());
	}
}