package Programacao_Sistemas.Atividade_mari.atividade_2;

public class Venda {
    public static void main(String[] args) {

        //Criando produto
        Produto produto1 = new Produto(1234, "caderno", 18.30);

        //Criando pedido
        Pedido pedido1 = new Pedido(58763, produto1, 500);

        //Chamando método para calcular valor do pedido
        pedido1.calculaPedido();

        //Imprimindo informações
        System.out.println("Informações do Pedido");
        System.out.println(pedido1.toString());
    }
}
