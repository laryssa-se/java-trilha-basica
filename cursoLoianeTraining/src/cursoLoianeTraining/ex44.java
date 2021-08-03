package cursoLoianeTraining;

import java.nio.file.FileSystemNotFoundException;
import java.util.Scanner;

public class ex44 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[10];
		int[] vetorC = new int[vetorA.length];
		
		System.out.println("Insira 10 numeros inteiros para o vetor A:");
		for(int i = 0; i < vetorA.length; i++) {
			vetorA[i] = scan.nextInt();
		}
		
		System.out.println("Insira 10 numeros inteiros para o vetor B:");
		for(int i = 0; i < vetorB.length; i++) {
			vetorB[i] = scan.nextInt();
		}
		
		for(int i = 0; i < vetorC.length; i++) {
			vetorC[i] = vetorA[i]*vetorB[i]; 			
			System.out.println("O vetor C é: " + vetorC[i]);
		}	
		
		
	}
}
