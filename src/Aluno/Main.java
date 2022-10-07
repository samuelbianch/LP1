package Aluno;

import utils.Teclado;

public class Main {

    public static void main(String[] args) {
        int cont = 0, resp = 0, matricula = 0;
        Teclado t = new Teclado();
        Aluno[] aluno = new Aluno[50];

        while (resp != 5) {
            Aluno.painelCrud();
            resp = t.leInt("Qual operação deseja fazer?");

            switch (resp) {
                case 1:
                    String n; int m;
                    n = t.leString("Nome: ");
                    m = t.leInt("Matricula: ");

                    for (int i=0; i<cont; i++){
                        if (aluno[i].getMatricula() == m) {
                            System.out.println("Esta matricula ja existe, informe uma nova matricula!");
                            m = t.leInt("Matricula: ");
                            if (i == 1) {
                                i = -1;
                            } else {
                               i = 0;
                            }
                        }
                    }
                    aluno[cont] = new Aluno(n, m);
                    cont++;
                    break;
                
                case 2: 
                    for (int i=0; i<cont; i++){
                        if (aluno[i] != null) {
                            System.out.println("---------------");
                            System.out.println("ID: " + i);
                            System.out.println(aluno[i].toString());
                            System.out.println("---------------");
                        }
                    }
                    break;

                case 3:
                    matricula = t.leInt("Qual a matricula do aluno: ");
                    for (int i=0; i<cont; i++){
                        if (aluno[i].getMatricula() == matricula) {
                            aluno[i].setNome(t.leString("Nome: "));
                            aluno[i].setMatricula(t.leInt("Matricula: "));
                            break;
                        }
                    }
                    break;

                case 4:
                    matricula = t.leInt("Qual a matricula do aluno");
                    for (int i=0; i<cont; i++){
                        if (aluno[i].getMatricula() == matricula) {
                            aluno[i] = null;
                            break;
                        }
                    }
                    break;

                case 5:
                    
                    double n1 = t.leDouble("Digite a nota 1: ");
                    double n2 = t.leDouble("Digite a nota 2: ");
                    double n3 = t.leDouble("Digite a nota 3: ");
                    double n4 = t.leDouble("Digite a nota 4: ");
                    int a = 0;
                    matricula = t.leInt("Qual a matricula do aluno");
                    for (int i=0; i<cont; i++){
                        if (aluno[i].getMatricula() == matricula) {
                            a = i;
                            System.out.println("A média deste aluno é: " + aluno[i].calculaNota(n1, n2, n3, n4));
                            break;
                        }
                    }

                    System.out.print("Situação -> "); aluno[a].situacao(aluno[a].calculaNota(n1, n2, n3, n4));

                case 6:
                    System.exit(0);

            }
        }
    }
}
