package Mercado;

public class Pedido {

    private Item[] itens = new Item[50];
    private double precoTotal;
    private int cont = 0;

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

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
                setCont(getCont()+1);
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
