package Conta;

public class Main {
    public static void main(String[] args) {
        Conta c1 = new Conta();

        c1.setBanco("Banco do Brasil");
        c1.setNome("Fulano");
        c1.setCpf(111);
        
        System.out.println("Conta: "+ c1.toString() + "\n");

        System.out.println("Total de contas na classe Conta: " + Conta.getTotalContas());
    }
}
