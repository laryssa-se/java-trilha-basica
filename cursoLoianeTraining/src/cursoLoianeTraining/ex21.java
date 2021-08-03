package cursoLoianeTraining;

import java.util.Scanner; 

public class ex21 {

		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Insira dois numeros");
			int numero1 = scan.nextInt();
			int numero2 = scan.nextInt();
			
			if(numero1 > numero2) {
				System.out.println(numero1);
			} else if (numero2 > numero1) {
				System.out.println(numero2);
			} else {
				System.out.println("os numeros sao iguais");
			}
			
		}
}
