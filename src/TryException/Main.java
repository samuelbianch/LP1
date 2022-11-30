package TryException;

import utils.Teclado;

public class Main {
    public static void main(String[] args) {
        Teclado t = new Teclado();
        try{
            int x = t.leInt("Digite um inteiro: ");
            int y = t.leInt("Digite um inteiro: ");
            System.out.println("Resultado: " + x/y);
        } catch (ArithmeticException e){
            System.out.println("Divisão por zero!");
        }
    }
}
