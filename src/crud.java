import java.util.Scanner;

public class crud {
    public static int[] n = new int[10];
    public static void main (String[] args){
        
        int escolha;

        System.out.println("-------------------Bem vindo---------------");
        System.out.println("1 - Inserir");
        System.out.println("2 - Alterar");
        System.out.println("3 - Excluir");
        System.out.println("4 - Exibir");
        System.out.println("5 - Sair");
        System.out.println("-------------------------------------------");
        Scanner in = new Scanner( System.in );
        escolha = in.nextInt();

        switch(escolha){
            case 1:
                inserir();
            break;
        }
        
    }

    public static void inserir () {
        for (int i=0; i<10; i++){
            Scanner in = new Scanner( System.in );
                n[i] = in.nextInt();
        }
    }

    public static void alterar () {
        int x, y;
        System.out.print("Qual posição deseja alterar: ");
        Scanner in = new Scanner( System.in );
        x = in.nextInt();
        System.out.print("Digite o novo valor: ");
        y = in.nextInt();
        n[x] = y;
    }

    public static void excluir () {
        int x, y;
        System.out.print("Qual posição deseja excluir: ");
        Scanner in = new Scanner( System.in );
        x = in.nextInt();
        n[x] = 0;
    }

    public static void exibir () {
        int x, y;
        System.out.print("Qual posição deseja excluir: ");
        Scanner in = new Scanner( System.in );
        x = in.nextInt();
        n[x] = 0;
    }

}
