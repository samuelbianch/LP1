package Pais;

import java.util.Objects;

import utils.Teclado;

public class Pais {
    
    private String iso;
    private String nome;
    private String populacao;
    private String dimensao;
    private int i;
    public int fronteira[];

    Teclado teclado = new Teclado();

    public Pais(String iso, String nome, String populacao, String dimensao) {
        this.iso = iso;
        this.nome = nome;
        this.populacao = populacao;
        this.dimensao = dimensao;
    }


    public String getIso() {
        return iso;
    }

    public void setIso(String iso) {
        this.iso = iso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPopulacao() {
        return populacao;
    }

    public void setPopulacao(String populacao) {
        this.populacao = populacao;
    }

    public String getDimensao() {
        return dimensao;
    }

    public void setDimensao(String dimensao) {
        this.dimensao = dimensao;
    }
    
    public boolean verificarPaisIgual(Pais b){
        if (getIso() == b.getIso()) {
            return true;
        }
        else {
            return false;
        }
    }

    public void addFronteira(){
        int b = teclado.leInt("Digite o código ISO: ");
        for (i = 0; i < this.fronteira.length; i++){
            if (this.fronteira[i] == 0) {
                this.fronteira[i] = b;
            }
        }
    }

    public void analisarLimitrofe(Pais b){
        int c = 0;
        for (i = 0; i < this.fronteira.length; i++){
            if (Objects.equals(this.fronteira[i], b.getIso())) {
                System.out.println("É um país limítrofe");
                c = 1;
                break;
            }
        }
        if (c == 0)
            System.out.println("Não é um país limítrofe");
    }

    public double calcularDensidade(){
        return (double) Integer.parseInt(this.populacao) / Integer.parseInt(this.dimensao);
    }

    public void paisesVizinhosIguais(Pais b){
        for (i = 0; i < this.fronteira.length; i++){
            if (Objects.equals(this.fronteira[i], b.getIso())) {
                System.out.println("A FAZER");
            }
        }
    }

    public void show() {
        System.out.println("");
        System.out.println("Nome: " + getNome());
        System.out.println("ISO: " + getIso());
        System.out.println("População: " + getPopulacao());
        System.out.println("Dimensao: " + getDimensao());
        System.out.println("Densidade: " + calcularDensidade() + " hab/km²");
        System.out.println("-----------------------------------");
    }

}
