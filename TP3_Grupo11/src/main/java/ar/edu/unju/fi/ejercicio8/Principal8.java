package ar.edu.unju.fi.ejercicio8;

import java.util.ArrayList;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio3.Alumno;

public class Principal8 {

	public static void main(String[] args) {		
		ArrayList<Alumno> lista = new ArrayList();
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		int opcion;
		boolean equivoco =true;
				
		do {
			System.out.println("1 – Nuevo alumno");
			System.out.println("2 – Eliminar alumno");
			System.out.println("3 – Modificar notas alumno");
			System.out.println("4 – Mostrar todos los alumnos.");
			System.out.println("5 - Mostrar los que superan el promedio de 6");
			System.out.println("6 – Salir.");
			System.out.println();
			System.out.print("Elija una opcion: ");
			opcion=sc.nextInt();
			
			switch(opcion) {
				case 1:
						Alumno alumno = new Alumno();
						int notas[]= new int[5];
						System.out.print("Ingrese su nombre: ");
						alumno.setNombre(sc2.nextLine());
						System.out.print("Ingrese su apellido: ");
						alumno.setApellido(sc2.nextLine());
						System.out.print("Ingrese su LU: ");
						alumno.setLu(sc.nextInt());
						System.out.println("Ingrese 5 notas: ");
						for(int i=0;i<=4;i++) {			
							notas[i]=sc.nextInt();
						}
						alumno.setNotas(notas);
						lista.add(alumno);
						break;
				case 2:
						System.out.print("Ingrese la LU del alumno a eliminar: ");
						int eliminado=sc.nextInt();
						for (int i=0;i<lista.size();i++) {
							if(lista.get(i).getLu()==eliminado) {
								lista.remove(i);
							}
						}
						System.out.println("Alumno Eliminado");
						break;
				case 3:
					int newNotas[]= new int[5];
					System.out.print("Ingrese la LU del alumno a modificar notas: ");
					int lu=sc.nextInt();
					for (int i=0;i<lista.size();i++) {
						if(lista.get(i).getLu()==lu) {
							System.out.println("Ingrese 5 notas: ");
							for(int j=0;j<=4;j++) {			
								newNotas[j]=sc.nextInt();
							}
							lista.get(i).setNotas(newNotas);							
						}
					}					
					break;				
				case 4:
					for (int i=0;i<lista.size();i++) {
						System.out.println(lista.get(i).getNombre()+"|"+lista.get(i).getApellido()+"|"+lista.get(i).getLu()+"|"+lista.get(i).calcularPromedio()+"|"+lista.get(i).obtenerNotaMaxima());
					}
					break;
				case 5:
					for (int i=0;i<lista.size();i++) {
						if(lista.get(i).calcularPromedio()>=6) {
							System.out.println(lista.get(i).getNombre());
						}
					}
					break;
				default:
	            	equivoco = false;
	            	System.out.println("-------");
					break;
			}
		}while(equivoco);
		sc.close();
		sc2.close();
	}
}