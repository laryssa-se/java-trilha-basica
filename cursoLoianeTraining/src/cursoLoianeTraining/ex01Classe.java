package cursoLoianeTraining;

public class ex01Classe {
	public static void main(String[] args) {
		
		lampada lampada = new lampada();
		lampada.modelo = "A60";
		lampada.tensao = "bivolt";
		lampada.potencia = 60;
		lampada.cor = "branca";
		lampada.tipoLuz = "led";
		lampada.garantiaMeses = 12;
		
		lampada.tipos = new String[2];
		lampada.tipos[0] = "abajur";
		lampada.tipos[1] = "quarto";
	}
}
