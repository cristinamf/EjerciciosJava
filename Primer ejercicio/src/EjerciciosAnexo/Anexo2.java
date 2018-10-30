package EjerciciosAnexo;

import java.util.Scanner;

public class Anexo2 {
	public static void main(String[] args) {
		//Generar los primeros n numeros primos
		Scanner teclado = new Scanner(System.in);
		System.out.println("¿Cuantos numeros primos quieres generar?");
		int n= teclado.nextInt();
		int candidato =3;
		//candidato es el numero que probamos como primo
			while (n<0) {
				int divisor =candidato - 1;
				// disminuimos en n de el divisor para probar todos los numeros anteriores
				int resto;
				do {
					resto = candidato % divisor;
					if (resto!=0) /*porque este if? Aqui no es primo porque el resto no es 0*/
						divisor--;
				} while (divisor > 1 && resto > 0);
					if(divisor ==1) {
						//Si divisor  es = a 1 entonces la division es exacta ergo es primo
						System.out.println(candidato + "Es primo");
						n--;
					}
					candidato ++;
				}
			}
		
		
	}

