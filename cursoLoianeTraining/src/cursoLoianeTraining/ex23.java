package cursoLoianeTraining;

import java.util.Scanner;

public class ex23 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("insira seu sexo:");
		String sexo = scan.next();
			
		if(sexo.equalsIgnoreCase("f")) {
			System.out.println("Feminino");
		} else if (sexo.equalsIgnoreCase("m")) {
			System.out.println("Masculino");
		} else {
			System.out.println("Sexo Invalido");
		}
	}
}

