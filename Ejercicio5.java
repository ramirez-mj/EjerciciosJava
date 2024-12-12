package copilotEjercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// 5. Escribir un programa que convierta grados Celsius a Fahrenheit.
		//  fórmula para convertir Celsius a Fahrenheit viene dada por °F = °C × (9/5) + 32.

		//atributos
		Scanner entrada = new Scanner (System.in);
		double tempcel, tempfah;
		
		System.out.println("Ingrese la temperatura en grados Celsius...");
		tempcel = entrada.nextDouble();
		
		
		tempfah = (double)tempcel * ((double)9/5) + 32;
//		double sal;
//		sal=tempcel * ((double)9/5) + 32;
//		System.out.println("sal " + sal);
		
		
		System.out.println(tempcel + " en grados Celsius es igual a " + tempfah + " grados Fahrenheit.");
		
	}

}
