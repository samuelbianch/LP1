package Mercado;

import utils.Teclado;

public class Main {
    public static void main(String[] args) {
        Produto[] produto = new Produto[30];
        Pedido pedido = new Pedido();
        Teclado t = new Teclado();
        Item item = new Item(null, 0);
        int resp = 1;
        
        do {
            System.out.println("-------------------Faça seu pedido---------------");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Fazer pedido");
            System.out.println("3 - Excluir produto");
            System.out.println("4 - Atualizar produto");
            System.out.println("5 - Sair");
            System.out.println("-------------------------------------------");
            resp = t.leInt("Digite sua opção: ");

            switch(resp){
                case 1:
                    for (int i = 0; i < produto.length; i++) {
                        if(produto[i] == null){
                            produto[i] = new Produto(
                                t.leString("Digite o nome do produto: "),
                                t.leDouble("Digite o preco: "),
                                t.leInt("Digite a quatidade em estoque: "),
                                t.leInt("Digite o codigo do produto: ")
                            );
                            break;
                        }
                    }
                    
                    break;

                case 2:
                    int codigoProduto = t.leInt("Digite o codigo do produto: ");
                    int quantidade = t.leInt("Digite a quantidade: ");
                    for (int i = 0; i < produto.length; i++) {
                        if(produto[i].getCodigoProduto() == codigoProduto){
                            item.setProduto(produto[i]);
                            produto[i].setQuantidadeEstoque(-1);
                            break;
                        }
                    }
                    item.setQuant(quantidade);
                    pedido.adicionaItem(item);

                case 3:
                    System.out.println(pedido.toString());
            }
        }while(resp != 5);
        
        
    }
    
}
