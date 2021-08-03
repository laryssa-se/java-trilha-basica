package cursoLoianeTraining;

import java.util.Scanner;

public class ex4 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira as notas bimestrais: ");
		
		int nota1 = scan.nextInt();
		int nota2 = scan.nextInt();
		int nota3 = scan.nextInt();
		int nota4 = scan.nextInt();
		
		int mediaNotas = (nota1+nota2+nota3+nota4)/4;
		
		System.out.println(mediaNotas);
	}
}
