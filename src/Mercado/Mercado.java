package Mercado;

import utils.Teclado;

public class Mercado {

    public static void main (String[] args){
        Teclado t = new Teclado();
        int escolha = 0;
        Produto p;
        Pedido pedido = new Pedido();
        int quantidade_produto = 0;
        int quantidade_pedido = 0;

        System.out.println("-------------------Faça seu pedido---------------");
        System.out.println("1 - Cadastrar produto");
        System.out.println("2 - Fazer pedido");
        System.out.println("3 - Excluir produto");
        System.out.println("4 - Atualizar produto");
        System.out.println("5 - Sair");
        System.out.println("-------------------------------------------");
        escolha = t.leInt("Digite sua opção: ");
    
        switch(escolha){
            case 1:
                p = new Produto(
                    t.leString("Nome: "),
                    t.leDouble("Digite o preco: "),
                    t.leInt("Digite a quantidade em estoque")
                );
                p.adicionaProduto(p);
                break;
            
            case 2:
                do{
                    int b = t.leInt("Digite o id do produto que deseja adicionar (para sair '-1')");
                    
                    pedido.adicionaProdutoNaCompra();
                }while(b =! -1);
                
                break;
        }
    }
    

    public void get_produto(int id){
        for (int i=0; i<p.length; i++){
           if ( p[i].id == id){
            
           }
        }
    }
}
