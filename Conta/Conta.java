package Conta;

public class Conta {
    public String nome_user;
    public String nome_banco;
    public int n_agencia;
    public int n_conta;
    public float saldo;

    public void sacar (float n){
        saldo -= n;
    }

    public void depositar (float n){
        saldo += n;
    }

    public void saldo() {
        System.out.println(saldo);
    }

    public float calculaRendimento() {
        return (float) (saldo * 0.01);
    }

    public void recuperaDadosParaImpressao () {
        System.out.println("Nome do banco: " + nome_banco);
        System.out.println("Nome do usuario: " + nome_user);
        System.out.println("Número da agencia: " + n_agencia);
        System.out.println("Número da conta: " + n_conta);

    }
    
}
