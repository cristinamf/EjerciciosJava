 package EjerciciosSueltos;

public class DibujosConAsteriscos {
	static void volcan (int h) {
		int asteriscos=2;
		int espacios;
		int total = (int)Math.pow(2,h)/2;
		for(int i=0; i<h; i++) {
			espacios = total - asteriscos/2 ;
			for(int j=0;j < espacios;j++) {		
				System.out.print(' ');
			}
			for(int j=0; j < asteriscos; j++) {
				System.out.print('*');
			}
			asteriscos += asteriscos;
			System.out.println();
		}
	}
	
	static void mosaico(int f, int c) {
		for (int i=0; i<f; i++) {
			for (int j=0; j<c; j++) {
				if((i%2 ==0 && j%2 !=0) || (i%2!=0 && j%2==0)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
//	static void tableromio(int f, int c) {
//		int s=0;
//		int j=0;
//		int m=0;
//		
//		while (m<4) {
//			while (j<3) {
//				s=0;
//				while (s<4) {
//					for(int i=1; i<=3; i++) {
//						System.out.print("*");
//					}
//					for (int i=3; i>=1; i--) {
//						System.out.print(" ");
//					}
//					s++;
//				}
//				System.out.println("");
//				j++;
//			}
//			while(j>0) {
//				s=3;
//				while(s>0) {
//					for(int i=1; i<=3; i++) {
//						System.out.print(" ");
//					}
//					for (int i=3; i>=1; i--) {
//						System.out.print("*");
//					}
//					s--;
//				}
//				System.out.println("");
//				j--;
//			}
//			m++;
//		}
//	}
		static void tablero(int f, int c, int l) {
			int ctxt = c * l;
			int ftxt = f * l;
			for (int i = 0; i < ftxt; i++) {
				for (int j = 0; j < ctxt; j++) {
					int ctab = j / l;
					int ftab = i / l;
					if ((ftab % 2 == 0 && ctab % 2 != 0) || (ftab % 2 != 0 && ctab % 2 == 0))
						System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.println();
			}
		}
		
	public static void main (String args []) {
//		volcan (6);
//		mosaico(8, 8);
//		tableromio (8, 8);
		
	}
}
