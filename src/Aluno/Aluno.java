package Aluno;
public class Aluno {

    private String nome;
    private int matricula;

    public Aluno(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String toString() {
        return "Nome: " + getNome() + " | Matricula: " +getMatricula();
    }

    public static void painelCrud() {
        System.out.println("------------------------------");
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Ver alunos");
        System.out.println("3 - Atualizar");
        System.out.println("4 - Excluir");
        System.out.println("5 - Sair");
        System.out.println("------------------------------");
    }
    
}
