package Mercado;

public class Item {

    private int id;
    private int id_produto;
    private int id_pedido;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId_produto() {
        return id_produto;
    }
    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }
    public int getId_pedido() {
        return id_pedido;
    }
    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public Item (int id, int id_produto, int id_pedido){
        this.id = id;
        this.id_produto = id_produto;
        this.id_pedido = id_pedido;
    }
}
