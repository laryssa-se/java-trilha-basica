package cursoLoianeTraining;

import java.util.Scanner;

public class ex6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira o raio de um circulo: ");
		
		int raio = scan.nextInt();
		
		System.out.println("A área do circulo é: " + raio*raio*3.14);
	}
}
