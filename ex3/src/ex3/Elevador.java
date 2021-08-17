package ex3;

public class Elevador {

	private int andarAtual;
	private int totalAndares;
	private int capacidadeElevador;
	private int qtdPessoas;

	public int getAndarAtual() {
		return andarAtual;
	}

	public void setAndarAtual(int andarAtual) {
		this.andarAtual = andarAtual;
	}

	public int getTotalAndares() {
		return totalAndares;
	}

	public void setTotalAndares(int totalAndares) {
		this.totalAndares = totalAndares;
	}

	public int getCapacidadeElevador() {
		return capacidadeElevador;
	}

	public void setCapacidadeElevador(int capacidadeElevador) {
		this.capacidadeElevador = capacidadeElevador;
	}

	public int getQtdPessoas() {
		return qtdPessoas;
	}

	public void setQtdPessoas(int qtdPessoas) {
		this.qtdPessoas = qtdPessoas;
	}

	public void inicializa(int capacidadeElevador, int totalAndares) {
		setAndarAtual(0);
		setQtdPessoas(0);
		setCapacidadeElevador(capacidadeElevador);
		setTotalAndares(totalAndares);
	}

	public void entra() {
		if (qtdPessoas < capacidadeElevador) {
			qtdPessoas++;
			System.out.println("Quantidade de pessoas no elevador é de: " + getQtdPessoas());
		} else {
			System.out.println("Capacidade máxima de pessoas alcançada!");
		}
	}

	public void sai() {
		if (qtdPessoas > 0) {
			qtdPessoas--;
			System.out.println("Quantidade de pessoas no elevador é de: " + getQtdPessoas());
		} else {
			System.out.println("Não tem ninguém no elevador!");
		}
	}

	public void sobe() {
		if (andarAtual < totalAndares) {
			andarAtual++;
			System.out.println("Andar atual: " + getAndarAtual());
		} else {
			System.out.println("Não possuem mais andares acima!");
		}
	}

	public void desce() {
		if (andarAtual > 0) {
			andarAtual--;
			System.out.println("Andar atual: " + getAndarAtual());
		} else {
			System.out.println("Não há andares abaixo do andar atual!");
		}
	}

}