package cursoLoianeTraining;

import java.util.Scanner;

public class ex9 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira o valor da temperatura em Farenheit");
		int temperaturaF = scan.nextInt();
		
		int temperaturaC = (5*(temperaturaF-32)/9);
		
		System.out.println(temperaturaC);
		
	}
}
