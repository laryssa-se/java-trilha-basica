package ex5;

import java.util.List;

public class Caminhao {
	private String tipoCaminhao;
	private int numeroPluviometros;
	private List<String> listaPluviometros;

	public Caminhao(String tipoCaminhao, int numeroPluviometros, List<String> listaPluviometros) {
		super();
		this.tipoCaminhao = tipoCaminhao;
		this.numeroPluviometros = numeroPluviometros;
		this.listaPluviometros = listaPluviometros;
	}

	public String getTipoCaminhao() {
		return tipoCaminhao;
	}

	public int getNumeroPluviometros() {
		return numeroPluviometros;
	}

	public List<String> getListaPluviometros() {
		return listaPluviometros;
	}

	@Override
	public String toString() {
		return "Caminhao [tipoCaminhao=" + tipoCaminhao + ", numeroPluviometros=" + numeroPluviometros
				+ ", listaPluviometros=" + listaPluviometros + "]";
	}

}
