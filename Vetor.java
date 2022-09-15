import java.util.Scanner;

public class Vetor {
    public static void main(String[] args) {
        int n_alunos;
        System.out.print("Digite a quantidade de alunos: ");
        try (Scanner in = new Scanner( System.in )) {
            n_alunos = in.nextInt();
            
            float[] aluno = new float[n_alunos];
            float media = 0, soma = 0;

            for(int i=0; i<n_alunos; i++){
                System.out.print("Digite a nota do aluno " + i + ": ");
                aluno[i] = in.nextInt();
                soma += aluno[i];

            }

            media = soma / n_alunos;

            System.out.println("Alunos que obtiveram nota maior que a media");
            for(int i=0; i<n_alunos; i++){
                if (aluno[i] > media){
                    System.out.println(aluno[i]);
                }
            }

            System.out.println("Alunos que obtiveram nota menor que a media");
            for(int i=0; i<n_alunos; i++){
                if (aluno[i] < media){
                    System.out.println(aluno[i]);
                }
            }
        }
    }
}