package byteBank;

public abstract class Conta {
	protected double saldo;
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
//        this.saldo = 100; 
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

	public abstract void deposita(double valor);
    
    public void saca(double valor) throws SaldoInsuficienteException{
    	
        if(this.saldo < valor){
        	throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
        } 
        this.saldo -= valor;
    }
    
    public void transfere(double valor, Conta destino) throws SaldoInsuficienteException{
        this.saca(valor);
        destino.deposita(valor);             
    }
}
