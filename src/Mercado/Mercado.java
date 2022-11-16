package Mercado;

import utils.Teclado;

public class Mercado_Backup {

    public static void main (String[] args){
        Teclado t = new Teclado();
        int escolha = 0;
        Produto[] p = new Produto[30];
        Item[] item = new Item[90];
        // Fazer o cadastrar pedido parecido com o do produto
        Pedido[] pedido = new Pedido[30];
        int quantidade_produto = 0;
        int quantidade_pedido = 0;
        int quantidade_item = 0;

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
                /// Cadastra um produto
                if(quantidade_produto == 0 ){
                    p[quantidade_produto] = new Produto(
                        t.leString("Nome: "),
                        t.leDouble("Digite o preco: "),
                        t.leInt("Digite a quantidade em estoque")
                    );
                }else {
                    for(int i=0; i<p.length; i++){
                        if(p[i] == null){
                            p[quantidade_produto] = new Produto(
                                t.leString("Nome: "),
                                t.leDouble("Digite o preco: "),
                                t.leInt("Digite a quantidade em estoque")
                            );
                            break;
                        }
                    }
                }
                quantidade_produto++;
                break;
            
            case 2:
                // Faz o pedido de um item
                if(quantidade_item == 0){
                    //item[quantidade_item] = new Item(quantidade_item,)
                }
                
                break;
        }
    }

    public void mostrarProduto(Produto produto){
        System.out.println("Id: " + produto.getId());
        System.out.println("Nome: " + produto.getNome());
        System.out.println("Preco: " + produto.getPreco());
        System.out.println("Quantidade Estoque: " + produto.getQuantidadeEstoque());
    }
}
