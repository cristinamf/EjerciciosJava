package EjerciciosExamen;
import java.util.Scanner;

public class EjercicioAsterisco2 {
	public static void main(String args[]) {
		int n;
		int m;
		Scanner teclado=new Scanner (System.in);
		
		System.out.print("Numero de lineas: ");
		n=teclado.nextInt();
		
		System.out.print("Numero de columnas: ");
		m=teclado.nextInt();
		
		for (int i=0;i<n ; i++) {
			for (int j =0; j<m; j++) {
				//sustituyendo el bucle if:
				//System.out.print(i==n/2 || j==m/2 ? "*" : " ");
				if(i==n/2 || j==m/2) {
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
		
}
