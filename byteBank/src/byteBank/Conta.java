package byteBank;

public class Conta {
	private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total = 0;
    
    public Conta() {
		super();
	}

	public Conta(int agencia, int numero){
    	System.out.println("Estou criando uma conta");
    	this.agencia = agencia;
        this.numero = numero;
        this.saldo = 100; 
        total++;
        System.out.println("Conta criada");
    }
        
    public static int getTotal() {
		return total;
	}

	public static void setTotal(int total) {
		Conta.total = total;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Cliente getTitular() {
		return this.titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public void deposita(double valor){
        this.saldo += valor;
    }
    
    public boolean saca(double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }
    
    public boolean transfere(double valor, Conta destino){
        if(this.saldo >= valor){
            this.saldo -= valor;
            destino.deposita(valor);    
            return true;
        }
        return false;
    }
}
