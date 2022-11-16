package Mercado;

import utils.Teclado;

public class Mercado {

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
                for(int i=0; i<p.length; i++){
                    mostrarProduto(p[i]);
                }
                
                int id_produto = t.leInt("Qual o id do produto que você deseja?");

                if (p[id_produto].confereEstoque() == true){
                    pedido[quantidade_pedido] = new Pedido(
                        id_produto,
                        t.leInt("Digite a quantidade desejada do produto")
                    );
                    item[quantidade_item] = new Item(
                        id_produto,
                        pedido[quantidade_pedido].getId_produto()
                    );
                }else {
                    System.out.println("Produto sem estoque");
                }
                break;
            
            case 3:
                int id = t.leInt("Digite o id do produto que deseja excluir do pedido");
        }
    
        
    }
    public static void mostrarProduto(Produto produto){
        System.out.println("-------------------------");
        System.out.println("Id: " + produto.getId());
        System.out.println("Nome: " + produto.getNome());
        System.out.println("Preco: " + produto.getPreco());
        System.out.println("Quantidade Estoque: " + produto.getQuantidadeEstoque());
    }
    
}
