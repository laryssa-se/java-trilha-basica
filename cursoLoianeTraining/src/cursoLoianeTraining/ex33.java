package cursoLoianeTraining;

import java.util.Scanner;

public class ex33 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean informacoesValidas = false;
		String nome;
		int idade;
		double salario;
		String sexo;
		String estadoCivil;
		
		do {
			System.out.println("Insira seu nome:");
			nome = scan.next();
			if(nome.length() > 3) {
				informacoesValidas = true;
			} else {
				System.out.println("Nome invalido. Insira novamente um nome com mais de 3 caracteres!");
			}			
		} while(!informacoesValidas);
		
		informacoesValidas = false;
		do {
			System.out.println("Insira a sua idade:");
			idade = scan.nextInt();
			if(idade >= 0 && idade <= 150) {
				informacoesValidas = true;
			} else {
				System.out.println("Idade invalida. Insira outra idade entre 0-150 anos");
			}
		} while(!informacoesValidas);
		
		informacoesValidas = false;
		do {
			System.out.println("Insira o quanto ganha:");
			salario = scan.nextDouble();
			if(salario > 0) {
				informacoesValidas = true;
			} else {
				System.out.println("Insira um salario maior que 0:");
			}
			
		} while(!informacoesValidas);
		
		informacoesValidas = false;
		do {
			System.out.println("Insira seu sexo f-m:");
			sexo = scan.next();
			if(sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")) {
				informacoesValidas = true;
			} else {
				System.out.println("Insira f ou m");
			}
		} while(!informacoesValidas);
		
		informacoesValidas = false;
		do {
			System.out.println("Insira seu estado civil:");
			estadoCivil = scan.next();
			if(estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c") || 
					estadoCivil.equalsIgnoreCase("v") || estadoCivil.equalsIgnoreCase("d")) {
				informacoesValidas = true;
			} else {
				System.out.println("Insira um estado civil válido: ");
			}			
		} while(!informacoesValidas);		
	}
}
