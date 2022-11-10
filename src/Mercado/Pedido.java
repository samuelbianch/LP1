package Mercado;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private int id = 0;
    private int id_produto;
    private int quantidade_pedido;
    

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


    public int getQuantidade_pedido() {
        return quantidade_pedido;
    }


    public void setQuantidade_pedido(int quantidade_pedido) {
        this.quantidade_pedido = quantidade_pedido;
    }


    public Pedido (int id_produto, int quantidade_pedido) {
        this.id = this.id++;
        this.id_produto = id_produto;
        this.quantidade_pedido = quantidade_pedido;
    }

}
