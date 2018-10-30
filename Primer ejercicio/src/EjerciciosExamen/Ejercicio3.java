package EjerciciosExamen;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String args ) {
		int n;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		n=teclado.nextInt();
		if(n>1) {
			
			if(n%2==0) {
				n=n/2;
			}
			if(n%2!=0) {
				n=n*3+1;
			}
		}
		else System.out.println("Error");
	}
}
