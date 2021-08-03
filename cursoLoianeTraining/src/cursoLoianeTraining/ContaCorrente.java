package cursoLoianeTraining;

public class ContaCorrente {
	String numero;
	String agencia;
	double saldo;
	boolean especial;
	double limiteEspecial;
	double valorEspecialUsado;
	
    //saque
	boolean realizarSaque(double quantiaASacar) {
		//tem saldo na conta
		if(saldo >= quantiaASacar) {	
			saldo -= quantiaASacar;
			return true;
		} else {//nao tem saldo na conta
			if(especial) {
				//verifica se o limite especial tem saldo
				double limite = limiteEspecial + saldo;
				if(limite >= quantiaASacar) {
					saldo -= quantiaASacar;
					return true;
				} else {
					return false; //nao é especial e nao tem saldo suficiente
				} 
			} else {
				return false;
			}
	   }
	}
	
	void fazerDeposito(double valorDepositado) {
		saldo += valorDepositado;
	}
	
	void consultaSaldo() {
		System.out.println("Seu saldo é: " + saldo);
	}
	
	boolean usandoChequeEspecial() {
		if(saldo < 0) {
			return true;
		} else {
			return false;
		}
	}
}
