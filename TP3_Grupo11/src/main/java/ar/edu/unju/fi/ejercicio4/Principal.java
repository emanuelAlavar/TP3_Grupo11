package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		NumeroPar unNumero = new NumeroPar();
		int[] arreglo = new int[8];
		
		System.out.println("Ingrese 8 números enteros: ");
		
		for(int i = 0; i < 8; i++) {
			arreglo[i] = sc.nextInt();
		}
		
		System.out.println("NÚMEROS: ");
		for(int i = 0; i < 8; i++) {
			if(unNumero.esPar(arreglo[i])) {
				System.out.println(arreglo[i] + ", par");
			}else {
				System.out.println(arreglo[i] + ", impar");
			}
		}
		sc.close();
	}
}
