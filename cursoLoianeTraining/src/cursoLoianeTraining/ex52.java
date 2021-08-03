package cursoLoianeTraining;

public class ex52 {

		public static void main(String[] args) {
			
			ContaCorrente conta = new ContaCorrente();
			conta.numero = "12345-6";
			conta.agencia = "1234";
			conta.especial = true;
			conta.limiteEspecial = 500;
			conta.saldo = -10;
			conta.valorEspecialUsado = 0;
			
			
			boolean saqueEfetuado = conta.realizarSaque(10);
			
			if(saqueEfetuado) {
				System.out.println("Saque efetuado com sucesso");
				System.out.println("Saldo atual da conta = " + conta.saldo);
			} else {
				System.out.println("nao possivel realizar saque. saldo insuficiente");
			}
			
			

			conta.realizarSaque(500);
			
			if(saqueEfetuado) {
				System.out.println("Saque efetuado com sucesso");
				System.out.println("Saldo atual da conta = " + conta.saldo);
			} else {
				System.out.println("nao possivel realizar saque. saldo insuficiente");
			}
			
			conta.fazerDeposito(500);
			
		}
}
