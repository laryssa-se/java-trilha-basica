package cursoLoianeTraining;

import java.util.Scanner;

public class ex12 {

		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Insira sua altura: ");
			double altura = scan.nextDouble();
			
			System.out.println("Seu peso ideal é: " + ((72.7*altura)-58));
			
		}
}
