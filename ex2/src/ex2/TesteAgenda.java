package ex2;

public class TesteAgenda {

	public static void main(String[] args) {

		Agenda agenda = new Agenda();

		agenda.armazenaPessoa("Perola", 6, 0.40f);
		agenda.armazenaPessoa("Temaki", 3, 0.50f);
		agenda.armazenaPessoa("Link", 4, 0.25f);
		agenda.armazenaPessoa("Aquarela", 2, 0.10f);
		agenda.armazenaPessoa("Laryssa", 26, 1.60f);

		agenda.removePessoa("Laryssa");

		agenda.imprimeAgenda();

		System.out.println(agenda.buscaPessoa("Aquarela"));

		agenda.imprimeAgenda();

		agenda.imprimePessoa(3);

	}
}
