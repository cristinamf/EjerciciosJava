package EjerciciosSueltos;

import java.util.Scanner;

public class CubosNicómaco {
	public static void main(String args[]) {
		Scanner in=new Scanner (System.in);
		System.out.print("Numero entero: ");
		int n=in.nextInt();
		int siguienteImpar=1;
		
		for(int i=1; i<=n; i++) {
			int acumulador=0;
			System.out.print(i+ "^3 = ");
			for (int j=1; j<=i; j++) {
				if(j != i) {
					System.out.print(siguienteImpar+ " + ");
				} 
				else
					System.out.print(siguienteImpar);
				acumulador += siguienteImpar;
				siguienteImpar += 2;
			}
			System.out.println(" = "+acumulador);
		}
	}	
}
