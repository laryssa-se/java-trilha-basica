package cursoLoianeTraining;

import java.util.Scanner;

public class ex22 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("insira um valor:");
		int valor = scan.nextInt();
		
		if(valor > 0) {
			System.out.println("valor inserido é positivo");
		} else {
			System.out.println("valor inserido é negativo");
		}
		
	}
}
