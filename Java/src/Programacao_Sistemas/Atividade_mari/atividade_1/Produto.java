package Programacao_Sistemas.Atividade_mari.atividade_1;

public class Produto {

    //Atributos
    public int codigo;
    public String descricao;
    private double preco;
    private int quantidade;

    //Getters
    public int getQuantidade(){
        return this.quantidade;
    }
    public int getCodigo(){
        return this.codigo;
    }
    public String getDescricao(){
        return this.descricao;
    }
    public double getPreco(){
        return this.preco;
    }

    //Setters
    public void setQuantidade(int valor){
        this.quantidade = valor;
    }
    public void setCodigo(int valor_codigo){
        this.codigo= valor_codigo;
    }
    public void setDescricao(String nova_descricao){
        this.descricao = nova_descricao;
    }
    public void setPreco(double preco_novo){
        this.preco = preco_novo;
    }

    public double calculaValor(){
        return (getPreco() * getQuantidade());
    }

    void exibir(){
        System.out.println("Código : " + codigo);
        System.out.println("Descrição  : " + descricao);
        System.out.println("Preço : " + preco);
        System.out.println("Quantidade : " + quantidade);

    }

}
