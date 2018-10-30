package EjerciciosAnexo;

import java.util.Scanner;

public class Anexo7 {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int X;
		int Y;
		float R;
		System.out.println("Introduce un dividendo: ");
		X=teclado.nextInt();
		System.out.println("Introduce un divisor: ");
		Y=teclado.nextInt();
		if(X%Y==0) {
			System.out.println("La división es exacta");
			R=X/Y;
			System.out.println(X+"/"+Y+"="+R);
		}
		else {
			System.out.println("No se pueden dividir");
		}
		teclado.close();
	}

}
