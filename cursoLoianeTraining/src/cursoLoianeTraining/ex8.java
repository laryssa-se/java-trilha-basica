package cursoLoianeTraining;

import java.util.Scanner;

public class ex8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Insira o valor do quanto você ganha por hora: ");
		int valorPorHora = scan.nextInt();
		
		System.out.println("Insira quantas horas no mês você trabalha: ");
		int horasTrabalhadasMes = scan.nextInt();
		
		System.out.println("Seu salario do mês é: " + valorPorHora*horasTrabalhadasMes);
		
	}
}
