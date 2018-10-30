package EjerciciosExamen;
//intentar hacerlo con un bucle

import java.util.Scanner;

public class EjercicioAsteriscos {
	public static void main(String args[]) {
		int n;
		int m;
		Scanner teclado=new Scanner (System.in);
		
		System.out.print("Numero de lineas: ");
		n=teclado.nextInt();
		
		System.out.print("Numero de columnas: ");
		m=teclado.nextInt();
		
		for (int i=0;i<n ; i++) {
			if (i ==n/2) {
				for (int j =0; j<m; j++) {
					System.out.print("*");
				}
			}
			else {
				for (int j = 0; j<m; j++) {
					if(j==m/2) {
						System.out.print("*");
					}
					else
						System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
}
