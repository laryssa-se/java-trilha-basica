package cursoLoianeTraining;

import java.util.Scanner;

public class ex31 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean notaValida = false;
		do {
			System.out.println("Insira uma nota entre 0-10: ");
			double nota = scan.nextDouble();
			
			if(nota >= 0 && nota <=10) {
				notaValida = true;
				System.out.println("Você digitou: " + nota);
			} else {
				notaValida = false;
				System.out.println("Nota invalida. Insira outra nota: ");
			}
		} while (!notaValida);
	}
}
