package ar.edu.unju.fi.ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num1 = new int[5];
		int[] num2 = new int[5];
		boolean band = false;
		
		Scanner scan= new Scanner (System.in);
		System.out.println("cargar primer arreglo  ");
		
		
		for (int i = 0; i<=4;i++) {
			
		do {
		
			band=false;
			
			try {
			System.out.print("Ingrese un numero ");	
			num1[i]= scan.nextInt();
			}catch(InputMismatchException e)
			{
			 System.out.println("por favor ingrese un numero entero");
			 band=true;
			}
			
		scan.nextLine();
		
		   }while(band);
		
		}
   System.out.println("cargar segundo arreglo  ");
		
		
		for (int i = 0; i<=4;i++) {
			
		do {
		
			band=false;
			
			try {
			System.out.print("Ingrese un numero ");	
			num2[i]= scan.nextInt();
			}catch(InputMismatchException e)
			{
			 System.out.println("por favor ingrese un numero entero");
			 band=true;
			}
			
		scan.nextLine();
		
		   }while(band);
		
		}
		
		for (int k=0; k <=4;k++) {
			
			
		System.out.println("la division es  " + dividir( num1[k],num2[k] ));
		
		
		
		}
		scan.close();
	}
	
static double dividir (double a, double b)	{
		
		
		double div = a/b;
		return div;
		
		}	
		
	

}
