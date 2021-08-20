package ex5;

import java.util.ArrayList;
import java.util.List;

public class TesteCadastroCaminhao {
	public static void main(String[] args) {
		List<Caminhao> caminhoes = new ArrayList<>();

		ControleCaminhao.armazenaCaminhoes(caminhoes);
		ControleCaminhao.imprimirListaCaminhoes(caminhoes);

	}
}
