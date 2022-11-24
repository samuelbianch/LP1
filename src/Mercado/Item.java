package Mercado;

public class Item {

    private Produto produto;
    private int quant;

    public Item(Produto produto, int quant) {
        this.produto = produto;
        this.quant = quant;
    }

    public Produto getProduto() {
        return produto;
    }
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    public int getQuant() {
        return quant;
    }
    public void setQuant(int quant) {
        this.quant = quant;
    }

    public double setPrecoParcial(){
        return produto.getPreco() * quant;
    }
    
    public void adicionaProduto(Produto produto){
        this.produto = produto;
    }
    
}
