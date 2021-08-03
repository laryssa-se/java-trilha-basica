package byteBank;

public class CriaConta {
	public static void main(String[] args) {
        Conta primeiraConta = new Conta(200, 100);
        primeiraConta.setSaldo(200);
        System.out.println(primeiraConta.getSaldo());
        
        primeiraConta.setSaldo(primeiraConta.getSaldo() + 100);
        System.out.println(primeiraConta.getSaldo());
        
        Conta segundaConta = primeiraConta;
        segundaConta.setSaldo(50);

        System.out.println("primeira conta tem " + primeiraConta.getSaldo());
        System.out.println("segunda conta tem " + segundaConta.getSaldo());
        
        System.out.println(primeiraConta);
    }
}
