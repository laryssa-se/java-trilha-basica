package cursoLoianeTraining;

import java.util.Scanner;

public class ex10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira a temperatura em Celsius: ");
		int temperaturaC = scan.nextInt();
		
		double temperaturaF = (temperaturaC*1.8+32);
		
		System.out.println(temperaturaF);
		
	}
}
