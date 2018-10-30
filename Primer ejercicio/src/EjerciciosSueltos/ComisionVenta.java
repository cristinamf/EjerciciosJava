package EjerciciosSueltos;
import java.util.Scanner;

public class ComisionVenta {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float venta1;
		float venta2;
		float venta3;

		float comision1;
		float comision2;
		float comision3;
		final float sueldo = 1200;
		final float porcentaje = 0.1f; // la f del 0.1 es para figurar el 0.1 en float
		System.out.println("Valor de la venta 1: ");
		venta1 = teclado.nextFloat();
		comision1 = venta1 * porcentaje;

		System.out.println("Valor de la venta 2: ");
		venta2 = teclado.nextFloat();
		comision2 = venta2 * porcentaje;

		System.out.println("Valor de la venta 3: ");
		venta3 = teclado.nextFloat();
		comision3 = venta3 * porcentaje;

		System.out.println("Valor comision1: " + comision1);
		System.out.println("Valor comision2: " + comision2);
		System.out.println("Valor comision3: " + comision3);

		System.out.println("Sueldo Final: " + (comision1 + comision2 + comision3 + sueldo));
		teclado.close();
	}

}
