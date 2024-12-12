package copilotEjercicios;

public class Ejercicio7 {

	public static void main(String[] args) {
		// 7.Crear un programa que imprima los primeros 10 números de la serie Fibonacci.

		
		int a= 0;
		int b= 1;
		int c= 0;
        System.out.print(a +" ");
        System.out.print(b +" ");
		for(int i=1;i<=8; i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.print(c +" ");
		}
		
	}

}
