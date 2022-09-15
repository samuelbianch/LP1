import java.util.Scanner;

public class Pessoa {
    String nome;
    int cpf;

    public void ola() {
        System.out.println("Oi meu nome é "+ nome + " meu CPF é: "+ cpf);
    }

    public void cadastraPessoa() {
        System.out.print("Digite o nome: ");
        Scanner in = new Scanner( System.in );
        nome = in.nextLine();
        System.out.print("Digite um CPF: ");
        cpf = in.nextInt();
    } 
    
}

