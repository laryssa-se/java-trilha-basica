package ex4;

public class TesteControleRemoto {

	public static void main(String[] args) {

		Televisao televisao = new Televisao();

		ControleRemoto controleRemoto = new ControleRemoto(televisao);

		controleRemoto.aumentarPotenciaVolume();
		controleRemoto.aumentarPotenciaVolume();
		controleRemoto.aumentarPotenciaVolume();
		controleRemoto.aumentarPotenciaVolume();
		controleRemoto.aumentarPotenciaVolume();
		controleRemoto.aumentarPotenciaVolume();

		controleRemoto.diminuirPotenciaVolume();
		controleRemoto.diminuirPotenciaVolume();
		controleRemoto.diminuirPotenciaVolume();
		controleRemoto.diminuirPotenciaVolume();
		controleRemoto.diminuirPotenciaVolume();
		controleRemoto.diminuirPotenciaVolume();

		controleRemoto.aumentarCanal();
		controleRemoto.aumentarCanal();
		controleRemoto.aumentarCanal();
		controleRemoto.aumentarCanal();
		controleRemoto.aumentarCanal();
		controleRemoto.aumentarCanal();
		controleRemoto.aumentarCanal();

		controleRemoto.diminuirCanal();
		controleRemoto.diminuirCanal();
		controleRemoto.diminuirCanal();
		controleRemoto.diminuirCanal();
		controleRemoto.diminuirCanal();
		controleRemoto.diminuirCanal();

		controleRemoto.setCanalAtual(4);
		controleRemoto.setCanalAtual(5);

		controleRemoto.setVolumeAtual(3);
		controleRemoto.setVolumeAtual(6);

	}
}
