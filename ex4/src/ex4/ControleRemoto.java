package ex4;

public class ControleRemoto {
	Televisao televisao;

	public ControleRemoto(Televisao televisao) {
		super();
		this.televisao = televisao;
	}

	public void aumentarPotenciaVolume() {
		televisao.aumentarPotenciaVolume();
	}

	public void diminuirPotenciaVolume() {
		televisao.diminuirPotenciaVolume();
	}

	public void aumentarCanal() {
		televisao.aumentarCanal();
	}

	public void diminuirCanal() {
		televisao.diminuirCanal();
	}

	public void setCanalAtual(int canal) {
		televisao.setCanalAtual(canal);
	}

	public void getCanalAtual() {
		televisao.getCanalAtual();
	}

	public void setVolumeAtual(int volume) {
		televisao.setVolumeAtual(volume);
	}

	public void getVolumeAtual() {
		televisao.getVolumeAtual();
	}
}
