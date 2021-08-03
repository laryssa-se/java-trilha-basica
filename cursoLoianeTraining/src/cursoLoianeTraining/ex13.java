package cursoLoianeTraining;

import java.util.Scanner;

public class ex13 {

		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Insira o quanto você ganha por hora: ");
			int valorGanhoHora = scan.nextInt();
			
			System.out.println("Insira o numero de horas trabalhadas no mês: ");
			int numeroHorasTrabalhadas = scan.nextInt();
			
			double salarioSemDesconto = valorGanhoHora*numeroHorasTrabalhadas;
			
			double descontoInss = salarioSemDesconto-(0.08);
			System.out.println("Pagou para o INSS: " + descontoInss);
			
			double descontoSindicato = salarioSemDesconto-(0.05);
			System.out.println("Pagou para o Sindicato: " + descontoSindicato);
			
			double salarioFinal = salarioSemDesconto-(0.11)-(0.08)-(0.05);
			System.out.println("Salario liquido é: " + salarioFinal);
		}
}
