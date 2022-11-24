package Mercado;

public class Pedido {

    private Item[] itens = new Item[50];
    private double precoTotal;

    public double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
    }

    public void adicionaItem(Item item){
        
        for (int i = 0; i < itens.length; i++) {
            if (itens[i] == null) {
                itens[i] = item;
                setPrecoTotal(getPrecoTotal() + itens[i].setPrecoParcial());
                break;
            }
        }
    }

    @Override
    public String toString() {
        for (int i = 0; i < itens.length; i++) {
            if (itens[i] != null){
                return "Nome: " + itens[i].getProduto().getNome() + " | Quantidade: " + itens[i].getQuant() + " | Preço: " + itens[i].getPrecoItem();
            }
        }

        return null;
    }



}
