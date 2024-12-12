package copilotEjercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		/*
		 *  Ejercicio 1: Suma de dos números 
		 *  Problema: Escribe un programa en Java que sume dos números 
		 *            y muestre el resultado.
		 */

		//atributos
		Scanner entrada = new Scanner (System.in);
		int a, b;
		int suma;
		
		System.out.println("Ingrese un valor A...");
		a=entrada.nextInt();
		
		System.out.println("Ingrese un valor B...");
		b=entrada.nextInt();
		 suma= a+b;
		 
		System.out.println("La suma de A= "+a+ " y B= " +b+ " es igual a " + suma); 
		
		
		
	}

}
