package cursoLoianeTraining;

import java.util.Scanner;

public class ex35 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean valido = false; 
		double populacaoA;
		double populacaoB;
		double taxaA;
		double taxaB;
		
		do {
			System.out.println("Entre com a populacao A: ");
			populacaoA = scan.nextDouble();
			if(populacaoA > 0) {
				valido = true;
			} else {
				System.out.println("Populacao A precisa ser maior que zero.");
			}			
		}while(!valido);
		
		
		valido = false;
		do {
			System.out.println("Entre com a populacao B: ");
			populacaoB = scan.nextDouble();
			if(populacaoB > 0) {
				valido = true;
			} else {
				System.out.println("Populacao B precisa ser maior que zero.");
			}			
		}while(!valido);
		
		valido = false;
		do {
			System.out.println("Entre com a taxa de crescimento da populacao A: ");
			taxaA = scan.nextDouble();
			if(taxaA > 0) {
				valido = true;
			} else {
				System.out.println("A taxa de crescimento de A precisa ser maior que zero.");
			}			
		}while(!valido);
		
		valido = false;
		do {
			System.out.println("Entre com a taxa de crescimento da populacao B: ");
			taxaB = scan.nextDouble();
			if(taxaB > 0) {
				valido = true;
			} else {
				System.out.println("A taxa de crescimento de B precisa ser maior que zero.");
			}			
		}while(!valido);
		
		int count = 0;		
		while(populacaoA < populacaoB) {
			populacaoA += (populacaoA/100)*taxaA;
			populacaoB += (populacaoB/100)*taxaB;
			count++;
			}
	
		System.out.println("A populacao A é de: " + populacaoA);
		System.out.println("A populacao B é de: " + populacaoB);
		System.out.println("A quantidade de anos para A alcançar B é de: " + count);
		
	}
	
}
