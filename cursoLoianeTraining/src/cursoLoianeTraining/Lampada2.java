package cursoLoianeTraining;

public class Lampada2 {
	private String modelo;
	private String tensao;
	private int potencia;
	private String cor;
	private String tipoLuz;
	private String garantiaMeses;
	
	private boolean ligada;
	
	public String ligar;
	
	public String getModelo() {
		return this.modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getTensao() {
		return this.tensao;
	}
	
	public void setTensao(String tensao) {
		this.tensao = tensao;
	}
	
	public int getPotencia() {
		return this.potencia;
	}
	
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	
	public String getCor() {
		return this.cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String getTipoLuz() {
		return this.tipoLuz;
	}
	
	public void setTipoLuz(String tipoLuz) {
		this.tipoLuz = tipoLuz;
	}
	
	public String getGarantiaMeses() {
		return this.garantiaMeses;
	}
	
	public void setGarantiaMeses(String garantiaMeses) {
		this.garantiaMeses = garantiaMeses;
	}
	
	public void ligar() {
		setLigada(true);
	}
	
	private boolean setLigada(boolean ligada) {
		return this.ligada;		
	}

	public void desligar() {
		setLigada(false);
	}
}
