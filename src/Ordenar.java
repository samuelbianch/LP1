import java.util.Scanner;

public class Ordenar {
    public static void main(String[] args) {
        int[] nota = new int[10];
        int aux;
        try (Scanner in = new Scanner( System.in )) {
            for(int i=0; i<10; i++){
                System.out.print("Digite a nota " + i + ": ");
                nota[i] = in.nextInt();
            }

            for(int i=0; i<10; i++){
                for(int j=i; j<10; j++){
                    if(nota[i]>nota[j]){
                        aux = nota[j];
                        nota[j] = nota[i];
                        nota[i] = aux;
                    }
                }
            }

            System.out.println("Notas ordenadas: ");
            for(int i=0; i<10; i++){
                System.out.print(nota[i] + " ");
            }

        }

    }
}
