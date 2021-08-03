package cursoLoianeTraining;

public class ex51 {
	
	public static void main(String[] args) {
		
		Lampada2 lampada = new Lampada2();
		
		lampada.ligar();
		
		System.out.println("a lampada está: " + lampada.ligar);
		
		lampada.desligar();
		System.out.println("a lampada está: " + lampada.ligar);
	}
}
