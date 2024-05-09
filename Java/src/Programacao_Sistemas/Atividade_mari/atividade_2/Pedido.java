package Programacao_Sistemas.Atividade_mari.atividade_2;


public class Pedido {

    //*Definindo atributos da classe
    public int numero;
    public Produto item;
    public int quantidade;
    public double valor;

    //Criando Construtor
    public Pedido(int numero, Produto item, int quantidade){
        this.numero = numero;
        this.item = item;
        this.quantidade = quantidade;
    }
    //Armazena o valor do Pedido
    public void calculaPedido(){
        valor = (item.preco * quantidade);
    }

    //Mostra as informações tanto do Produto como do Pedido
    public String toString(){
        return "Número do Pedido : " + numero + "\n" +
                "Código do Produto : " + item.cod + "\n" +
                "Descrição : " + item.descricao + "\n" +
                "Preço do Produto : " + item.preco + "\n" +
                "Quantidade : " + quantidade + "\n" +
                "Valor total do pedido : " + valor;
    }
}

