import java.util.Scanner;

public class MenuCalculadora {
    
    public static void main(String[] args) {
        int opc = 0;
        int n1=0, n2=0;
        Calculadora c = new Calculadora();
        Scanner in = new Scanner( System.in );
        c.menu();
        opc = in.nextInt();
        while(opc!=5){        
            System.out.println("Digite um número");
            n1 = in.nextInt();
            System.out.println("Digite outro número");
            n2 = in.nextInt();

            switch (opc){
                case 1:
                    System.out.println("A soma deles é: "+ c.soma(n1, n2));
                break;
                case 2:
                    System.out.println("A subtração deles é: "+ c.subtrair(n1, n2));
                break;
                case 3:
                    System.out.println("A multiplicação deles é: "+ c.multiplicacao(n1, n2));
                break;
                case 4:
                    System.out.println("A divisao deles é: "+ c.divisao(n1, n2));
                break;
            }

            c.menu();
            opc = in.nextInt();
        }
    }
}