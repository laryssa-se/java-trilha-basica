package cursoLoianeTraining;

import java.util.Scanner;

public class ex32 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean informacoesValidas = false;
		String usuario;
		String senha;
		
		do {
			
			System.out.println("Insira o nome de usuário: ");
			usuario = scan.next();
			System.out.println("Insira uma senha: ");
			senha = scan.next();
			
			
			if(usuario.equalsIgnoreCase(senha)) {
				informacoesValidas = false;
				System.out.println("A senha não pode ser igual ao usuário. Insira uma nova senha: ");
				
			} else {
				System.out.println("Senha válida!");
				break;
			}
			
		} while (!informacoesValidas);
	}
}
