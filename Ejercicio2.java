package copilotEjercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		/*
		 * Ejercicio 2: Mayor de tres números 
		 *    Problema: Escribe un programa en Java que determine el mayor 
		 *              de tres números.
		 */
		//atributos
		
		Scanner entrada = new Scanner (System.in);
		int a, b, c;
		int mayor;
		
		System.out.println("Ingrese un valor A:");
		a=entrada.nextInt();
		System.out.println("Ingrese un valor B:");
		b=entrada.nextInt();
		System.out.println("Ingrese un valor C:");
		c=entrada.nextInt();
		
		if((a==b) && (b==c)) {
			System.out.println("los tres valores son iguales");
			
		}else {
		
		if(a > b) {
			if(a>c) {
				mayor=a;
				System.out.println("el mayor es " + a);
			}else {
				mayor=c;
				System.out.println("el mayor es " + c);
			}
		}else if(b>c) {
			mayor =b;
			System.out.println("el mayor es " + b);
		}else {
			mayor = c;
			System.out.println("el mayor es " + c);
		}
		
        }
	}

}
