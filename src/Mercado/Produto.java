package Mercado;

public class Produto {

    private String nome;
    private double preco;
    private int quantidadeEstoque;
    private int codigoProduto;

    public int getCodigoProduto() {
        return codigoProduto;
    }
    public void setCodigoProduto(int codigoProduto) {
        this.codigoProduto = codigoProduto;
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

    public Produto(String nome, double preco, int quantidadeEstoque, int codigoProduto) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
        this.codigoProduto = codigoProduto;
    }

    public boolean confereEstoque(){
        if(getQuantidadeEstoque() > 0){
            return true;
        }else {
            return false;
        }
    }
}
