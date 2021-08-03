package cursoLoianeTraining;

import java.util.Scanner;

public class ex43 {
public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[15];
		int[] vetorB = new int[vetorA.length];
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Insira um numero para a posicao " + i);
			vetorA[i] = scan.nextInt();
			vetorB[i] = vetorA[i]*vetorA[i];
		}
		
		System.out.println("Vetor A: ");
		for(int i = 0; i <vetorA.length; i++) {
			System.out.println(vetorA[i] + " ");
		}
		
		System.out.println("Vetor B: ");
		for(int i = 0; i <vetorB.length; i++) {
			System.out.println(vetorB[i] + " ");
		}
	}
}
