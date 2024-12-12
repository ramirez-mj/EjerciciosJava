package copilotEjercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// 6. Realizar un programa que calcule el factorial de un número.

		//atributos
		 Scanner entrada = new Scanner (System.in);
		 int num;
		 int fact=1;
		
		System.out.println("Este programa calcula el factorial de un numero ingresado");
		System.out.println("Ingrese un valor: ");
		num = entrada.nextInt();
		
		for(int i=1; i<=num; i++) {
			fact = (fact * i);
			//System.out.println("fact " + fact);
		}
		
		System.out.println("El factorial de " + num + " es " + fact);
		
		
	}

}
