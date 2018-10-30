package EjerciciosSueltos;

public class Sentenciasrepetitivas1 {

	public static void main(String[] args) {
		
		for(int i = 0;i<=5;i++) {
			System.out.println(i+1);
		}
		
		System.out.println("----------------------");
		for(int i=0; ;i++) {
			System.out.println(i);
			if(i==10)
				break; //sirve para parar un bucle infinito
		}
		
		System.out.println("----------------------");
		
		int i=1;
		while(i<=10) {
			System.out.println(i);
		}

	}

}
