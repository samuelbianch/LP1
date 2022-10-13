package RHSis;

public class Funcionario {
    private String nome;
    private String tipo;
    private double salarioBase;
    private int id;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public double getSalarioBase() {
        return salarioBase;
    }
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }


    public Funcionario(String nome, String tipo, double salarioBase, int id){
        this.nome = nome;
        this.tipo = tipo;
        this.salarioBase = salarioBase;
        this.id = id;
    }

    public String toString() {
        return "ID: " + this.id + "\nNome: " + this.nome + "\nTipo: " + this.tipo + "\nSalario: " + calculaSalario();
    }

    public double calculaSalario() {
        if(this.tipo.equals("N1")) {
            return 1.10 * this.salarioBase;
        } else if (this.tipo.equals("N2")) {
            return this.salarioBase + 1200;
        }else {
            return 0;
        }
    }

}
