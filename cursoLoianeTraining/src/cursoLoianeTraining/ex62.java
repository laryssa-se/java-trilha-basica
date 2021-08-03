package cursoLoianeTraining;

import java.util.Scanner;

public class ex62 {

	public static void main(String[] args) {
		imprimirTela(Calculadora.somar(1, 2));
		
		imprimirTela(Calculadora.subtrair(2, 1));
		
		imprimirTela(Calculadora.multiplicar(2, 2));
		
		imprimirTela(Calculadora.dividir(2, 2));

		imprimirTela(Calculadora.elevar(2, 3));
		
		
		Scanner scan = new Scanner(System.in);
		
		int num;
		
		do {
			System.out.println("Insira um número");
			num = scan.nextInt();
			
			if(num < 0) {
				System.out.println("Número invalido. Tente novamente");
			}
		}while(num < 0);
		
		System.out.println(Calculadora.fatorial(num));
	}
	
	static void imprimirTela(int num) {
		System.out.println(num);
	}

}
