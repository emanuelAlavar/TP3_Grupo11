package ar.edu.unju.fi.ejercicio7;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;

public class Principal {

	public static void main(String[] args) {
		SpringApplication.run(Principal.class, args);
		boolean r = true;
		ArrayList<String> lista = new ArrayList<String>();
		Scanner lector = new Scanner(System.in);
		
		while(r) { //Pide ingresar el nombre de frutas hasta decidir no continuar. Si el ingreso no es un String, vuelve a pedir que ingrese un nombre.
			System.out.println("Ingrese el nombre de una fruta");
			String fruta = lector.next();
			lista.add(fruta);
			System.out.println("¿Desea continuar? s/n");
			String res = lector.next();
			if("n".equalsIgnoreCase(res)){
				r = false;
			}
		}
		
		for(int i=0;i<lista.size();i++) { //Muestra los elementos de la lista con índice par.
			if(i%2 == 0) {
				System.out.println(lista.get(i));
			}
		}
		
		while(true) { //Pide el ingreso de un entero dentro del rango de la lista. Si el ingreso no es un entero o no está dentro del rango, vuelve a pedir.
			System.out.println("Ingrese un número entero positivo dentro del rango (0-"+(lista.size()-1)+") *Con 0 incluido");
			try {
				int n = lector.nextInt();
				lista.remove(n);
				break;
			} catch (InputMismatchException | IndexOutOfBoundsException e) {
				System.out.println("Eso no es un número entero o no está dentro del rango válido");
			}
		}
		lector.close();
		
		for(int i=0;i<lista.size();i++) {	//Muestra todos los elementos y la cantidad.
			System.out.println(lista.get(i));
		}
		System.out.println("La lista tiene un total de "+lista.size()+" elementos");
		
		System.out.println("Programa finalizado con éxito");
		System.exit(0);
	}
}
