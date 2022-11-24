package Mercado;

public class Pedido {

    private Item itens[];
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
            }
        }
    }

}
