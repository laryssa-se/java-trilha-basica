package ex3;

public class TesteElevador {

	public static void main(String[] args) {

		Elevador elevador = new Elevador();

		elevador.inicializa(5, 3);

		elevador.entra();
		elevador.entra();
		elevador.entra();
		elevador.entra();
		elevador.entra();
		elevador.entra();

		elevador.sai();
		elevador.sai();
		elevador.sai();
		elevador.sai();
		elevador.sai();
		elevador.sai();

		elevador.sobe();
		elevador.sobe();
		elevador.sobe();
		elevador.sobe();

		elevador.desce();
		elevador.desce();
		elevador.desce();
		elevador.desce();
	}

}
