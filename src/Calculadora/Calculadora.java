package Calculadora;
public class Calculadora {
    public int n1, n2;

    public int soma(int n1, int n2) {
        return n1 + n2;
    }
    
    public int subtrair(int n1, int n2) {
        return n1 - n2;
    }

    
    public int multiplicacao(int n1, int n2) {
        return n1 * n2;
    }

    
    public float divisao(int n1, int n2) {
        return n1 / n2;
    }

    public void menu() {
        System.out.println("1 - Soma");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.println("5 - Sair");
        System.out.print("O que deseja fazer: ");
    }
}
