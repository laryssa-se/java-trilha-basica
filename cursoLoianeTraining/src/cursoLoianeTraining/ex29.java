package cursoLoianeTraining;

import java.util.Scanner;

public class ex29 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe três números: ");
		int numero1 = scan.nextInt();
		int numero2 = scan.nextInt();
		int numero3 = scan.nextInt();
		
		if(numero1 <= numero2 && numero1 <= numero3 && numero2 <= numero3) {
			System.out.println(numero3 + numero2 + numero1);
		} else if (numero1 <= numero2 && numero1 <= numero3 && numero3 <= numero2) {
			System.out.println(numero2 + numero3 + numero1);
		} else if(numero2 <= numero1 && numero2 <= numero3 && numero1 > numero3) {
			System.out.println(numero1 + numero3 + numero2);
		} else if (numero3 <= numero1 && numero3 <= numero2 && numero1 > numero2){
			System.out.println(numero2 + numero1 + numero3);
		} else if (numero3 <= numero1 && numero3 <= numero2 && numero2 > numero1){
			System.out.println(numero1 + numero2 + numero3);
		}
		
	}
}
