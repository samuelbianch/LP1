package Mercado;

public class Produto {

    private int id = -1;
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }
    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.id = id++;
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void adicionaProduto(Produto produto){
        this.produto.add(this.id++, produto);
    }
}
