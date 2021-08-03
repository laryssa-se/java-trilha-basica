package byteBankHerdado;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		Gerente maria = new Gerente();
		maria.setNome("Maria Silva");
		maria.setCpf("1234567-89");
		maria.setSalario(10000.00);
		
		System.out.println(maria.getNome());
		System.out.println(maria.getBonificacao());

	}

}
