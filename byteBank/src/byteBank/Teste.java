package byteBank;

public class Teste {
	public static void main(String[] args) {
		Conta contaDaMarcela = new Conta();

		contaDaMarcela.setTitular(new Cliente());
		
		contaDaMarcela.getTitular().setNome("Marcela");
	}
}
