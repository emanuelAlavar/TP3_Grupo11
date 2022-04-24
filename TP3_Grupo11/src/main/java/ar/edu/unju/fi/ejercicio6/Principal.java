package ar.edu.unju.fi.ejercicio6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner (System.in);
		int[] arreglo = new int[10];
		boolean band;
		
		
		for (int i = 0; i<=9;i++) {
		
       do {			
    	   
    	   band=true;
    	   
			try {
				
			System.out.println("ingrese un numero  ");
			arreglo[i]= scan.nextInt();
			
			}catch(InputMismatchException e)
			{
			  System.out.println("Por favor solo ingrese numeros");
			  scan.nextLine();
			  band=false;
			}
			
       }while(band==false);
       
		}
		
		
		
		
	
		
		
			
			
			for(int i=9;i>=0;i--) {
			
				
			System.out.println(arreglo[i]);
				
				
			}
			
			
			
		
		

	}

}
