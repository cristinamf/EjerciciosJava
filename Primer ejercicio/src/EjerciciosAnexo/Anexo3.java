package EjerciciosAnexo;

import java.util.Scanner;

public class Anexo3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int Z;		
		System.out.println("Introduce un número: ");
		Z=teclado.nextInt();
		if(Z%2==0) {
			System.out.println("El número "+Z+" es par");
		}
		else {
			System.out.println("El número " + Z + " es impar");
		}
		teclado.close();
	}

}
