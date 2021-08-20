package ex5;

import java.util.ArrayList;
import java.util.List;

public class ControleCaminhao extends Controle {
	public static void armazenaCaminhoes(List<Caminhao> caminhoes) {
		String tipoCaminhao = " ";
		int numeroPluviometros = 0;
		List<String> listaPluviometros;

		for (; !tipoCaminhao.equalsIgnoreCase("Fim");) {
			listaPluviometros = new ArrayList<>();

			System.out.println(
					"Informe se o tipo do caminhão é Alpha ou Beta. Após inserir todos os tipos de caminhão, digite 'Fim' para encerrar a lista: ");
			tipoCaminhao = leString();

			if (tipoCaminhao.equalsIgnoreCase("Fim")) {
				break;
			} else if (!tipoCaminhao.equalsIgnoreCase("Beta") && !tipoCaminhao.equalsIgnoreCase("Alpha")) {
				System.out.println("Essa opção não é válida. Digite 'Alpha' ou 'Beta'");
				continue;
			}

			System.out.println("Insira o número de pluviometros a serem transportados pelo caminhao: ");
			numeroPluviometros = leInteiro();

			System.out.println("Insira o tipo de pluviômetro que será transportado no caminhão: ");
			for (int i = 0; i < numeroPluviometros; i++) {
				System.out.println(("Tipo: " + (i + 1)));
				listaPluviometros.add(leString());
			}

			caminhoes.add(new Caminhao(tipoCaminhao, numeroPluviometros, listaPluviometros));
		}

	}

	public static void imprimirListaCaminhoes(List<Caminhao> caminhoes) {
		caminhoes.forEach(caminhao -> {
			System.out.println("Tipo do caminhão: " + caminhao.getTipoCaminhao());
			System.out.println("Número de pluviômetros: " + caminhao.getNumeroPluviometros());
			System.out.println("Lista de pluviômetros: " + caminhao.getListaPluviometros());
		});
	}
}
