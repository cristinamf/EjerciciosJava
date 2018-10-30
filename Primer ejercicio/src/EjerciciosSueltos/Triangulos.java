package EjerciciosSueltos;

import java.util.Scanner;

public class Triangulos {

	public static void main(String[] args) {
		int A;
		int B;
		int C;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce A: ");
		A=teclado.nextInt();
		System.out.println("Introduce B: ");
		B=teclado.nextInt();
		System.out.println("Introduce C:");
		C=teclado.nextInt();
		
		if(A+B>C && A+C>B && C+B>A) {
			System.out.println("Se puede formar un triangulo");
		}
		else {
			System.out.println("Esos valores no son validos para un triangulo");
		}

	}

}
