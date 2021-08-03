package cursoLoianeTraining;

import java.util.Scanner;
public class ex11 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira dois numeros inteiros: ");
		int numeroInteiro2 = scan.nextInt();
		int numeroInteiro1 = scan.nextInt();
		
		System.out.println("Insira um numero real: ");
		double numeroReal = scan.nextDouble();
		
		System.out.println("O produto do dobro do primeiro com metade do segundo: " + (numeroInteiro1*numeroInteiro1)*(numeroInteiro2/2));
		System.out.println("A soma do triplo do primeiro com o terceiro: " + ((numeroInteiro1*3)+numeroReal));
		System.out.println("O terceiro elevado ao cubo: " + numeroReal*numeroReal*numeroReal);
		
		
	}
}
