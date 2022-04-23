package ar.edu.unju.fi.ejercicio9;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		ArrayList<Producto> Productos = new ArrayList<Producto>();
		Scanner lector = new Scanner(System.in);
		while(true) {
			menu();
			int n = lector.nextInt();
			switch(n) {
				case 1: {	//Crea un nuevo producto
					System.out.println("Ingrese el código del producto");
					String codigo = lector.next();
					System.out.println("Ingrese la descripción del producto");
					String descripcion = lector.next();
					String precio;
					do {
						System.out.println("Ingrese el precio del producto");
						precio = lector.next();
					} while(!validar(precio));
					double precio2 = Double.parseDouble(precio);
					System.out.println("Ingrese la marca del producto");
					String marca = lector.next();
					Producto prod = new Producto(codigo,descripcion,precio2,marca);
					Productos.add(prod);
					break;
				}
				case 2: {	//Muestra todos los productos
					if(Productos.size()==0) {
						System.out.println("No hay productos en la lista");
						break;
					}
					for(int i=0;i<Productos.size();i++) {
						Producto prod = Productos.get(i);
						System.out.println(prod.toString());
					}
					break;
				}
				case 3: {	//Suma 100,25 al precio de todos los productos
					if(Productos.size()==0) {
						System.out.println("No hay productos en la lista");
						break;
					}
					for(int i=0;i<Productos.size();i++) {
						Producto prod = Productos.get(i);
						double precio = prod.getPrecio();
						prod.setPrecio(precio+100.25);
					}
					System.out.println("Se ha incrementado el precio de todos los productos");
					break;
				}
				case 4: {	//Muestra la suma del precio de todos los productos
					if(Productos.size()==0) {
						System.out.println("No hay productos en la lista");
						break;
					}
					double total = 0;
					for(int i=0;i<Productos.size();i++) {
						Producto prod = Productos.get(i);
						double precio = prod.getPrecio();
						total += precio;
					}
					System.out.println("La suma total de los precios es: "+total);
					break;
				}
				case 5: {	//Termina el programa
					lector.close();
					System.out.println("Programa finalizado con éxito");
					System.exit(0);
				}
				default: {
					System.out.println("El código ingresado no es válido");
					break;
				}
			}		
		}
	}
	
	public static void menu() { //Menu simple
		System.out.println("***************************************\n"
				+ "1 - Nuevo Producto\n"
				+ "2 - Mostrar todos los productos\n"
				+ "3 - Incrementar el precio de todos los productos\n"
				+ "4 - Monto total de todos los productos\n"
				+ "5 - Fin\n"
				+ "***************************************\n");
	}
	public static boolean validar(String n) { //Valida de el dato ingresado es un double
		try {
			double num = Double.parseDouble(n);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
