package ex4;

public class Televisao {
	private int volumeMax = 5;
	private int volumeMin = 0;
	private int canalMax = 5;
	private int canalMin = 0;
	private int volumeAtual = 0;
	private int canalAtual = 0;

	public int getCanalAtual() {
		return canalAtual;
	}

	public void setCanalAtual(int canalAtual) {
		if (canalAtual < canalMax) {
			this.canalAtual = canalAtual;
			System.out.println("O canal atual é: " + canalAtual);
		} else {
			System.out.println("Não existe esse canal!");
		}

	}

	public int getVolumeAtual() {
		return volumeAtual;
	}

	public void setVolumeAtual(int volumeAtual) {
		if (volumeAtual < volumeMax) {
			this.volumeAtual = volumeAtual;
			System.out.println("O volume atual é: " + volumeAtual);
		} else {
			System.out.println("Não é possível aumentar mais o volume. Capacidade máxima alcançada!");
		}
	}

	public void aumentarPotenciaVolume() {
		if (volumeAtual < volumeMax) {
			volumeAtual++;
			System.out.println("O volume atual da televisão é: " + volumeAtual);
		} else {
			System.out.println("O volume da televisão está no máximo: " + volumeAtual);
		}
	}

	public void diminuirPotenciaVolume() {
		if (volumeAtual > volumeMin) {
			volumeAtual--;
			System.out.println("O volume atual da televisão é: " + volumeAtual);

		} else {
			System.out.println("O volume da televisão está no mínimo: " + volumeAtual);
		}
	}

	public void aumentarCanal() {
		if (canalAtual < canalMax) {
			canalAtual++;
			System.out.println("O canal atual é: " + canalAtual);
		}
	}

	public void diminuirCanal() {
		if (canalAtual > canalMin) {
			canalAtual--;
			System.out.println("O canal atual é: " + canalAtual);
		}
	}

}
