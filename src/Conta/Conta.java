package Conta;

public class Conta {
	
	private double saldo;
	private String nome;
	private String banco;
	private int cpf;
	private static int totalContas;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	Conta () {
		Conta.totalContas = Conta.totalContas + 1;
	}
	
	public void sacar(double valor) {
		if (this.saldo >= valor) {
			this.saldo = this.saldo - valor;
		} else {
			System.out.println("Saldo insuficiente");
		}
		
	}
	
	public void depositar(double valor) {
		this.saldo = this.saldo + valor;
	}
	
	public void consultaSaldo() {
		System.out.println(this.saldo);
	}
	
	public static int getTotalContas() {
		return Conta.totalContas;
	}
	
	public void consultaConta() {
		System.out.println("---------------------------------");
		System.out.println("Nome: "+ this.nome);
		System.out.println("Banco: "+ this.banco);
		System.out.println("CPF: "+ this.cpf);
		System.out.println("Saldo: "+ this.saldo);
		System.out.println("---------------------------------");
	}
	
	public boolean transfere(Conta destino){
		return false;
	}

	@Override
	public String toString() {
		return "Conta [saldo=" + saldo + ", nome=" + nome + ", banco=" + banco + ", cpf=" + cpf + "]";
	}
}
