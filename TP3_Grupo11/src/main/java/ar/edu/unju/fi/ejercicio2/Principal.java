package ar.edu.unju.fi.ejercicio2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		TablaMultiplicar unaTabla = new TablaMultiplicar();
		int [] arreglo = {0,1,2,3,4,5,6,7,8,9,10};
		char respuesta; 
		
		do {
		
			System.out.println("Ingrese un numero entero [1-9]: ");
			int num = sc.nextInt();
		
				if (num > 0 && num <= 9) {
			
					for(int i = 1; i < arreglo.length; i++) {
					System.out.println(num + " x " + arreglo[i] + " = " + unaTabla.multiplicar(num, i));
					}
				}else {
					System.out.println("El número ingresado es incorrecto.");
				}
				
				System.out.println("Desea ingresar otro número? (s/n): ");
				respuesta = sc.next().charAt(0); //se obtiene el primer caracter ingresado por teclado
		}while(respuesta == 's' || respuesta == 'S');
		sc.close();
	}
}
