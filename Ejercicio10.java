package copilotEjercicios;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// 10. Crear un programa que verifique si una palabra es un palíndromo.

		//emprolijarlo
		
		Scanner entrada = new Scanner (System.in);
		String cad, cad1, cad2, cad3="";
		int tam, mitad, tam2;
		
		System.out.println("ingrese la cadena a procesar...");
		cad = entrada.nextLine();
		tam = cad.length();   //apocopa, reconocer, anilina, roma ni se conoce sin oro ni se conoce sin amor
		mitad = tam/2;
		cad1=cad.substring(0, mitad);
		cad2=cad.substring(mitad+1, tam);
		
		//Doy vuelta la cadena cad2
		tam2=cad2.length();
        for(int i=tam2-1; i>=0;i--) {
			cad3+=cad2.charAt(i);
		}
        
        cad1=cad1.replace(" ","");
        cad3=cad3.replace(" ","");
		
        if(cad1.equals(cad3)) {
        	System.out.println("es un PALINDROMO!!!");
        }else {
        	System.out.println("NO es un PALINDROMO!!!");
        }
		
		System.out.println("tam" + tam);
		System.out.println("mitad "+ mitad);
//		System.out.println("cad1 " + cad1.replace(" ",""));
//		System.out.println("cad2 " + cad2.replace(" ",""));
//		System.out.println("cad3 " + cad3.replace(" ",""));
		System.out.println("cad1 " + cad1 );
		System.out.println("cad2 " + cad2 );
		System.out.println("cad3 " + cad3 );
	}

}
