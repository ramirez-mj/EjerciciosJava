package copilotEjercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// 3. Hacer un programa que determine si un número es par o impar.

		//atributos
		Scanner entrada = new Scanner (System.in);
		int num;
		
		System.out.println("Ingrese un valor...");
		num= entrada.nextInt();
		
		if(num%2 == 0) {
			System.out.println("El valor ingresado es par!!!");
			
		}else {
			System.out.println("No es par!!!");
		}
		
		
	}

}
