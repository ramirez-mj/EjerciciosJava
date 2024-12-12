package copilotEjercicios;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// 8. Hacer un programa que invierta una cadena.

		Scanner entrada = new Scanner (System.in);
		String cad, cadreves="";
		int tam = 0;
		
		System.out.println("Ingrese una cadena de caracteres...");
		cad = entrada.nextLine();
		tam = cad.length();
		
		for(int i = tam-1; i>=0;i--) {
			cadreves += cad.charAt(i);
		}
		
		System.out.println("cadena original " + cad);

		System.out.println("cadena al reves " + cadreves);
	}

}
