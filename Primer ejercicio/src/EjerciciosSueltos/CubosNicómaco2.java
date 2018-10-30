//si pongo un 5 que me salga solo una linea con el resultado de 5^3
package EjerciciosSueltos;

import java.util.Scanner;

public class CubosNicómaco2 {
	public static void main(String args[]) {
		Scanner in=new Scanner (System.in);
		System.out.print("Numero entero: ");
		int n=in.nextInt();
		int siguienteImpar=1;
		int acumulador=0; 
		
		System.out.println(siguienteImpar+"+");
		acumulador +=siguienteImpar;
		siguienteImpar +=2;
		System.out.println("="+acumulador);
//		for(int i=1; i<=n; i++) {
//			int acumulador=0;
//			System.out.print(i+ "^3 = ");
//			for (int j=1; j<=i; j++) {
//				if(j != i) {
//					System.out.print(siguienteImpar+ " + ");
//				} 
//				else
//					System.out.print(siguienteImpar);
//				acumulador += siguienteImpar;
//				siguienteImpar += 2;
//			}
//			System.out.println(" = "+acumulador);
//		}
	}	
}
