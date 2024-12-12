package copilotEjercicios;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// 9. Escribir un programa que cuente el número de vocales en una cadena.

		Scanner entrada = new Scanner (System.in);
		
		String cad;
		int tam, cont;
		int conta = 0;
		int conte = 0;
		int conti = 0;
		int conto = 0;
		int contu = 0;
		
		System.out.println("ingrese una cadena de caracteres...");
		cad = entrada.nextLine();
		tam = cad.length();
		
		for (int i = 0; i<=tam -1; i++) {
			switch(cad.charAt(i)) {
			case 'a':
				conta +=1;
				break;
			case 'e':
				conte +=1;
				break;
			case 'i':
				conti +=1;
				break;
			case 'o':
				conto +=1;
				break;
			case 'u':
				contu +=1;
				break;
			default:
				break;
			}
		}
		
		cont = conta +conte + conti + conto + contu;
		
		System.out.println("la cantidad de vocales en la cadena es: " + cont);
		
	}

}
