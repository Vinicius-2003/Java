public class Pedido{
    private int codigo_pedido;
    private String nome_cliente;
    private String descricao_pedido;
    private double valor_pedido;

    //Construtor
    public Pedido(int codigo_pedido, String nome_cliente, String descricao_pedido){
        this.codigo_pedido = codigo_pedido;
        this.nome_cliente = nome_cliente;
        this.descricao_pedido = descricao_pedido;
    }

    //Método
    public double valorImposto(int imposto){
        valor_pedido = (double)(valor_pedido*imposto)/100 + valor_pedido;
        return valor_pedido;
    }

    //Setters
    public void setCodigo_pedido(int codigo_pedido){
        this.codigo_pedido = codigo_pedido;
    }

    public void setNome_cliente(String nome_cliente){
        this.nome_cliente = nome_cliente;
    }

    public void setDescricao_pedido(String descricao_pedido){
        this.descricao_pedido = descricao_pedido;
    }

    public void setValor_pedido(double valor_pedido){
        this.valor_pedido = valor_pedido;
    }

    //Getters
    public int getCodigo_pedido(){
        return codigo_pedido;
    }
    public String getNome_cliente(){
        return nome_cliente;
    }
    public String getDescricao_pedido(){
        return descricao_pedido;
    }
    public double getValor_pedido(){
        return valor_pedido;
    }
}