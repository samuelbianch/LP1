import utils.Teclado;

public class Main {
	
	public static void main(String[] args) {
		Conta c1 = new Conta();
		Teclado t = new Teclado();
		
		c1.setNome(t.leString("Digite seu nome: "));
		c1.setBanco(t.leString("Digite o nome do banco: "));
		c1.setCpf(t.leInt("Digite seu CPF"));
		c1.depositar(t.leDouble("Quanto deseja depositar: "));
		
		c1.consultaConta();
		
		Conta.getTotalContas();

	}

}
