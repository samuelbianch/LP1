package Conta;

public class main {
    public static void main(String[] args) {
        Conta c1 = new Conta();

        c1.nome_banco = "Banco do IFMT";
        c1.nome_user = "Fulano";

        c1.depositar(300);
        c1.saldo();
        c1.sacar(130);
        c1.saldo();
        c1.calculaRendimento();
    }
}
