package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("ingrese un texto  ");
		Scanner scan= new Scanner (System.in);
		String texto = scan.nextLine();
		int cantCaracter = texto.length();
		int j=0;
		char[] cadenat = new char[cantCaracter];
		
		for(int i=cantCaracter-1;i>=0;i--)
		{
			cadenat[j] = texto.charAt(i);
			j++;
			
		}
		System.out.println("Resultado inverso");
		for(int i=0;i<cantCaracter;i++)
		{
			System.out.println(cadenat[i]);
		}
		
				
			
		 
			
		}
		
		

	}


