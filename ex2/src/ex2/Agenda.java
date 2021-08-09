package ex2;

import java.util.ArrayList;

public class Agenda {

	ArrayList<Pessoa> pessoas = new ArrayList<>();

	public void armazenaPessoa(String nome, int idade, float altura) {
		pessoas.add(new Pessoa(nome, idade, altura));
	}

	public void removePessoa(String nome) {
		Pessoa pessoaParaRemover = pessoas.get(buscaPessoa(nome));
		pessoas.remove(pessoaParaRemover);
	}

	public int buscaPessoa(String nome) {

		for (int i = 0; i < pessoas.size(); i++) {
			if (pessoas.get(i).getNome().equals(nome)) {
				return i;
			}
		}
		return -1;
	}

	public void imprimeAgenda() {
		for (int i = 0; i < pessoas.size(); i++) {
			System.out.println(pessoas.get(i));
		}
	}

	public void imprimePessoa(int i) {
		System.out.println(pessoas.get(i));
	}
}
